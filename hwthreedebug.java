import java.util.Scanner;
//Cole Mumford hwthree debug
public class hwthreedebug {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); // for input
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){ //switched from <10 to <=10 so 10 is included
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int fac= sc.nextInt(); //takes user input
        int pro=1;//Sets the product to 1. Cant start at 0 bc anything times 0 is 0
        //here's a hint
        for (int i = 1; i <= fac; i++){ //Starting at 1 up to the input
            pro=pro*i; //Multiply by all numbers leading up to the input

        }
        System.out.println("The factorial of the entered integer is "+pro);//Prints out the result!
        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int j=sc.nextInt(); //user input
        int sum=0;// set sum to zero to start. This is place holder for final result
        int n=0;// start at zero and add by every other. 0+2+4+6 etc...
        for(n=0;n<=j;n+=2){ //0 to the input increasing by 2
            sum=sum+n;// Accumulate the sum
        }

        System.out.println("The number you entered, when summed with every other digit is "+sum);//prints out result
        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run=false; //made the boolean false so the loop breaks
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        System.out.println("Enter a word and the reverse will be printed:");
        sc.nextLine(); //This is needed because my input wasn't being taken at first. 
        String input= sc.nextLine();
        for(int i=input.length()-1; i>=0; i--){ 
              char out =input.charAt(i);
              System.out.print(out);//Used print instead of println so all the characters stay on the same line and look like a reversed word
                                                
        }
        //String reverse = "";
//For problem 5 i copied my code from the other part of the assignment over. I made sure to have i start with
//input.length()-1 because the characters start at 0 not 1. I made sure it looped when i was greater than 0 until
//It reached 0. I had i--decrease by 1 instead of increase by 1 because we are starting at input.length not at 0 like the other part of the assignment
    }
}
