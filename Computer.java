package GestionProduit;
import java.util.Scanner;

public class Computer extends Article {
	public static int nbComp=0;
	public static Computer tabComp[]= new Computer[100];
	
	
	public Computer (String ref, float price , int quantity) {
		super();
		this.ref=ref;
		this.price=price;
		this.quantity=quantity;
		nbComp++;
		
	}
	
	public Computer() {
		nbComp++;
	}
	
	public static void addComp() {
		Scanner sn=new Scanner(System.in);
		System.out.println("ref=");
		String ref= sn.nextLine();;
		System.out.println("prix=");
		float price= sn.nextFloat();
		System.out.println("quantite=");
		int quantity= sn.nextInt();
		Computer O= new Computer (ref,price,quantity);
		tabComp[nbComp-1]=O;
	}
	
	public void modifyComp(String mRef, float mPrice, int mQuantity) {		
				price=mPrice;
				quantity=mQuantity+quantity;
	}
	
		
}