package Java_Tests;
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int [] x= {1,10,9,2,2,1,11};
        int []y= {6,4,1,8,5,1,7};
        solution2(x,y);
        System.out.println(solution2(x,y));
    }
    public static int solution2(int[] A, int[] Y) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int biggestVerticalPath = 0;


        for(int i = 0; i < A.length-1; i ++) {
            int n = A[i+1] - A[i];


            if(n > biggestVerticalPath) {
                biggestVerticalPath = n;
            }
        }
        return biggestVerticalPath;
    }

}