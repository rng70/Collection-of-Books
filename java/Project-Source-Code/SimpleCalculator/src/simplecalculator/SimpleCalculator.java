package simplecalculator;

import java.util.Scanner;
public class SimpleCalculator 
{
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in);
   System.out.println("You Have Following Choices : ");
   System.out.println("1. Addition");
   System.out.println("2. Subtraction");
   System.out.println("3. Multiplication");
   System.out.println("4. Division");
   System.out.println("Enter Your Choice : ");
   int i=s.nextInt();
   System.out.println("Enter First Nnumber ");
   int a=s.nextInt();
   System.out.println("Enter Second Number ");
   int b=s.nextInt();
   double result=0;
   
   switch(i)
   {
     case 1:
     result=a+b;
     break;
     case 2:
     result=a-b;
     break;
     case 3:
     result=a*b;
     break;
     case 4:
     if(b==0)
     {
       System.out.println("Division Not Possible");
       break;
     }
     else
     result=a/b;

     default:
     System.out.println("You Have Entered A Wrong Choice");
   }
   System.out.println("Result = "+result);
  }
}
