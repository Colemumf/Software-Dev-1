//Cole Mumford hw five functions
// 3-26-26
// This use of functions simulates what a manager or owner of a business could use to figure out what to pay their employees
// Different employees get paid different amounts so I made 3 different functions and I could always change the hourly rates as well
// I stated the amounts each group needs to be paid and the total sum of the payroll for the week too
import java.util.Scanner;
public class hwfive {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours have the type 1 employees worked this week?");
        double emp1=sc.nextDouble();
        System.out.println("How many hours have the type 2 employees worked this week?");
        double emp2=sc.nextDouble();
        System.out.println("How many hours have the type 3 employees worked this week?");
        double emp3=sc.nextDouble();
        double totalpay1=(type1employee(emp1));
        double totalpay2=(type2employee(emp2));
        double totalpay3=(type3employee(emp3));
        double totalpay=totalpay1+totalpay2+totalpay3;
        System.out.println("The total pay for the type one employees for this week is "+ totalpay1);
        System.out.println("The total pay for the type two employees for this week is "+ totalpay2);
        System.out.println("The total pay for the type three employees for this week is "+ totalpay3);
        System.out.println("And the total amount needed for this weeks payroll is "+totalpay);
    }

    public static double type1employee(double x){
        return(x*15);
    }
    public static double type2employee(double y){
        return(y*25);
}
    public static double type3employee(double z){
        return(z*35);}}
