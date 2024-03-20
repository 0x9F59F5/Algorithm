package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CodeUp_1057 {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArr = br.readLine().split(" ");

            int[] arr = new int[2];

            for (int i = 0; i < 2; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            if (arr[0] == arr[1]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }


        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
