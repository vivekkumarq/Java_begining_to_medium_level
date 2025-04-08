package LeetcodePractice;
public class RemoveElement{
    public static int removeElement(int[] nums,int val)
    {
        int counter=0;
        for(int i=0;i<nums.length;i++){
if(nums[i] != val)
{
    nums[counter]=nums[i];
    counter++;
}
        }
        return counter;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
int val = 3;
int counter = removeElement(nums, val);
System.out.println("Number of elements not equal to " + val + ": " + counter);
        System.out.print("Updated array: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}