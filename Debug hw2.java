//Cole Mumford 2/5/26 Debug assignment for hw 2
public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else if(var1==4){
            System.out.println("Var1 is equal to 4"); //Added an option if var1 is equal to 4
        }else{
            System.out.println("Var1 is less than 4");
        }

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if(var2==6){
            System.out.println("Var2 is 6");// Added an option if var2 is exactly equal to 6 and organized it to be executed when it should 
        } else if (var2 > 6){
            System.out.println("Var2 is greater than 6");
        } else{
            System.out.println("Var2 is less than 5"); //If var 2 isnt 5,6 or greater than 6 it must be less than 5
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        }
        else if(var3==10){
            System.out.println("Var3 is 10"); //Added an option if var3 is 10
        } 
        else if(10>var3&&var3>5){
            System.out.println("Var3 is between 5 and 10");// Added an option if var3 is between 5 and 10
        } else if(var3==5){
            System.out.println("Var3 is 5");//Added an option if var3 is 5
        }
            else {
            System.out.println("Var3 is less than 5");//If var 3 isnt 10,5, greater than 10 or between 5 and 10, it must be less than 5
        }




        //for this section: why are we not entering the if statement?
        String name="marist"; //Made a variable called name that is equal to marist
        if (name == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}