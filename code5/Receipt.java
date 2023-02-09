package project3;
import java.util.*;

public class Receipt {
private double total=0;
private Formatter f=new Formatter(System.out);
public void printTitle() {
	f.format("%-15s %5s %10s\n","Item","Quantity","Price");
	f.format("%-15s %5s %10s\n","----","--------","-----");
}
public void print(String name,int qty,double price) {
	f.format("%-15.15s %5d %13.2f\n",name,qty,price);
	total+=price;
}
public void printTotal() {
	f.format("%-15s %5s %13.2f\n","Tax","",total*0.06);
	f.format("%-15s %5s %13s\n","","","-----");
	f.format("%-15s %5s %13.2f\n","Total","",total*1.06);
	
}
public static void main(String[] args) {
	Receipt receipt=new Receipt();
	receipt.printTitle();
	receipt.print("Doshirak", 5, 5.45);
	receipt.print("Kefir", 2, 3.25);
	receipt.print("Bread", 3, 3.75);
	receipt.printTotal();
}
}
