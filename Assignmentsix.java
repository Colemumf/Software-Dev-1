
//Cole Mumford CMPT 220L Hw 6 methods 4/1/26

import java.util.Random;

public class Assignmentsix {
        public static void main(String[] args) throws Exception {

            student s1= new student("James", "Freshman", 3.5, 1);
            student s2= new student("Cole", "Sophomore", 4.0, 2);
            student s3= new student("Lucas", "Senior", 2.8, 3);
            student s4= new student("Molly", "Junior", 3.8, 4);
            student s5= new student("Addie", "Freshman", 3.7, 5);
            Random randgen= new Random();
            int luckyid=randgen.nextInt(5)+1;


            s1.grades();// Activating the grade function from the student class
            s2.grades();
            s3.grades();
            s4.grades();
            s5.grades();

            s1.printid();// Letting the user know the ids so they can compare to the generated luckyid
            s2.printid();
            s3.printid();
            s4.printid();
            s5.printid();

            s1.lunch(luckyid);// Activating the free lunch function from the student class
            s2.lunch(luckyid);
            s3.lunch(luckyid);
            s4.lunch(luckyid);
            s5.lunch(luckyid);

            //I looked up how to generate random numbers so i utilized java util random and new Random
            // For the first function I created an if statement that tells the user the student is on the honor roll
            //If they have a gpa of 3.6 or higher. These gpas do not change
            //The last function i created a random int that changes every time the program runs. This random int gets passed into the function
            //Whoevers id is equal to the random int gets a free lunch on that round of the program
            //I learned that a class can contain multiple details and I think it is cool that you can pick and choose which ones to access
            //Once the functions are created, it is so easy to run them with the chosen student( or whatever your class is)

    
}}
