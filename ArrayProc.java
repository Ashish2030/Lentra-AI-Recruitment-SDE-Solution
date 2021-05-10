/* Save this in a file called Main.java to compile and test it    */

import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
         for(int i=0;i<array.size();i++)
         {
             if((array.get(i)%5==0)&&(array.get(i)%11==0))
             {
               array.set(i,-3);  
             }
             else if(array.get(i)%5==0)
             {
                array.set(i,-1);  
             }
             else if(array.get(i)%11==0)
             {
                 array.set(i,-2);
             }
             else
             {
                 
             }
         }
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
