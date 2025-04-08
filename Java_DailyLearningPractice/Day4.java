package Java_DailyLearningPractice;
public class Day4 {
    public static void main(String args[] ) {
        int num[][]= new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {   num[i][j] = (int)(Math.random() *100);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
