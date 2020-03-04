import java.util.Scanner;


public class SoftWay extends inheritance
{
	public static void main(String[] args)
	{
		full();
	}
	
	public static void full() //full=full program
	{
		System.out.println("\t\t\t---------------------------------");
		System.out.println("\t\t\tWelcome to opur Softway Supershop");
		System.out.println("\t\t\t---------------------------------\n\n");
		product(); 			//inheritance called
		System.out.println("\n\n\t\t\7 1. New Customer");
		System.out.println("\t\t 2. Old Customer");
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("\t\t Please Press (1/2) ");
		c=sc.nextLine().charAt(0);
		if(c=='1')	//for new customer
		{
			newc obj=new newc();
			obj.cni();
		}
		
		else if(c=='2')	//for old customer
		{
			oldc obj2=new oldc();
			obj2.cid();
		}
		else
		full();
		Scanner bc=new Scanner(System.in);
		System.out.print("\n\n\t\tPress m to return main menu or press any other key to exit ");
		int b=bc.nextLine().charAt(0);
		if(b=='m')
		full();
	}
}

class inheritance
{
	public static void product()
	{
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|      Product Name       ||      Product Code     |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|       Rice (5 KG)       ||          RC11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|       Beef (1 KG)       ||          BF11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|        Vegetable        ||          VG11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|           Salt          ||          SL11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|       Toothpaste        ||          TP11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|         Shampoo         ||          SM11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|       Milk Vitae        ||          MV11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|         Perfume         ||          PR11         |");
		System.out.println("\t\t----------------------------------------------------");
		System.out.println("\t\t|   Cold Drinks (2 Litr)  ||          CD11         |");
		System.out.println("\t\t----------------------------------------------------");
		
	}
}

class newc
{		//newc=new customer
	static int i=235;
	static double t;	//t= total
	public static void cni()
		{
			String cname;	//cname=customer name
			Scanner sc=new Scanner(System.in);
			System.out.print(" \n \t\t\tCustomer Name: ");
			cname=sc.nextLine();
			System.out.println("\7 \t\t\tCustomer ID  : " + (i++));
			prices();
			footer();
			
                       
		}
	
	public static void prices()
	{
		String pcode;	//pcode=product code
		double tp=0,tv=0;	//tp=total price & tv=total vat
		int j;
		for(j=0;j<20;j++)
		{
			System.out.print("\n\t\t\t\t\t\t(Press t for calculate total)\n");
			System.out.print("\t\t\tCode   : ");
			Scanner pr=new Scanner(System.in);
			pcode=pr.nextLine();
			int price;
			double vat;
			if("t".equals(pcode))
			break;
			switch(pcode)
			{
				case "RC11": case "rc11":
				price=200;
				vat=0*price;
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Rice (5 KG)");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "BF11": case"bf11" :
				price=200;
				vat=0*price;
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Beef (1 KG)");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "VG11": case "vg11":
				price=300;
				vat=0*price;
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Vegetable");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "SL11": case "sl11":
				price=60;
				vat=Math.ceil(0.1*price);		// math.ceil() is used for round value
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Salt");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "TP11": case "tp11":
				price=50;
				vat=Math.ceil(.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Toothpaste");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "SM11": case "sm11":
				price=215;
				vat=Math.ceil(.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Shampoo");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "MV11": case "mv11":
				price=58;
				vat=Math.ceil(.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Milk Vitae");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "PR11": case "pr11":
				price=220;
				vat=Math.ceil(.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Perfume");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				case "CD11": case "cd11":
				price=82;
				vat=Math.ceil(.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Cold Drinks (2 Litr)");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
				default:
				System.out.println("\t\t\tPlease enter correct code");	
			}
		}
		//end of for loop
		System.out.println("\n\t\t\tTotal Price: "+tp+" Tk");
		System.out.println("\t\t\tTotal Vat  : "+tv+" Tk");
		t=tp+tv;
		System.out.println("\t\t\tTotal      : "+t+" Tk");
	}
	public static void footer()
	{
		System.out.println("\n\t\t\t\tThank You");
		System.out.println("\n\t\t\t\t\t\t\tZahid & Manik");
		System.out.println("\n\t\t\t\t\t\t\t-------------");
		System.out.println("\n\t\t\t\t\t\t\t  Signature");
	}
			
}

class oldc		//oldc=old customer
{
	public static void cid()	//cid=customer id
	{
		newc obj3=new newc();
		Scanner pr=new Scanner(System.in);
		System.out.print(" \n \t\t\tCustomer ID: ");
		int id;
		id=pr.nextInt();
		if(id>=235 && id<obj3.i)
		{
			obj3.prices();
			System.out.println("\n\t\t\tYou got 5% discount");
			obj3.t=(obj3.t)-(.05*(obj3.t));
			System.out.println("\n\t\t\tTotal with Discount: "+(Math.ceil(obj3.t))+" Tk");
			obj3.footer();
			
		}
		else
		{
			System.out.println("\t\tSorry. You are not our old customer");
			obj3.cni();
		}
	}
}