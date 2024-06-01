package CodeUp;

import java.util.Scanner;

// 코드업 1405 : 숫자 로테이션
public class CodeUp_1405 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(intArr[j] + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(intArr[k] + " ");
            }
            System.out.println();
        }

    }
}
