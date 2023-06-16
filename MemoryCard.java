package GestionProduit;

import java.util.Scanner;

public class MemoryCard extends Article{
	public static int nbCard=0;
	public static MemoryCard tabCard[]= new MemoryCard[100];
	
	
	public MemoryCard (String ref, float price, int quantity ) {
		super();
		this.ref=ref;
		this.price=price;
		this.quantity=quantity;
		nbCard++;
	}
	
	public MemoryCard () {
		nbCard++;
	}
	
	public static void addCarte() {
			Scanner sn=new Scanner(System.in);
			System.out.println("ref=");
			String ref= sn.nextLine();;
			System.out.println("prix=");
			float price= sn.nextFloat();
			System.out.println("quantite=");
			int quantity= sn.nextInt();
			MemoryCard C= new MemoryCard (ref,price,quantity);
			tabCard[nbCard-1]=C;
		}
	
	public void modifyCarte(String mRef, float mPrice, int mQuantity) {
			price=mPrice;
			quantity=mQuantity+quantity;

	}
	
	
}

