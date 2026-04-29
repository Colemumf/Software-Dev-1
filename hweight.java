/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/
//Cole Mumford CMPT 220L assignment 8 4/29/26
import java.util.Stack;

import java.util.LinkedList;

import java.util.Collections;
//collections is needed to sort the stack so we import it

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);
        
        //1
        
        Collections.sort(stax);// This sorts the stack from smallest to largest
        System.out.println(stax);
        System.out.println(stax.peek());//This prints the top value in the stack which is now the max value
        Collections.sort(stax, Collections.reverseOrder());
        //This sorts the stack from largest to smallest putting the minimum value on the top
        System.out.println(stax);
        System.out.println(stax.peek());
        //This prints the value that is on top of the stack which is now the minimum value
        
        //2
        System.out.println(stax.size());//This prints the amount of elements in ths stack
        
        //3
        while(linky.size()>2){
            linky.removeFirst();
            linky.removeLast();}
        System.out.println(linky);
        //This removes the edges of the linkedlist and repeats as long as there are at least 3 items remaining. 
        //If there is only 1 remaining then the program found the exact middle number but if there's 2 remaining that means there are 2 middle numbers since it is an even list and they will both print.
        
        //4
        Stack<String> plates = new Stack<>();
        //At a resteraunt a dishwasher cleans and stacks up 5 plates
        plates.push("plate 1");
        plates.push("plate 2");
        plates.push("plate 3");
        plates.push("plate 4");
        plates.push("plate 5");
        System.out.println(plates);
        plates.pop();
        plates.pop();
        plates.pop();
        //3 plates had to be taken to serve a table, these were the top 3 plates since stacks operate on LIFO
        System.out.println(plates);
        plates.push("plate 6");
        plates.push("plate 7");
        plates.push("plate 8");
        plates.push("plate 9");
        plates.push("plate 10");
        plates.push("plate 11");
        plates.push("plate 12");
        plates.push("plate 13");
        plates.push("plate 14");
        //The dishwasher cleans 9 more plates and adds them to the stack
        System.out.println(plates);
        //A party is coming so a worker counts the plates here:
        System.out.println(plates.size());
        //There are 11 plates now
        //A worker wants to flip the stack to use the older plates first since they are less fresh
        Collections.reverse(plates);
        System.out.println(plates);
        //5 plates are needed for the party, the least fresh ones go out first now after the flip
        plates.pop();
        plates.pop();
        plates.pop();
        plates.pop();
        plates.pop();
        System.out.println(plates);
        
        
        
        
        
    }}





