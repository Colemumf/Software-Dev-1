import java.util.Scanner; //Needed for input
//Cole Mumford Hw2 for CMPT 220 Applied Math and Economics major   2/4/26
public class hwtwo {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //Needed for input too
        int score=0; //Sets starting score to 3
        System.out.println("This is a 3 question quiz, answer the questions as best you can to earn points!");
        System.out.println("How many players can be on the field at one time, per team, in American football? <Answer using words>");
        String football = sc.nextLine(); //Sets football variable to the users input
        if (football.equals("Eleven")||football.equals("eleven")){ //Tests the right answer capital letter or not
            score++; //Adds one to score
            System.out.println("Correct!");
        } else{ //Responds accordingly to wrong answer
            System.out.println("Wrong, try better next time!");
        }
        System.out.println("What mlb team is based out of the Bronx?"); //Repeated steps from above
        String bsb = sc.nextLine();
        if (bsb.equals("Yankees")||bsb.equals("yankees")){
            score++;
            System.out.println("Correct!");
        }   else{
            System.out.println("Wrong, try better next time!");
        }
        System.out.println("What nba team has won the most finals?");
        String nba = sc.nextLine();
        if (nba.equals("Celtics")||nba.equals("celtics")){
            score++;
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong!");
        }
        System.out.println("Thank you for participating in my quiz!");
        System.out.println("Your final score is " + score+ (" out of 3!")); //Lets user know final accumulated score

        //I learned how to use the import scanner to get user input
        //I also learned how to use if, else if, and else statements to respond to different possible inputs
        // I was able to use the or (||) to account for capital letters (BTW I looked up the <score++> command bc i didnt know how to tally score)
        
            

       
            
            






        

    }
    
}

        
