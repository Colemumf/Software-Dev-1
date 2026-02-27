// Cole Mumford hw 4 2/25/26
public class hwfour {
    public static void main(String[] args) throws Exception {
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
         for (int i = 0; i < myArray.length; i++) {// This loops through the whole array, 1 index at a time
                boolean repeat= false; //We initialize this boolean as false. 
                // if the current number has appeared previously it will be marked true (previous to the current i)
            for(int x=0; x<i; x++){ //This loops through all the indexes less than the current i
                if(myArray[i]==myArray[x]){
                    repeat=true;// If current i has already appeared repeat becomes true
                }
            }
            if(repeat != true){// This if statement only happens if the repeat boolean isnt true. Only runs if its the first time the number appears
                int counter=0;// This will count how much the current number is in the array
                for(int z=0;z<myArray.length;z++){
                    if(myArray[i]==myArray[z]){
                        counter++; //Counter is increased for each time the value repeats itself
                    }
                }
            if(counter>1){// If the counter is greater than one meaning its a duplicate, we will print saying so
                System.out.println("Number "+myArray[i] +" is in the array "+counter+ " times!");
            }
            }

                //This assigment was tricky trying to figure out how to properly nest my loops to make this work.
                //I better learned how to format my loops while using if statements to make something like this work.
         }      //I was able to incorporate a boolean as well to avoid repeats.
        }
    }