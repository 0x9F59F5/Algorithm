package CodeUp;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] intArr = new int[10];
        
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
        
        int num = sc.nextInt();
        
        System.out.println(intArr[num - 1]);
        
    }
}
