public class ContainerWithMostWater {
    public static int maxArea(int[] height)
{
    int left =0;
    int right = height.length -1;
    int maxArea =0;

    while(left<right)
    {
        int currentHeight = Math.min(height[left],height[right]);
        int width = right - left;
        int area = currentHeight * width;

        maxArea = Math.max(maxArea,area);
        
        if(height[left]<height[right])
        {
            left++;

        }else
        {
            right--;
        }
    }
    return maxArea;
}

public static void main(String[] args) {
    int[] h1 = {1,8,6,2,5,4,8,3,7};
    System.out.println("Max area is " + maxArea(h1));
}
    
}
