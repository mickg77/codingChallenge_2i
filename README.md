Counting Sum Pairs

Write a function which takes 2 parameters : an array of whole numbers and an integer X

The function should look for pairs of numbers in the array which add up to X.
Each array element can only be used in one par.

The function should return the count of how many pairs it finds.

The array has already been passed in ascending order.

Examples : 

X: 1
Array : 3,4,5,6
Output 0

Reason: none of the numbers can be added to reach zero

X: 15

Array : 0,15,32,2000, 15000
Output 1
Reason: 15 added to zero makes 15

X: 42

Array 1,1,10, 32, 41
Output 2
Reason: 1 and 41 can be added to make 42

Design choices

The function should recieve two parameters. X and the given array.

The first value in the array should be subtracted from X.  
The array should then be searched to find this number.
If the number is found then a match has been found, and the count can be incremented by 1.

NB
My first attempt at this is not working fully -
I have not adhered the code to use one code first.  Possible solution are to send values into another array or use a hashmap.