//Cole Mumford hw 5 debug 3-29-26

import java.util.Scanner;
public class debughwfive{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    //Problem 2!
    System.out.println("Please enter an integer and the factorial will be printed in return!");
    int prob2=sc.nextInt();
    System.out.println(factorial(prob2));

    //Problem 3!
    System.out.println("Please enter a number and the sum of every other number will be printed!");
    int prob3=sc.nextInt();
    System.out.println(everyother(prob3));

    //Problem 5!
    System.out.println("Please enter a string and the reverse will be printed!");
    sc.nextLine(); //this fixes a glitch with the input
    String prob5=sc.nextLine();
    System.out.println(reverse(prob5));
      
    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }

    public static int factorial(int num){
        int pro=1;
        for (int i = 1; i <= num; i++){ 
            pro=pro*i; }
        return(pro);} //Got this loop from the previous assignment 

    public static int everyother(int j){
        int sum=0;
        int n=1;
        for(n=1;n<=j;n+=2){ 
            sum=sum+n;
        } return(sum);
    }// Also got this code from previous assignment

    public static String reverse(String x){
        String result="";
        for(int i=x.length()-1; i>=0; i--){ //I used most of the code from the previous assignment
              char out =x.charAt(i);//I also did some research to combine the characters into a string thats what result ="" is
              result=result +out;
    } return(result);}
    

  
}
