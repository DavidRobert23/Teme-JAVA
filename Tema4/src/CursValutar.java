
public class CursValutar {
	
	public static void main(String[] args) {
		
		int lei;
		int eur=20;
		int usd=24;
		int pounds=18;
		int yen= 2657;
		int pesos=86938;
		
		String valuta= new String("Euro");
		
		lei =1000;
		int result;
		
		switch(valuta) {
		  case "Euro":
		    result=lei*eur/100;
		    System.out.print(result+" euro");
		    break;
		  case "Dollars":
		    result=lei*usd/100;
		    System.out.print(result+" dolari");
		    break;
		  case "Pounds":
			    result=lei*pounds/100;
			    System.out.print(result+" lire");
			    break;
		  case "Yen":
			    result=lei*yen/100;
			    System.out.print(result+" yeni");
			    break;
		  case "Pesos":
			   result=lei*pesos/100;
			   System.out.print(result+" pesos");
			    break;
		  default:
			  System.out.print("moneda neacceptata");
		}
		
		
		
		
	}

}
