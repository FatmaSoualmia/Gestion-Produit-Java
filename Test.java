package GestionProduit;
import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
			int in;
			do{
			Scanner sc=new Scanner(System.in);
			System.out.println("*************************");
			System.out.println("         Menu            ");
			System.out.println("*************************");
			System.out.println("Pour ajouter un nouveau article taper 1");
			System.out.println("Pour modifier un article taper 2");
			System.out.println("Pour ajouter une vente taper 3");
			System.out.println("Pour afficher le stock de chaque article taper 4");
			System.out.println("Pour afficher le stock total taper 5");
			System.out.println("Pour affichier le recap des ventes taper 6");
			System.out.println("Pour trouver l'heure et le montant d'une vente taper 7");
			in = sc.nextInt();
			switch (in) {
			case 1:
				for (int i =0 ; i<3; i++ ) {
					Article.addArticle();	
				}
				break;
			case 2: 
				Article.modifyArticle ();
				break;
			case 3: ;
				Sale.newSale();
				break;
			case 4:
				Article.afficheStockArticle();
				break;
			case 5: 
				Article.affichTotalStock();
				break;
			case 6: 
				Sale.recapSaleOtd();
				break;
			case 7:
				Sale.findHourandPrice();
			}
		}while ((in!=0) || (in!=1) || (in!=2) || (in!=3) || (in!=4) || (in!=5) || (in!=6) || (in!=7));	}
		
}
