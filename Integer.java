// Write a  Java program  to display the cube of the number upto given  integer. 

import java.util.Scanner;
public class Integer 
{
	public static void main(String args[])

{
    int i,n;

    System.out.print("Input number of terms : ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}
