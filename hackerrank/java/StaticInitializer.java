import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag = false;
    static {
        try {
            Scanner scanner = new Scanner(System.in);
            B = Integer.parseInt(scanner.nextLine());
            H = Integer.parseInt(scanner.nextLine());
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            flag = true;
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
    
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

