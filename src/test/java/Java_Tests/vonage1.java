package Java_Tests;

import java.util.Arrays;

public class vonage1 {
    public static void main(String[] args) {
        solution(134);
        System.out.println(solution(15346783));
    }


    public static int solution(int N) {
        if(N <= 0) {
            return 0;
        }
        String number = String.valueOf(N);
        String[] numberArray = number.split("");
        Arrays.sort(numberArray);
        int result = 0;

        System.out.println(Arrays.toString(numberArray));

        for(int i = numberArray.length-1; i >= 0; i--) {
            result += Integer.valueOf(numberArray[i]);
            result *= 10;
            if(i==numberArray.length-1) {
                break;
            }
        }
        System.out.println(result);
        result /= 10;
        return result;
    }

}
