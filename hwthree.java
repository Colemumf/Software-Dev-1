//Cole Mumford hw three

import java.util.Scanner;

public class hwthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to be broken apart here:");
        String input= sc.nextLine();
        for(int i=0; i<input.length(); i++){ 
              char out =input.charAt(i);
              System.out.println(out);
                                                
        }

//On google I looked up what Charat does. I saw that it selects a single chaarcter in a string. With this
//I also discovered "char" which is like string or int. I looked up how to see how many characters are in a string.
//.Length() is good for this. After that I just used what we learned in class about loops to complete the assignment.
//I originally made my loop loop until i<=input.length but this would give me a weird output so i switched to just i<input.length()
    }
}