package GestionProduit;
import java.util.Scanner;

public class Sale {
	public String numSale;
	public String date;
	public  String hour;
	public int quantity;
	public float price;
	public static Sale [] sales=new Sale [100];
	public static int nbSale=0;
	static Scanner sc=new Scanner(System.in);
	

	
	public 	Sale(String numSale, String hour, String date, int quantity, float price) {
		this.numSale=numSale;
		this.hour=hour;
		this.date=date;
		this.quantity=quantity;
		this.price=price;
		nbSale++;
	}
	
	public 	Sale() {
		nbSale++;
		
	}

	
	public static void newSale() {
		Scanner sc= new Scanner(System.in);
		String type;
		do {System.out.println("donner le type du produit");
			type=sc.nextLine();
			}while (!Article.isValid1(type));
		System.out.println("donner la reference du l'article");
		String ref=sc.nextLine();
		System.out.println("donner la quantité");
		int quantity=sc.nextInt();
		System.out.println("inserer l'heure actuelle (format HH:MM)");
		String hour=sc.nextLine();
		sc.nextLine();
		System.out.println("inserer la date d'aujourd'hui (format JJ/MM/AAAA)");
		String date=sc.nextLine();
		float price=0;
		Sale V=new Sale(ref.concat("00V"), hour, date, quantity, price); 
		
		
        if (type.equals("ordinateur")) {
            processVenteForProduct(Computer.tabComp, ref, V);
        } else if (type.equals("imprimante")) {
            processVenteForProduct(Printer.tabPrin, ref, V);
        } else if (type.equals("carte memoire")) {
            processVenteForProduct(MemoryCard.tabCard, ref, V);
        }
    }
	
	
	public static void processVenteForProduct(Article[] products, String ref, Sale S) {
	    for (int i = 0; i < products.length; i++) {
	        if (ref.equals(products[i].ref)) {
	        	S.price=products[i].price*S.quantity;
	            sales[nbSale] = S;
	            Article.modifyArticle(products[i].ref,products[i].price,-S.quantity);
	            if (S.quantity > products[i].quantity) {
	                System.out.println("le stock n'est pas suffisant");
	            } else {
	                System.out.println("la vente a été effectuée avec succès");
	            }
	            return; // Exit the method once the product is found and processed
	        }
		    else {
		    	System.out.println("l'article n'existe pas");
		    }
	    }
	}
	
	public static void recapSaleOtd() {
		System.out.println("donner la date d'aujourd'hui");
		String todayDate=sc.nextLine();
		for (int i=0; i<Sale.nbSale; i++) {
			if (sales[i]!=null && sales[i].date.equals(todayDate)) {
				System.out.println("La vente n°" + nbSale + "	de numero=" + sales[i].numSale.toString() + "	avec un prix total de=" + sales[i].price+"dt");
			}
		}
	}
	
	public static void findHourandPrice() {
		System.out.println("donner le numero de vente");
		String numSale=sc.nextLine();
		for (int i=0; i<Sale.nbSale; i++) {
			if (sales[i]!=null && sales[i].numSale.equals(numSale)) {
				System.out.println("Sale[hour=" + sales[i].hour.toString() + "]"+ "	 est de prix totale" + sales[i].price+"dt");
			}
		}
	}
}