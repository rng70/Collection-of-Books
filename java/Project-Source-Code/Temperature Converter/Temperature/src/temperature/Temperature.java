package temperature;
import java.util.Scanner;
public class Temperature {
	static Scanner input = new Scanner(System.in);
	public static boolean exitProgram = false;  
	public static void main(String[] args) {
			double m,n;
	    	System.out.println(" Temperature conversion");
	    	System.out.println("------------------------\n");
	    	while (!exitProgram)
	    	{
	        System.out.println("Enter your choice:\n1.Celsius to Fahrenheit\n2.Celsius to Kelvin\n3.Fahrenheit to Celsius\n4.Fahrenheit to Kelvin\n5.Kelvin to Celsius\n6.Kelvin to Fahrenheit\n7.Exit");
	        String c = input.next();
	        switch (c)  {
	        case "1":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m = ((9.0 / 5.0) * n) + 32;
                System.out.println(+n+"º Celsius = "+m+"º Fahrenheit\n");
               break;
	        case "2":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m = n + 273.15;
                System.out.println(+n+"º Celsius="+m+" Kelvin\n");
	            break;
	        case "3":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m = (n - 32) * 5 / 9;
                System.out.println(+n+"º Fahrenheit = "+m+"º Celsius\n");
	             break;
	        case "4":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m = ((5.0/9.0) * (n - 32)) + 273.15;
                System.out.println(+n+"º Fahrenheit="+m+" Kelvin\n");
	            break;	             
	        case "5":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m=n - 273.15;
                System.out.println(+n+" Kelvin="+m+"º Celsius\n");
	            break;	        	
	        case "6":
	        	System.out.println("Enter number");
	        	n = input.nextDouble();
	        	m = ((n - 273.15) * (9.0/5.0)) + 32;
                System.out.println(+n+" Kelvin="+m+"º Fahrenheit\n");
	            break;	                    
	        case "7":
	        	exitProgram = true;
	            System.out.println(" Program is terminated\n");
	            break;
	        default:
	            System.out.println("Please provide proper input\n");
	            continue;
	  }
      }
   }
}



