import java.util.Scanner;

public class Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
 
        String[] splitted = subString(s, k);
        sortLexicographically(splitted);

        smallest = splitted[0];
        largest = splitted[splitted.length - 1];
        return smallest + "\n" + largest;
    }
    
    public static String[] subString(String str, int length) {
        java.util.ArrayList<String> aList = new java.util.ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (j - i == length) {
                    aList.add(str.substring(i, j));
                }
            }
        }
        
        String[] array = new String[aList.size()];
        array = aList.toArray(array);
        return array;
    }
    
    public static void sortLexicographically(String strArr[]) { 
        for (int i = 0; i < strArr.length; i++) { 
            for (int j = i + 1; j < strArr.length; j++) { 
                if (strArr[i].compareToIgnoreCase(strArr[j]) > 0) { 
                    String temp = strArr[i]; 
                    strArr[i] = strArr[j]; 
                    strArr[j] = temp; 
                } 
            } 
        } 
    } 


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}