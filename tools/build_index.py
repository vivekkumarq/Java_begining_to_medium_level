"""Regenerates the solution index in README.md.

Run from the repo root:  python tools/build_index.py

It reads the .java files under LeetcodePractice/, groups them by the topic
map below, and rewrites whatever sits between the index markers in README.md.
Any file that is not in the topic map lands in "Other" and is printed as a
warning, so adding a new solution just means adding one line here.
"""

import os
import re
import subprocess
import sys

REPO_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
SRC_DIR = "LeetcodePractice"
README = os.path.join(REPO_ROOT, "README.md")
START = "<!-- index:start -->"
END = "<!-- index:end -->"

# topic -> class names (order here is the order in the README)
TOPICS = [
    ("Arrays", """
        ArrayPartition ConsecutieOdds ContainsDuplicate DuplicateZeros
        FairCandySwap HeightChecker KidsWithCandy KthMissingPositive
        LargestOddNumber MajorityElement MaxConsecutiveOnes MonotonicArray
        MoveZeroes RemoveElement ReplaceElementsWithGreatestOnRight
        SmallestNumber SortedSquares SpecialArray ThirdMaximumNumber
        TripletSequence ValidMountain BusShortestDistance DistanceBetweenArrays
        LargeGroupPositions MinimumStartValue SlowestKeyPress
    """),
    ("Strings", """
        AnagramChecker AreAlmostEqual AttendanceAward BalancedString
        BalancedStringPlaced BuddyStrings CheckOnesSegment
        ConsecutiveChar CountAsterisks CountBinarySubstrings DetectCapital
        FindTheDifference FirstOccurence GenerateTheString GetLuck GoatLatin
        HasValidSubstring IsLongPressedName IsPrefixString
        LengthOfLastWord LicenseKeyFormatting MaxVowelConsonantFrequency
        MinimumMovesToConvertString NumberOfSegments NumDifferenceInt
        OccurrencesAfterBigram RearrangeSpaces ReformatPhoneNumber
        ReformatString RemovePalindrome ReorderString RepeatedSubstringPattern
        ReverseOnlyLetters ReversePrefix ReverseStringII ReverseWords
        ReverseWordsInString SecondHighest ShortestDistanceToChar
        ShuffleString SortingTheSentence StringCompressor StringDivisor
        StringMatchingInArray StringReverse StringRotationCheck
        StrongPasswordChecker Chessboard CouponValidator MaxScoreSplit
    """),
    ("Hashing", """
        TwoSum ArrayDifference ArrayIntersection IntersectionOfTwoArraysII
        CheckIfPangram CloseStringsChecker CommonCharacters CountCharacters
        DestinationCity DistributeCandies EqualRowColumnPairs FirstUniqueChar
        GoodPairs GoodStringCheck HappyNumber IsPathCrossing IsomorphicStrings
        JewelsAndStones LongestPalindrome LongestSubstringBetweenEqualChars
        LuckyInteger MaxOperationsOnArray MinimumIndexSumOfTwoLists
        MostCommonWord OddStringDifference RankTransform RansomNoteChecker
        ReformatDate RomanToInteger SetMismatch
        ShortestCompletingWord ShortestSubArrayDegree SortFrequency
        SumOfUniqueElements UniqueEmails UniqueOccurrences WordPatternMatch
    """),
    ("Two pointers", """
        ContainerWithMostWater MergeAlternately
        MergeSortedArrays RemoveDuplicates SubsequenceChecker ThreeSum
        ThreeSumCloset ValidPalindrome ValidPalindromeII ReverseVowels
        MinDeletionSize
    """),
    ("Sliding window", """
        LongestSubarrayAfterDeletingOne LongestSubstringwithoutRepeating
        MaxAvgSubArray MaxConsecutiveOnesIII MaxVowels PermutationFromString
        KBeautyOfNumber
    """),
    ("Prefix sum", """
        HighestAltitude PivotIndexFinder ProductOfArrayExceptSelf RunningSum
    """),
    ("Stack and queue", """
        AsteroidCollision Backspace BaseballGame DailyTemperatures DecodeString
        DotaSenate MakeStringGreat NextGreaterElement RemoveDuplicatess
        RemoveOuterParentheses RemoveStarsFromString ValidParanthesis
        MaxDepth StackCollection
    """),
    ("Binary search", """
        BinarySearch GuessGame KokoEatingBananas MedianOfTwoSortedArrays
        PeakElement SearchInsert SearchRange SquareRoot SuccessfulPairs
        SearchSuggestionSystem
    """),
    ("Sorting and greedy", """
        AssignCookies LargestNum MaximumUnitsOnTruck
        MinimumArrowsToBurstBalloons NonOverlappingIntervals RelativeRanks
        TrianglePerimeter JumpGame
    """),
    ("Heap", """
        HiringWorkers KthLargestElement MaxScoreSubsequence
    """),
    ("Linked lists", """
        DeleteMiddleNode MergeTwoLists OddEvenLinkedList PairSum ReverseLinked
    """),
    ("Trees", """
        DeleteNodeBST GoodNodesInBinaryTree LeafSimilarTrees LongestZigZagPath
        LowestCommonAncestor MaxDepthBinaryTree MaxLevelSumBinaryTree
        PathSumIII RightSideView RootToLeafPaths SearchBST
    """),
    ("Graphs, BFS and DFS", """
        EvaluateDivision FlowerPlanting IslandPerimeter NearestExitInMaze
        NumberOfProvinces ReorderRoutes RottingOranges TownJudge VisitAllRooms
    """),
    ("Backtracking", """
        CombinationSum CombinationSum3 LetterCombinations WordSearch
        CountGoodTriplets
    """),
    ("Dynamic programming", """
        EditDistance HouseRobber LongestCommonSubsequence MinCostClimbingStairs
        StockWithTransactionFee TilingDominoTromino Tribonacci UniquePaths
        BestTimeToBuyAndSellStock
    """),
    ("Math and bit manipulation", """
        AddBinary AddStrings AddToArrayForm BinaryDate BitwiseFlipCounter
        ConvertToBaseSeven CountBits DayOfYear DaysBetweenDates
        DivideTwoIntegers ExcelColumnNumber ExcelColumnTitle FizzBuzz
        IntegerToRoman MissingNumber MultiplyStrings MyAtoi PalindromeNumber
        PlusOne Power ReverseInteger SingleNumber SmallestRangeI
        ThousandSeperator RotateMatrix
    """),
    ("Design", """
        MyHashMap PriorityQueueCollection RecentCounter SmallestInfiniteSet
        StockSpanner Trie
    """),
]

# where the CamelCase split does not give a sensible problem name
NAME_OVERRIDES = {
    "ConsecutieOdds": "Three Consecutive Odds",
    "ThreeSumCloset": "3Sum Closest",
    "ThreeSum": "3Sum",
    "ThousandSeperator": "Thousand Separator",
    "FirstOccurence": "Find the Index of the First Occurrence in a String",
    "ValidParanthesis": "Valid Parentheses",
    "CheckOnesSegment": "Binary String With at Most One Segment of Ones",
    "RemoveDuplicatess": "Remove All Adjacent Duplicates in String",
    "MaxDepth": "Maximum Nesting Depth of the Parentheses",
    "MyAtoi": "String to Integer (atoi)",
    "MyHashMap": "Design HashMap",
    "PairSum": "Maximum Twin Sum of a Linked List",
    "LongestSubstringwithoutRepeating": "Longest Substring Without Repeating Characters",
    "NumDifferenceInt": "Number of Different Integers in a String",
    "GetLuck": "Sum of Digits of String After Convert",
    "StringDivisor": "Greatest Common Divisor of Strings",
    "DotaSenate": "Dota2 Senate",
    "PivotIndexFinder": "Find Pivot Index",
    "StackCollection": "Stack (practice with the collection)",
    "PriorityQueueCollection": "PriorityQueue (practice with the collection)",
}

SMALL_WORDS = {"of", "the", "in", "to", "a", "an", "and", "with", "on", "at", "for", "from"}


def pretty(name):
    if name in NAME_OVERRIDES:
        return NAME_OVERRIDES[name]
    s = re.sub(r"(?<=[a-z0-9])(?=[A-Z])", " ", name)
    s = re.sub(r"(?<=[A-Z])(?=[A-Z][a-z])", " ", s)
    words = s.split()
    out = []
    for i, w in enumerate(words):
        out.append(w.lower() if i and w.lower() in SMALL_WORDS else w)
    return " ".join(out)


def main():
    # ask git rather than the filesystem, so stray untracked scratch files and
    # leftovers from case-only renames stay out of the index
    listing = subprocess.check_output(
        ["git", "ls-files", SRC_DIR + "/*.java"], cwd=REPO_ROOT).decode()
    on_disk = sorted(os.path.basename(line)[:-5]
                     for line in listing.split("\n") if line.strip())

    assigned = {}
    for topic, blob in TOPICS:
        for cls in blob.split():
            if cls in assigned:
                print("warning: %s listed twice (%s, %s)" % (cls, assigned[cls], topic))
            assigned[cls] = topic

    missing = [c for c in assigned if c not in on_disk]
    if missing:
        print("warning: in the topic map but not on disk: %s" % ", ".join(sorted(missing)))

    buckets = {topic: [] for topic, _ in TOPICS}
    other = []
    for cls in on_disk:
        topic = assigned.get(cls)
        if topic is None:
            other.append(cls)
        else:
            buckets[topic].append(cls)
    if other:
        print("warning: not in the topic map, filed under Other: %s" % ", ".join(other))

    lines = []
    order = [t for t, _ in TOPICS]
    if other:
        buckets["Other"] = other
        order.append("Other")

    total = len(on_disk)
    lines.append("%d solutions, grouped by the main technique each one uses." % total)
    lines.append("")
    lines.append(" | ".join("[%s](#%s)" % (t, t.lower().replace(",", "").replace(" ", "-"))
                            for t in order))
    lines.append("")
    for topic in order:
        items = sorted(buckets[topic], key=lambda c: pretty(c).lower())
        if not items:
            continue
        lines.append("### %s" % topic)
        lines.append("")
        lines.append("| Problem | Solution |")
        lines.append("| --- | --- |")
        for cls in items:
            lines.append("| %s | [%s.java](%s/%s.java) |" % (pretty(cls), cls, SRC_DIR, cls))
        lines.append("")

    body = "\n".join(lines).rstrip() + "\n"

    with open(README, encoding="utf-8") as fh:
        readme = fh.read()
    if START not in readme or END not in readme:
        print("error: index markers missing from README.md")
        return 1
    head, rest = readme.split(START, 1)
    _, tail = rest.split(END, 1)
    with open(README, "w", encoding="utf-8", newline="\n") as fh:
        fh.write(head + START + "\n\n" + body + "\n" + END + tail)
    print("wrote index for %d files" % total)
    return 0


if __name__ == "__main__":
    sys.exit(main())
