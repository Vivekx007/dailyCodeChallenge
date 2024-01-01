/******************************************************************************

Assignment Coding Problem
Problem Name: Binary to decimal
Problem Level: MEDIUM
Problem Description: ####Given a binary number as an integer N, convert it into decimal and print.

#####Input format : 
    An integer N in the Binary Format

#####Output format : 
    Corresponding Decimal number (as integer)

##### Constraints :
    0 <= N <= 10^9

 #####Sample Input 1 : 
    1100

#####Sample Output 1 : 
    12

#####Sample Input 2 : 
    111

#####Sample Output 2 : 
    7

*******************************************************************************/
import java.util.*;
public class binaryToDecimal
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int bin = sc.nextInt();
	    int nxt = 1;
	    int dec = 0;
	    while(bin!=0){
	        int last = bin%10;
	        dec = last*nxt+dec;
	        nxt*=2;
	        bin = bin/10;
	    }
	    
		System.out.println(dec);
	}
}
