//Cole Mumford 3/2/26 Midterm Project
// Tax calculator. I am going to simplify how taxes work for the purpose of the project. Will only accept single or married filing jointly
import java.util.Scanner;// This is needed to get user input

public class midterm {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in); //Also needed for input 
        System.out.println("This is a NYS tax calculator program!");
        System.out.println("Enter the requested information to learn more about your taxes!");
        //Explains the purpose and what the user should do
        System.out.println("How are you filing taxes? Enter 1 for single or 2 for married filing jointly. (Those are the only two options)");
        int userstatus=sc.nextInt();
        //Asks and recieves how the user files taxes
        System.out.println("Please enter your yearly income before taxes here: (Use numbers only, no dollar sign. If you are filing jointly, enter the sum of you and your spouse's income):");
        double userincome= sc.nextDouble();
        //Asks and recieves the users yearly income
        System.out.println("Using numbers no dollar signs, please enter the amount that should be deducted from your taxable income due to loans, 401ks, etc here:");
        double userdeduct=sc.nextDouble();
        //Asks and recieves deduction information
        System.out.println("Using numbers and no dollar signs, please enter the amount of tax credit you qualify for:");
        double usercredit=sc.nextDouble();
        //Asks and receives number for tax credits
        double taxableincome=userincome-userdeduct;
        //Need to know their taxable income after deductions to see where they fall in the brackets
        double tax=0;
        //Initializes variable that will hold how much to be paid in taxes due to filing status, income and tax credit
        if (userstatus==1){ //This large if statement takes care of the single filers
            //They are all single filers and will pay a rate that depends on their income split into 5 brackets
            System.out.println("You are filing as a single person");
            System.out.println("The following information has already accounted for deductions!");
            //Lets the user know that their taxable income is their income minus deductions
            if(taxableincome<20000){
                System.out.println("You are filing as a single person in the lowest tax bracket.");
            tax=taxableincome*.04;
        } //Here since the user has less than 20k in taxable income all of their income gets taxed at the lowest rate, 4%
            else if(taxableincome>=20000&&taxableincome<80000){
                System.out.println("You are filing as a single person in the second tax bracket.");
                tax=(20000*.04)+(taxableincome-20000)*.06;
            }//Second bracket so first 20000 gets taxed at 4% and remainder at 6%
            else if(taxableincome>=80000&&taxableincome<200000){
                System.out.println("You are filing as a single person in the third tax bracket.");
                tax=(20000*.04)+(60000*.06)+(taxableincome-80000)*.08;
            }//Third bracket, first 20k at 4%, then 60K at 6% and the rest at 8%
            else if(taxableincome>=200000&&taxableincome<1000000){
                System.out.println("You are filing as a single person in the fourth tax bracket.");
                tax=(20000*.04)+(60000*.06)+(120000*.08)+(taxableincome-200000)*.1;
                }//Fourth bracket, first 20k at 4%, then 60k at 6%, then 120000 at 8% and the rest at 10%
            else{
                System.out.println("You are filing as a single person in the highest tax bracket.");
                    tax=(20000*.04)+(60000*.06)+(120000*.08)+(800000*.1)+(taxableincome-1000000)*.12;
}}              //Highest bracket, 20k at 4%, 60k at 6%, 120k at 8%, 800k at 10% and every dollar over that at 12%
            
        else if(userstatus==2){// This else if takes care of the married, joint filers
            System.out.println("You are married and filing taxes jointly.");
            System.out.println("The following information has already accounted for deductions!");
            //Just like for the single filers, every dollar gets taxed depending on where it falls in the brackets
            //For married, joint filers, the bracket limits are doubled but the rates stay the same
            //You still pay 4% for the lowest portion, then 6%, then 8% etc
            if(taxableincome<40000){
                System.out.println("You are filing jointly and are in the lowest tax bracket.");
                tax=taxableincome*.04;
            }
            else if(taxableincome>=40000&&taxableincome<160000){
                System.out.println("You are filing jointly and are in the second tax bracket.");
                tax=(40000*.04)+(taxableincome-40000)*.06;
            }
             else if(taxableincome>=160000&&taxableincome<400000){
                System.out.println("You are filing jointly and are in the third tax bracket.");
                tax=(40000*.04)+(120000*.06)+(taxableincome-160000)*.08;
            }
             else if(taxableincome>=400000&&taxableincome<2000000){
                System.out.println("You are filing jointly and are in the fourth tax bracket.");
                tax=(40000*.04)+(120000*.06)+(240000*.08)+(taxableincome-400000)*.1;

            }
             else{
                System.out.println("You are filing jointly and are in the highest tax bracket.");
                tax=(40000*.04)+(120000*.06)+(240000*.08)+(1600000*.1)+(taxableincome-2000000)*.12;

            }}
        else {//If anything besides 1 or 2 was entered for filing status, this will tell the user its not valid
            System.out.println("You did not enter an acceptable way to file taxes. The following information will be incorrect.");
        }  
         
        tax=tax-usercredit;
        //After computing the amount to be paid in taxes, we take away the tax credit a user gets
        while(tax>=0){
            //If tax is positive, meaning the user owes taxes, the program tells them how much they owe
            System.out.println("You owe " + tax+" dollars in taxes!");
            break;//This breaks the while loop only making it run once and not infinitely
        }
        while(tax<0){
            //If tax is negative, the user is owed money from govt
            //Multiplying the negative tax by -1 creates a positive number which is how much the govt owes the user
            tax=tax*(-1);
            System.out.println("You are owed a tax refund of "+tax+" dollars!");
            break;//Makes sure the while loop only runs once

        }

       
    }
}
        



    
