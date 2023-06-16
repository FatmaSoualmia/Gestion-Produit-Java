package GestionProduit;
import java.util.Scanner;

public class Printer extends Article {
	public static int nbPrin=0;
	public static Printer tabPrin[]= new Printer[100];
	
	
	public Printer (String ref, float price, int quantity ) {
		super();
		this.ref=ref;
		this.price=price;
		this.quantity=quantity;
		nbPrin++;
	}
	
	public Printer () {
		nbPrin++;
	}

	public static void addImp() {
			Scanner sn=new Scanner(System.in);
			System.out.println("ref=");
			String ref= sn.nextLine();;
			System.out.println("prix=");
			float price= sn.nextFloat();
			System.out.println("quantite=");
			int quantity= sn.nextInt();
			Printer I= new Printer (ref,price,quantity);
			tabPrin[nbPrin-1]=I;
	}
	
	public void modifyImp(String mRef, float mPrice, int mQuantity) {
			price=mPrice;
			quantity=mQuantity+quantity;
	}
}
