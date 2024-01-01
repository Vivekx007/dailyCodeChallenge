/******************************************************************************

Welcome to GDB Online.
Assignment Coding Problem
Problem Name: Decimal to Binary
Problem Level: MEDIUM
Problem Description: #### Given a decimal number (integer N), convert it into binary and print. 
#### The binary number should be in the form of an integer.

##### Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java. 

<br>

##### Input format : 
    Integer N

##### Output format : 
    Corresponding Binary number (long)

##### Constraints :
    0 <= N <= 10^5
 #####Sample Input 1 : 
    12

#####Sample Output 1 : 
    1100

#####Sample Input 2 : 
    7

#####Sample Output 2 : 
    111

*******************************************************************************/
import java.util.*;
public class decimalToBinary
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int dec = sc.nextInt();
	    int bin = 0;
	    int nxt = 1;
	    while(dec!=0){
	        int last = dec%2;
	        bin = last*nxt+bin;
	        nxt*=10;
	        dec=dec/2;
	        
	    }
	    
		System.out.println(bin);
	}
}
