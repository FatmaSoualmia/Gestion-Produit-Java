package GestionProduit;

import java.util.Scanner;

public class Article {
	public String ref;
	public float price;
	public int quantity;
	public static Article[] addA= new Article [500];	
	
	public static void addArticle() {	
		Scanner sc=new Scanner(System.in);
		String type;
		do {
			System.out.println("insert le type du produit");
			type = sc.nextLine();
			}while (!isValid1(type));
			if (type.equals("ordinateur")) {
				System.out.println("nombre d'ordinateur à inserer");
				int n=sc.nextInt();
					for (int i=0;i<n;i++) {
						System.out.println("article "+ (i+1));
						Computer.addComp();
					}
			}
		
			else if(type.equals("imprimante")) {
				System.out.println("nombre d'imprimante à inserer");
				int n=sc.nextInt();
				for (int i=0;i<n;i++) {
					System.out.println("article "+ (i+1));
					Printer.addImp();	
				}
			}
			else if(type.equals("carte memoire")) {
				System.out.println("nombre de carte mémoire à inserer");
				int n=sc.nextInt();
				for (int i=0;i<n;i++) {
					System.out.println("article "+ (i+1));
					MemoryCard.addCarte();
				}
			}
			else {
				System.out.println("Type de produit invalide. Veuillez réessayer.");
			}
	}
	
	
	public static void modifyArticle () {
		System.out.println("donner le reference de l'article à modifier:");
		Scanner sc=new Scanner(System.in);
		String mRef=sc.nextLine();
		System.out.println("donner le nouveau prix:");
		float mPrice=sc.nextFloat();
		System.out.println("donner la nouvelle quantité a ajouter");
		int mQuantity=sc.nextInt();
		for (int i=0; i<Computer.nbComp; i++) {
			if (mRef.equals(Computer.tabComp[i].ref)) {
				Computer.tabComp[i].modifyComp(mRef,mPrice,mQuantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
		for (int i=0; i<Printer.nbPrin; i++) {
			if (mRef.equals(Printer.tabPrin[i].ref)) {
				Printer.tabPrin[i].modifyImp(mRef,mPrice,mQuantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
		for (int i=0; i<MemoryCard.nbCard; i++) {
			if (mRef.equals(MemoryCard.tabCard[i].ref)) {
				MemoryCard.tabCard[i].modifyCarte(mRef,mPrice,mQuantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
	}
	
	public static void modifyArticle(String mref, float mprice, int mquantity) {
		for (int i=0; i<Computer.nbComp; i++) {
			if (mref.equals(Computer.tabComp[i].ref)) {
				Computer.tabComp[i].modifyComp(mref,mprice,mquantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
		for (int i=0; i<Printer.nbPrin; i++) {
			if (mref.equals(Printer.tabPrin[i].ref)) {
				Printer.tabPrin[i].modifyImp(mref,mprice,mquantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
		for (int i=0; i<MemoryCard.nbCard; i++) {
			if (mref.equals(MemoryCard.tabCard[i].ref)) {
				MemoryCard.tabCard[i].modifyCarte(mref,mprice,mquantity);
			}
			else {
				System.out.println("l'article n'existe pas");
			}
		}
	}

	
	
	public static void afficheStockArticle() {
		System.out.println("Ordinateur:");
		for (int i=0; i< Computer.nbComp; i++) {
			System.out.println("article	" + Computer.tabComp[i].ref + "	de stock=	" + Computer.tabComp[i].quantity);
		}
		System.out.println("Carte Memoire:");
		for (int i=0; i< MemoryCard.nbCard; i++) {
			System.out.println("article	" + MemoryCard.tabCard[i].ref + "	de stock=	" + MemoryCard.tabCard[i].quantity);
		}
		System.out.println("Imprimante:");
		for (int i=0; i< Printer.nbPrin; i++) {
			System.out.println("l'article " + Printer.tabPrin[i].ref + "	de stock=	" + Printer.tabPrin[i].quantity);
		}
	}
	
	
	public static void affichTotalStock() {
		int comp=0,print=0,card=0;
		for (int i=0; i< Computer.nbComp; i++) {
			comp=comp+Computer.tabComp[i].quantity;
		}
		for (int i=0; i< MemoryCard.nbCard; i++) {
			card=card+MemoryCard.tabCard[i].quantity;
		}
		for (int i=0; i< Printer.nbPrin; i++) {
			print=print+Printer.tabPrin[i].quantity;
		}
		System.out.println("Le stock total=" + (comp+print+card));
		System.out.println("Les ordinateurs=" + comp);
		System.out.println("Les imprimantes=" + print);
		System.out.println("Les cartes memoires=" + card);		
	}
	
	
	public static boolean isValid1(String input) {
		return input.equals("ordinateur") || input.equals("carte memoire") || input.equals("imprimante");
	}
	

	public void setRef(String ref) {
		this.ref=ref;
	}
	public String getRef() {
		return this.ref;
	}
	public void setPrice(float prix) {
		this.price=prix;
	}
	public float getPrice() {
		return this.price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	

}






/*
 +++++ i need to do a check over inputs ++++++
 encapsulation for sensitive data
*/


//things to add : don't add redundent articles
//when we add the same article we add it to the quantity , the reference is the field that makes the difference
//
