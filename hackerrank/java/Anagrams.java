import java.util.Scanner;

public class Solution {

    static int NO_OF_CHARS = 1024; 
    static boolean isAnagram(String a, String b) {
        char[] chr1 = a.toLowerCase().toCharArray();
        char[] chr2 = b.toLowerCase().toCharArray();
        sort(chr1);
        sort(chr2);
        String str1 = new String(chr1);
        String str2 = new String(chr2);
        
        if (str1.equals(str2)) {
            return true;
        } 
        return false;
       
    }
    
    public static void sort(char[] myArray) {
        int size = myArray.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (String.valueOf(myArray[i]).compareTo(String.valueOf(myArray[j])) > 0) {
                    char temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
