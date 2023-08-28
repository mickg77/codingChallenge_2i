package org.example;

public class SumFinder {
    public static int pairs(int target, int[]arr){
        /*
        function which takes 2 parameters: an array of whole numbers and an integer
         look for pairs of numbers in the array which sum to X. Each array element can only be used in one pair.
         The function should return the count of how many such pairs it finds.
         */

        int X = target; //take the parameter target and assign to X
        int[] nums = arr; //take the array arr and assign it to nums


        int pairs=0; //initialise pairs to 0;

        for(int i=0; i< arr.length;i++){ //loop through the array once
            int aim=X-arr[i]; //find the necessary value to make the pair
            for(int j=0; j<arr.length;j++){
                if(aim==arr[j]){ //a match has been made
                    pairs++; //increment the pairs by 1
                    /* NB : there is a logical error in the code at this point, I need to store the value of a pair and compare
                    them to stop duplicate pairs */
                }
            }

        }
        return pairs;

    }

}
