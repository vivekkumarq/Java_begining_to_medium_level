# Java: From Beginning to Medium Level

My Java practice repository. It is a running log of what I have worked through
while learning the language: small programs covering the basics, notes on the
collections framework, and a growing pile of LeetCode solutions.

Nothing here is a library or a framework. Each file is self contained, has a
`main` with the example cases from the problem, and can be run on its own.

## Layout

    Java_DailyLearningPractice/   day to day language practice
    LeetcodePractice/             one file per LeetCode problem
    tools/build_index.py          regenerates the index below

`Java_DailyLearningPractice/` is the basics: syntax, loops, a calculator, and a
short tour of `ArrayList`, `HashSet`, `HashMap`, `ArrayDeque`, `LinkedList` and
`PriorityQueue`. A few classic problems (longest common prefix, longest
palindromic substring, Pascal's triangle) ended up here before I started the
LeetCode folder.

`LeetcodePractice/` is everything else, indexed by topic below.

## Running a solution

Both folders are packages, so compile from the repository root:

    javac -d out LeetcodePractice/TwoSum.java
    java -cp out LeetcodePractice.TwoSum

Or build everything at once:

    javac -d out LeetcodePractice/*.java Java_DailyLearningPractice/*.java

## Solutions by topic

<!-- index:start -->

241 solutions, grouped by the main technique each one uses.

[Arrays](#arrays) | [Strings](#strings) | [Hashing](#hashing) | [Two pointers](#two-pointers) | [Sliding window](#sliding-window) | [Prefix sum](#prefix-sum) | [Stack and queue](#stack-and-queue) | [Binary search](#binary-search) | [Sorting and greedy](#sorting-and-greedy) | [Heap](#heap) | [Linked lists](#linked-lists) | [Trees](#trees) | [Graphs, BFS and DFS](#graphs-bfs-and-dfs) | [Backtracking](#backtracking) | [Dynamic programming](#dynamic-programming) | [Math and bit manipulation](#math-and-bit-manipulation) | [Design](#design)

### Arrays

| Problem | Solution |
| --- | --- |
| Array Partition | [ArrayPartition.java](LeetcodePractice/ArrayPartition.java) |
| Bus Shortest Distance | [BusShortestDistance.java](LeetcodePractice/BusShortestDistance.java) |
| Contains Duplicate | [ContainsDuplicate.java](LeetcodePractice/ContainsDuplicate.java) |
| Distance Between Arrays | [DistanceBetweenArrays.java](LeetcodePractice/DistanceBetweenArrays.java) |
| Duplicate Zeros | [DuplicateZeros.java](LeetcodePractice/DuplicateZeros.java) |
| Fair Candy Swap | [FairCandySwap.java](LeetcodePractice/FairCandySwap.java) |
| Height Checker | [HeightChecker.java](LeetcodePractice/HeightChecker.java) |
| Kids with Candy | [KidsWithCandy.java](LeetcodePractice/KidsWithCandy.java) |
| Kth Missing Positive | [KthMissingPositive.java](LeetcodePractice/KthMissingPositive.java) |
| Large Group Positions | [LargeGroupPositions.java](LeetcodePractice/LargeGroupPositions.java) |
| Largest Odd Number | [LargestOddNumber.java](LeetcodePractice/LargestOddNumber.java) |
| Majority Element | [MajorityElement.java](LeetcodePractice/MajorityElement.java) |
| Max Consecutive Ones | [MaxConsecutiveOnes.java](LeetcodePractice/MaxConsecutiveOnes.java) |
| Minimum Start Value | [MinimumStartValue.java](LeetcodePractice/MinimumStartValue.java) |
| Monotonic Array | [MonotonicArray.java](LeetcodePractice/MonotonicArray.java) |
| Move Zeroes | [MoveZeroes.java](LeetcodePractice/MoveZeroes.java) |
| Remove Element | [RemoveElement.java](LeetcodePractice/RemoveElement.java) |
| Replace Elements with Greatest on Right | [ReplaceElementsWithGreatestOnRight.java](LeetcodePractice/ReplaceElementsWithGreatestOnRight.java) |
| Slowest Key Press | [SlowestKeyPress.java](LeetcodePractice/SlowestKeyPress.java) |
| Smallest Number | [SmallestNumber.java](LeetcodePractice/SmallestNumber.java) |
| Sorted Squares | [SortedSquares.java](LeetcodePractice/SortedSquares.java) |
| Special Array | [SpecialArray.java](LeetcodePractice/SpecialArray.java) |
| Third Maximum Number | [ThirdMaximumNumber.java](LeetcodePractice/ThirdMaximumNumber.java) |
| Three Consecutive Odds | [ConsecutieOdds.java](LeetcodePractice/ConsecutieOdds.java) |
| Triplet Sequence | [TripletSequence.java](LeetcodePractice/TripletSequence.java) |
| Valid Mountain | [ValidMountain.java](LeetcodePractice/ValidMountain.java) |

### Strings

| Problem | Solution |
| --- | --- |
| Anagram Checker | [AnagramChecker.java](LeetcodePractice/AnagramChecker.java) |
| Are Almost Equal | [AreAlmostEqual.java](LeetcodePractice/AreAlmostEqual.java) |
| Attendance Award | [AttendanceAward.java](LeetcodePractice/AttendanceAward.java) |
| Balanced String | [BalancedString.java](LeetcodePractice/BalancedString.java) |
| Balanced String Placed | [BalancedStringPlaced.java](LeetcodePractice/BalancedStringPlaced.java) |
| Binary String With at Most One Segment of Ones | [CheckOnesSegment.java](LeetcodePractice/CheckOnesSegment.java) |
| Buddy Strings | [BuddyStrings.java](LeetcodePractice/BuddyStrings.java) |
| Chessboard | [Chessboard.java](LeetcodePractice/Chessboard.java) |
| Consecutive Char | [ConsecutiveChar.java](LeetcodePractice/ConsecutiveChar.java) |
| Count Asterisks | [CountAsterisks.java](LeetcodePractice/CountAsterisks.java) |
| Count Binary Substrings | [CountBinarySubstrings.java](LeetcodePractice/CountBinarySubstrings.java) |
| Coupon Validator | [CouponValidator.java](LeetcodePractice/CouponValidator.java) |
| Detect Capital | [DetectCapital.java](LeetcodePractice/DetectCapital.java) |
| Find the Difference | [FindTheDifference.java](LeetcodePractice/FindTheDifference.java) |
| Find the Index of the First Occurrence in a String | [FirstOccurence.java](LeetcodePractice/FirstOccurence.java) |
| Generate the String | [GenerateTheString.java](LeetcodePractice/GenerateTheString.java) |
| Goat Latin | [GoatLatin.java](LeetcodePractice/GoatLatin.java) |
| Greatest Common Divisor of Strings | [StringDivisor.java](LeetcodePractice/StringDivisor.java) |
| Has Valid Substring | [HasValidSubstring.java](LeetcodePractice/HasValidSubstring.java) |
| Is Long Pressed Name | [IsLongPressedName.java](LeetcodePractice/IsLongPressedName.java) |
| Is Prefix String | [IsPrefixString.java](LeetcodePractice/IsPrefixString.java) |
| Last Word Length | [LastWordLength.java](LeetcodePractice/LastWordLength.java) |
| Length of Last Word | [LengthOfLastWord.java](LeetcodePractice/LengthOfLastWord.java) |
| License Key Formatting | [LicenseKeyFormatting.java](LeetcodePractice/LicenseKeyFormatting.java) |
| Max Score Split | [MaxScoreSplit.java](LeetcodePractice/MaxScoreSplit.java) |
| Max Vowel Consonant Frequency | [MaxVowelConsonantFrequency.java](LeetcodePractice/MaxVowelConsonantFrequency.java) |
| Minimum Moves to Convert String | [MinimumMovesToConvertString.java](LeetcodePractice/MinimumMovesToConvertString.java) |
| Number of Different Integers in a String | [NumDifferenceInt.java](LeetcodePractice/NumDifferenceInt.java) |
| Number of Segments | [NumberOfSegments.java](LeetcodePractice/NumberOfSegments.java) |
| Occurrences After Bigram | [OccurrencesAfterBigram.java](LeetcodePractice/OccurrencesAfterBigram.java) |
| Rearrange Spaces | [RearrangeSpaces.java](LeetcodePractice/RearrangeSpaces.java) |
| Reformat Phone Number | [ReformatPhoneNumber.java](LeetcodePractice/ReformatPhoneNumber.java) |
| Reformat String | [ReformatString.java](LeetcodePractice/ReformatString.java) |
| Remove Palindrome | [RemovePalindrome.java](LeetcodePractice/RemovePalindrome.java) |
| Reorder String | [ReorderString.java](LeetcodePractice/ReorderString.java) |
| Repeated Substring Pattern | [RepeatedSubstringPattern.java](LeetcodePractice/RepeatedSubstringPattern.java) |
| Reverse Only Letters | [ReverseOnlyLetters.java](LeetcodePractice/ReverseOnlyLetters.java) |
| Reverse Prefix | [ReversePrefix.java](LeetcodePractice/ReversePrefix.java) |
| Reverse String II | [ReverseStringII.java](LeetcodePractice/ReverseStringII.java) |
| Reverse Words | [ReverseWords.java](LeetcodePractice/ReverseWords.java) |
| Reverse Words in String | [ReverseWordsInString.java](LeetcodePractice/ReverseWordsInString.java) |
| Second Highest | [SecondHighest.java](LeetcodePractice/SecondHighest.java) |
| Shortest Distance to Char | [ShortestDistanceToChar.java](LeetcodePractice/ShortestDistanceToChar.java) |
| Shuffle String | [ShuffleString.java](LeetcodePractice/ShuffleString.java) |
| Sorting the Sentence | [SortingTheSentence.java](LeetcodePractice/SortingTheSentence.java) |
| String Compressor | [StringCompressor.java](LeetcodePractice/StringCompressor.java) |
| String Matching in Array | [StringMatchingInArray.java](LeetcodePractice/StringMatchingInArray.java) |
| String Reverse | [StringReverse.java](LeetcodePractice/StringReverse.java) |
| String Rotation Check | [StringRotationCheck.java](LeetcodePractice/StringRotationCheck.java) |
| Strong Password Checker | [StrongPasswordChecker.java](LeetcodePractice/StrongPasswordChecker.java) |
| Sum of Digits of String After Convert | [GetLuck.java](LeetcodePractice/GetLuck.java) |

### Hashing

| Problem | Solution |
| --- | --- |
| Array Difference | [ArrayDifference.java](LeetcodePractice/ArrayDifference.java) |
| Array Intersection | [ArrayIntersection.java](LeetcodePractice/ArrayIntersection.java) |
| Check If Pangram | [CheckIfPangram.java](LeetcodePractice/CheckIfPangram.java) |
| Close Strings Checker | [CloseStringsChecker.java](LeetcodePractice/CloseStringsChecker.java) |
| Common Characters | [CommonCharacters.java](LeetcodePractice/CommonCharacters.java) |
| Count Characters | [CountCharacters.java](LeetcodePractice/CountCharacters.java) |
| Destination City | [DestinationCity.java](LeetcodePractice/DestinationCity.java) |
| Distribute Candies | [DistributeCandies.java](LeetcodePractice/DistributeCandies.java) |
| Equal Row Column Pairs | [EqualRowColumnPairs.java](LeetcodePractice/EqualRowColumnPairs.java) |
| First Unique Char | [FirstUniqueChar.java](LeetcodePractice/FirstUniqueChar.java) |
| Good Pairs | [GoodPairs.java](LeetcodePractice/GoodPairs.java) |
| Good String Check | [GoodStringCheck.java](LeetcodePractice/GoodStringCheck.java) |
| Happy Number | [HappyNumber.java](LeetcodePractice/HappyNumber.java) |
| Intersection of Two Arrays II | [IntersectionOfTwoArraysII.java](LeetcodePractice/IntersectionOfTwoArraysII.java) |
| Is Path Crossing | [IsPathCrossing.java](LeetcodePractice/IsPathCrossing.java) |
| Isomorphic Strings | [IsomorphicStrings.java](LeetcodePractice/IsomorphicStrings.java) |
| Jewels and Stones | [JewelsAndStones.java](LeetcodePractice/JewelsAndStones.java) |
| Longest Palindrome | [LongestPalindrome.java](LeetcodePractice/LongestPalindrome.java) |
| Longest Substring Between Equal Chars | [LongestSubstringBetweenEqualChars.java](LeetcodePractice/LongestSubstringBetweenEqualChars.java) |
| Lucky Integer | [LuckyInteger.java](LeetcodePractice/LuckyInteger.java) |
| Max Operations on Array | [MaxOperationsOnArray.java](LeetcodePractice/MaxOperationsOnArray.java) |
| Minimum Index Sum of Two Lists | [MinimumIndexSumOfTwoLists.java](LeetcodePractice/MinimumIndexSumOfTwoLists.java) |
| Most Common Word | [MostCommonWord.java](LeetcodePractice/MostCommonWord.java) |
| Odd String Difference | [OddStringDifference.java](LeetcodePractice/OddStringDifference.java) |
| Rank Transform | [RankTransform.java](LeetcodePractice/RankTransform.java) |
| Ransom Note Checker | [RansomNoteChecker.java](LeetcodePractice/RansomNoteChecker.java) |
| Reformat Date | [ReformatDate.java](LeetcodePractice/ReformatDate.java) |
| Roman to Integer | [RomanToInteger.java](LeetcodePractice/RomanToInteger.java) |
| Set Mismatch | [SetMismatch.java](LeetcodePractice/SetMismatch.java) |
| Shortest Completing Word | [ShortestCompletingWord.java](LeetcodePractice/ShortestCompletingWord.java) |
| Shortest Sub Array Degree | [ShortestSubArrayDegree.java](LeetcodePractice/ShortestSubArrayDegree.java) |
| Sort Frequency | [SortFrequency.java](LeetcodePractice/SortFrequency.java) |
| Sum of Unique Elements | [SumOfUniqueElements.java](LeetcodePractice/SumOfUniqueElements.java) |
| Two Sum | [TwoSum.java](LeetcodePractice/TwoSum.java) |
| Unique Emails | [UniqueEmails.java](LeetcodePractice/UniqueEmails.java) |
| Unique Occurrences | [UniqueOccurrences.java](LeetcodePractice/UniqueOccurrences.java) |
| Word Pattern Match | [WordPatternMatch.java](LeetcodePractice/WordPatternMatch.java) |

### Two pointers

| Problem | Solution |
| --- | --- |
| 3Sum | [ThreeSum.java](LeetcodePractice/ThreeSum.java) |
| 3Sum Closest | [ThreeSumCloset.java](LeetcodePractice/ThreeSumCloset.java) |
| Container with Most Water | [ContainerWithMostWater.java](LeetcodePractice/ContainerWithMostWater.java) |
| Merge Alternately | [MergeAlternately.java](LeetcodePractice/MergeAlternately.java) |
| Merge Sorted Arrays | [MergeSortedArrays.java](LeetcodePractice/MergeSortedArrays.java) |
| Min Deletion Size | [MinDeletionSize.java](LeetcodePractice/MinDeletionSize.java) |
| Remove Duplicates | [RemoveDuplicates.java](LeetcodePractice/RemoveDuplicates.java) |
| Reverse Vowels | [ReverseVowels.java](LeetcodePractice/ReverseVowels.java) |
| Subsequence Checker | [SubsequenceChecker.java](LeetcodePractice/SubsequenceChecker.java) |
| Valid Palindrome | [ValidPalindrome.java](LeetcodePractice/ValidPalindrome.java) |
| Valid Palindrome II | [ValidPalindromeII.java](LeetcodePractice/ValidPalindromeII.java) |

### Sliding window

| Problem | Solution |
| --- | --- |
| K Beauty of Number | [KBeautyOfNumber.java](LeetcodePractice/KBeautyOfNumber.java) |
| Longest Subarray After Deleting One | [LongestSubarrayAfterDeletingOne.java](LeetcodePractice/LongestSubarrayAfterDeletingOne.java) |
| Longest Substring Without Repeating Characters | [LongestSubstringwithoutRepeating.java](LeetcodePractice/LongestSubstringwithoutRepeating.java) |
| Max Avg Sub Array | [MaxAvgSubArray.java](LeetcodePractice/MaxAvgSubArray.java) |
| Max Consecutive Ones III | [MaxConsecutiveOnesIII.java](LeetcodePractice/MaxConsecutiveOnesIII.java) |
| Max Vowels | [MaxVowels.java](LeetcodePractice/MaxVowels.java) |
| Permutation from String | [PermutationFromString.java](LeetcodePractice/PermutationFromString.java) |

### Prefix sum

| Problem | Solution |
| --- | --- |
| Find Pivot Index | [PivotIndexFinder.java](LeetcodePractice/PivotIndexFinder.java) |
| Highest Altitude | [HighestAltitude.java](LeetcodePractice/HighestAltitude.java) |
| Product of Array Except Self | [ProductOfArrayExceptSelf.java](LeetcodePractice/ProductOfArrayExceptSelf.java) |
| Running Sum | [RunningSum.java](LeetcodePractice/RunningSum.java) |

### Stack and queue

| Problem | Solution |
| --- | --- |
| Asteroid Collision | [AsteroidCollision.java](LeetcodePractice/AsteroidCollision.java) |
| Backspace | [Backspace.java](LeetcodePractice/Backspace.java) |
| Baseball Game | [BaseballGame.java](LeetcodePractice/BaseballGame.java) |
| Daily Temperatures | [DailyTemperatures.java](LeetcodePractice/DailyTemperatures.java) |
| Decode String | [DecodeString.java](LeetcodePractice/DecodeString.java) |
| Dota2 Senate | [DotaSenate.java](LeetcodePractice/DotaSenate.java) |
| Make String Great | [MakeStringGreat.java](LeetcodePractice/MakeStringGreat.java) |
| Maximum Nesting Depth of the Parentheses | [MaxDepth.java](LeetcodePractice/MaxDepth.java) |
| Next Greater Element | [NextGreaterElement.java](LeetcodePractice/NextGreaterElement.java) |
| Remove All Adjacent Duplicates in String | [RemoveDuplicatess.java](LeetcodePractice/RemoveDuplicatess.java) |
| Remove Outer Parentheses | [RemoveOuterParentheses.java](LeetcodePractice/RemoveOuterParentheses.java) |
| Remove Stars from String | [RemoveStarsFromString.java](LeetcodePractice/RemoveStarsFromString.java) |
| Stack (practice with the collection) | [StackCollection.java](LeetcodePractice/StackCollection.java) |
| Valid Parentheses | [ValidParanthesis.java](LeetcodePractice/ValidParanthesis.java) |

### Binary search

| Problem | Solution |
| --- | --- |
| Binary Search | [BinarySearch.java](LeetcodePractice/BinarySearch.java) |
| Guess Game | [GuessGame.java](LeetcodePractice/GuessGame.java) |
| Koko Eating Bananas | [KokoEatingBananas.java](LeetcodePractice/KokoEatingBananas.java) |
| Median of Two Sorted Arrays | [MedianOfTwoSortedArrays.java](LeetcodePractice/MedianOfTwoSortedArrays.java) |
| Peak Element | [PeakElement.java](LeetcodePractice/PeakElement.java) |
| Search Insert | [SearchInsert.java](LeetcodePractice/SearchInsert.java) |
| Search Range | [SearchRange.java](LeetcodePractice/SearchRange.java) |
| Search Suggestion System | [SearchSuggestionSystem.java](LeetcodePractice/SearchSuggestionSystem.java) |
| Square Root | [SquareRoot.java](LeetcodePractice/SquareRoot.java) |
| Successful Pairs | [SuccessfulPairs.java](LeetcodePractice/SuccessfulPairs.java) |

### Sorting and greedy

| Problem | Solution |
| --- | --- |
| Assign Cookies | [AssignCookies.java](LeetcodePractice/AssignCookies.java) |
| Jump Game | [JumpGame.java](LeetcodePractice/JumpGame.java) |
| Largest Num | [LargestNum.java](LeetcodePractice/LargestNum.java) |
| Maximum Units on Truck | [MaximumUnitsOnTruck.java](LeetcodePractice/MaximumUnitsOnTruck.java) |
| Minimum Arrows to Burst Balloons | [MinimumArrowsToBurstBalloons.java](LeetcodePractice/MinimumArrowsToBurstBalloons.java) |
| Non Overlapping Intervals | [NonOverlappingIntervals.java](LeetcodePractice/NonOverlappingIntervals.java) |
| Relative Ranks | [RelativeRanks.java](LeetcodePractice/RelativeRanks.java) |
| Triangle Perimeter | [TrianglePerimeter.java](LeetcodePractice/TrianglePerimeter.java) |

### Heap

| Problem | Solution |
| --- | --- |
| Hiring Workers | [HiringWorkers.java](LeetcodePractice/HiringWorkers.java) |
| Kth Largest Element | [KthLargestElement.java](LeetcodePractice/KthLargestElement.java) |
| Max Score Subsequence | [MaxScoreSubsequence.java](LeetcodePractice/MaxScoreSubsequence.java) |

### Linked lists

| Problem | Solution |
| --- | --- |
| Delete Middle Node | [DeleteMiddleNode.java](LeetcodePractice/DeleteMiddleNode.java) |
| Maximum Twin Sum of a Linked List | [PairSum.java](LeetcodePractice/PairSum.java) |
| Merge Two Lists | [MergeTwoLists.java](LeetcodePractice/MergeTwoLists.java) |
| Odd Even Linked List | [OddEvenLinkedList.java](LeetcodePractice/OddEvenLinkedList.java) |
| Reverse Linked | [ReverseLinked.java](LeetcodePractice/ReverseLinked.java) |

### Trees

| Problem | Solution |
| --- | --- |
| Delete Node BST | [DeleteNodeBST.java](LeetcodePractice/DeleteNodeBST.java) |
| Good Nodes in Binary Tree | [GoodNodesInBinaryTree.java](LeetcodePractice/GoodNodesInBinaryTree.java) |
| Leaf Similar Trees | [LeafSimilarTrees.java](LeetcodePractice/LeafSimilarTrees.java) |
| Longest Zig Zag Path | [LongestZigZagPath.java](LeetcodePractice/LongestZigZagPath.java) |
| Lowest Common Ancestor | [LowestCommonAncestor.java](LeetcodePractice/LowestCommonAncestor.java) |
| Max Depth Binary Tree | [MaxDepthBinaryTree.java](LeetcodePractice/MaxDepthBinaryTree.java) |
| Max Level Sum Binary Tree | [MaxLevelSumBinaryTree.java](LeetcodePractice/MaxLevelSumBinaryTree.java) |
| Path Sum III | [PathSumIII.java](LeetcodePractice/PathSumIII.java) |
| Right Side View | [RightSideView.java](LeetcodePractice/RightSideView.java) |
| Root to Leaf Paths | [RootToLeafPaths.java](LeetcodePractice/RootToLeafPaths.java) |
| Search BST | [SearchBST.java](LeetcodePractice/SearchBST.java) |

### Graphs, BFS and DFS

| Problem | Solution |
| --- | --- |
| Evaluate Division | [EvaluateDivision.java](LeetcodePractice/EvaluateDivision.java) |
| Flower Planting | [FlowerPlanting.java](LeetcodePractice/FlowerPlanting.java) |
| Island Perimeter | [IslandPerimeter.java](LeetcodePractice/IslandPerimeter.java) |
| Nearest Exit in Maze | [NearestExitInMaze.java](LeetcodePractice/NearestExitInMaze.java) |
| Number of Provinces | [NumberOfProvinces.java](LeetcodePractice/NumberOfProvinces.java) |
| Reorder Routes | [ReorderRoutes.java](LeetcodePractice/ReorderRoutes.java) |
| Rotting Oranges | [RottingOranges.java](LeetcodePractice/RottingOranges.java) |
| Town Judge | [TownJudge.java](LeetcodePractice/TownJudge.java) |
| Visit All Rooms | [VisitAllRooms.java](LeetcodePractice/VisitAllRooms.java) |

### Backtracking

| Problem | Solution |
| --- | --- |
| Combination Sum | [CombinationSum.java](LeetcodePractice/CombinationSum.java) |
| Combination Sum3 | [CombinationSum3.java](LeetcodePractice/CombinationSum3.java) |
| Count Good Triplets | [CountGoodTriplets.java](LeetcodePractice/CountGoodTriplets.java) |
| Letter Combinations | [LetterCombinations.java](LeetcodePractice/LetterCombinations.java) |
| Word Search | [WordSearch.java](LeetcodePractice/WordSearch.java) |

### Dynamic programming

| Problem | Solution |
| --- | --- |
| Best Time to Buy and Sell Stock | [BestTimeToBuyAndSellStock.java](LeetcodePractice/BestTimeToBuyAndSellStock.java) |
| Edit Distance | [EditDistance.java](LeetcodePractice/EditDistance.java) |
| House Robber | [HouseRobber.java](LeetcodePractice/HouseRobber.java) |
| Longest Common Subsequence | [LongestCommonSubsequence.java](LeetcodePractice/LongestCommonSubsequence.java) |
| Min Cost Climbing Stairs | [MinCostClimbingStairs.java](LeetcodePractice/MinCostClimbingStairs.java) |
| Stock with Transaction Fee | [StockWithTransactionFee.java](LeetcodePractice/StockWithTransactionFee.java) |
| Tiling Domino Tromino | [TilingDominoTromino.java](LeetcodePractice/TilingDominoTromino.java) |
| Tribonacci | [Tribonacci.java](LeetcodePractice/Tribonacci.java) |
| Unique Paths | [UniquePaths.java](LeetcodePractice/UniquePaths.java) |

### Math and bit manipulation

| Problem | Solution |
| --- | --- |
| Add Binary | [AddBinary.java](LeetcodePractice/AddBinary.java) |
| Add Strings | [AddStrings.java](LeetcodePractice/AddStrings.java) |
| Add to Array Form | [AddToArrayForm.java](LeetcodePractice/AddToArrayForm.java) |
| Binary Date | [BinaryDate.java](LeetcodePractice/BinaryDate.java) |
| Bitwise Flip Counter | [BitwiseFlipCounter.java](LeetcodePractice/BitwiseFlipCounter.java) |
| Convert to Base Seven | [ConvertToBaseSeven.java](LeetcodePractice/ConvertToBaseSeven.java) |
| Count Bits | [CountBits.java](LeetcodePractice/CountBits.java) |
| Day of Year | [DayOfYear.java](LeetcodePractice/DayOfYear.java) |
| Days Between Dates | [DaysBetweenDates.java](LeetcodePractice/DaysBetweenDates.java) |
| Divide Two Integers | [DivideTwoIntegers.java](LeetcodePractice/DivideTwoIntegers.java) |
| Excel Column Number | [ExcelColumnNumber.java](LeetcodePractice/ExcelColumnNumber.java) |
| Excel Column Title | [ExcelColumnTitle.java](LeetcodePractice/ExcelColumnTitle.java) |
| Fizz Buzz | [FizzBuzz.java](LeetcodePractice/FizzBuzz.java) |
| Integer to Roman | [IntegerToRoman.java](LeetcodePractice/IntegerToRoman.java) |
| Missing Number | [MissingNumber.java](LeetcodePractice/MissingNumber.java) |
| Multiply Strings | [MultiplyStrings.java](LeetcodePractice/MultiplyStrings.java) |
| Palindrome Number | [PalindromeNumber.java](LeetcodePractice/PalindromeNumber.java) |
| Plus One | [PlusOne.java](LeetcodePractice/PlusOne.java) |
| Power | [Power.java](LeetcodePractice/Power.java) |
| Reverse Integer | [ReverseInteger.java](LeetcodePractice/ReverseInteger.java) |
| Rotate Matrix | [RotateMatrix.java](LeetcodePractice/RotateMatrix.java) |
| Single Number | [SingleNumber.java](LeetcodePractice/SingleNumber.java) |
| Smallest Range I | [SmallestRangeI.java](LeetcodePractice/SmallestRangeI.java) |
| String to Integer (atoi) | [MyAtoi.java](LeetcodePractice/MyAtoi.java) |
| Thousand Separator | [ThousandSeperator.java](LeetcodePractice/ThousandSeperator.java) |

### Design

| Problem | Solution |
| --- | --- |
| Design HashMap | [MyHashMap.java](LeetcodePractice/MyHashMap.java) |
| PriorityQueue (practice with the collection) | [PriorityQueueCollection.java](LeetcodePractice/PriorityQueueCollection.java) |
| Recent Counter | [RecentCounter.java](LeetcodePractice/RecentCounter.java) |
| Smallest Infinite Set | [SmallestInfiniteSet.java](LeetcodePractice/SmallestInfiniteSet.java) |
| Stock Spanner | [StockSpanner.java](LeetcodePractice/StockSpanner.java) |
| Trie | [Trie.java](LeetcodePractice/Trie.java) |

<!-- index:end -->

## Regenerating the index

The table above is generated. After adding a solution, add its class name to the
topic map in `tools/build_index.py` and run:

    python tools/build_index.py

It warns about any file that is not in the map, so nothing goes missing.
