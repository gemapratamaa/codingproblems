import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
    Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output

0 0
1 0
1 1
1 2
*/
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] firstLine = userInput.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        
        for (int i = 0; i < M; i++) {
            String answer = "";
            String[] command = userInput.nextLine().split(" ");
            String operation = command[0];
            if (operation.equals("AND")) {
                if (command[1].equals("1")) {
                    B1.and(B2);
                } else if (command[1].equals("2")) {
                    B2.and(B1);
                }
            } else if (operation.equals("SET")) {
                if (command[1].equals("1")) {
                    B1.set(Integer.parseInt(command[2]));
                } else if (command[1].equals("2")) {
                    B2.set(Integer.parseInt(command[2]));
                }
            } else if (operation.equals("FLIP")) {
                if (command[1].equals("1")) {
                    B1.flip(Integer.parseInt(command[2]));
                } else if (command[1].equals("2")) {
                    B2.flip(Integer.parseInt(command[2]));
                }
            } else if (operation.equals("OR")) {
                if (command[1].equals("1")) {
                    B1.or(B2);
                } else if (command[1].equals("2")) {
                    B2.or(B1);
                }
            } else if (operation.equals("XOR")) {
                if (command[1].equals("1")) {
                    B1.xor(B2);
                } else if (command[1].equals("2")) {
                    B2.xor(B1);
                }
            }
            answer += B1.cardinality() + " " + B2.cardinality();
            System.out.println(answer);
        }
    }
}