// Question 2.MAke a function to add 2 numbers and return the sum. 

import java.util.*;
public class AddFunction {
    public static int AddTwoNumbers(int a, int b){
     int sum=a+b;
     return sum;
    }
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int sum=AddTwoNumbers(a,b);
      System.out.println("Sum of two numbers is:" +sum);
    }
}
