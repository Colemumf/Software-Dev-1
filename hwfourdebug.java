    //Cole Mumford 2/26/26 hw 4 debug
    import java.util.Arrays; //need this to sort arrays
    import java.util.Collections;

    public class hwfourdebug {
        public static void main(String[] args) throws Exception {
            String[] namearray={"Molly", "Karen", "Kevin", "Addison"}; //name array
            Integer[] numarray={}; //empty num array
            int newarray[]=new int[20]; //empty new array with 20 null slots

            String[] sortMe={"Apple", "Kiwi", "Orange", "Banana", "Watermelon", "Strawberry"};
            Arrays.sort (sortMe);// .sort puts the array into alphabetic order
            System.out.println(Arrays.toString(sortMe)); //this command prints the whole thing, i got it from the slides

            int addMe[]={1,2,3,4,5,6,7,8,9,10};
            int sum=0;
            for(int i=0; i<addMe.length; i++){ //from i=0 until i reaches the length of the array
                sum=sum+addMe[i];}// Sum the previous sum and add each index of the array. Each index is denoted as i
                System.out.println("The added sum of the array is "+sum);// Takes final sum outside of the loop and prints it

            //thinking one! here's an array
            Integer maxMe[] = {280, 4892, 134, 23, 1937, 5329, 932, 89};
            Arrays.sort(maxMe);// This arranges the array above from lowest to highest
            Arrays.sort(maxMe, Collections.reverseOrder()); //This flips the order making it highest to lowest
            System.out.println(maxMe[0]);// At this point the largest value will be at the first index so we can print 0th index every time
            //What would you have to do to find the largest number and then print that value?



            

           
       

    
}
}