import java.util.*;
import java.io.*;


public class Loops2 {
    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int bnSum = 0;
            for (int j = 0; j < n; j++) {
                bnSum += (int) Math.round(b * (Math.pow(2, j)));
                System.out.print(a + bnSum + " ");
            }
        
            System.out.println();
        }

        in.close();
    }
}