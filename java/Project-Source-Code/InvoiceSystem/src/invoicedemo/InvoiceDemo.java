package invoicedemo;

 
import java.util.Scanner;
 
class Invoice{
String partNumber;
String partDescription;
int itemPurchased;
double pricePerItem;
 
Invoice(){
partNumber = "";
partDescription = "";
itemPurchased = 0;
pricePerItem = 0.0;
}
 
String getPartNumber(){
return partNumber;
}
String getPartDescription(){
return partDescription;
}
int getItemPurchased(){
return itemPurchased;
}
double getPricePerItem(){
return pricePerItem;
}
double getInvoiceAmount(){
return (itemPurchased * pricePerItem);
}
void setPartNumber(String pn){
partNumber = pn;
}
void setPartDescription(String pd){
partDescription = pd;
}
void setItemPurchased(int ip){
itemPurchased = ip;
}
void setPricePerItem(double ppi){
pricePerItem = ppi;
}
 
}
class InvoiceDemo {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Invoice invoice = new Invoice();
 
System.out.print("\nEnter part number :");
invoice.setPartNumber(sc.nextLine());
System.out.print("Enter part description :");
invoice.setPartDescription(sc.nextLine());
System.out.print("Enter item purchased :");
invoice.setItemPurchased(sc.nextInt());
System.out.print("Enter price per item :");
invoice.setPricePerItem(sc.nextDouble());
 
System.out.print("\n\nDetail of items purchasing-->");
System.out.print("\nPart number :" + invoice.getPartNumber());
System.out.print("\nPart description :" + invoice.getPartDescription());
System.out.print("\nTotal Billing Amount :" + invoice.getInvoiceAmount());
}
}