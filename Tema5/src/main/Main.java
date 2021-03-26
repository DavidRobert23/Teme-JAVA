package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

import basic.Persoana;

public class Main {

	public static void main(String[] args) {
		//Vom construi array-uri separate pentru proprietatile necesare realizarii a 5 Persoane
		//TODO 1: Definiti un array de Stringuri numit "prenume"
ArrayList<String> Prenume = new ArrayList<String>(5);
		//TODO 2: Alocati memorie pentru 5 stringuri

		//TODO 3: Initializati valorile cu 5 prenume la alegere
Prenume.add("Naruto");
Prenume.add("Sasuke");
Prenume.add("Sakura");
Prenume.add("Kakashi");
Prenume.add("Jiraya");
//System.out.print(Prenume);

		//TODO 4: Definiti un array de Stringuri numit "nume" si alocati memorie pentru 5 stringuri
ArrayList<String> Nume = new ArrayList<String>(5);
Nume.add("Uzumaki");
Nume.add("Uchiha");
Nume.add("Haruno");
Nume.add("Hatake");
Nume.add("Sennin");
//System.out.print(Nume);

		//TODO 5: Initializati valorile cu 5 nume de familie la alegere
		
		//TODO 6: Definiti un array de valori intregi numit "varste" si initializati valorile cu 5 varste corespondente numelor
ArrayList<Integer> Varsta = new ArrayList<Integer>(5);
Varsta.add(18);
Varsta.add(18);
Varsta.add(18);
Varsta.add(33);
Varsta.add(45);
//System.out.print(Varsta);

		//TODO 6: Definiti un array de Stringuri numit "orase" si initializati valorile cu 5 nume de orase (nu neaparat unice)
ArrayList<String> Orase = new ArrayList<String>(5);
Orase.add("Hidden Leaf");
Orase.add("Hidden Leaf");
Orase.add("Hidden Leaf");
Orase.add("Hidden Leaf");
Orase.add("Hidden Leaf");
//System.out.print(Orase);
		
		//TODO 6: Definiti un array de valori boolean numit "stareCivila" si initializati valorile cu valoarea de adevar corespunzatoare numelor
ArrayList<Boolean> stareCivila = new ArrayList<Boolean>(5);
stareCivila.add(false);
stareCivila.add(false);
stareCivila.add(false);
stareCivila.add(false);
stareCivila.add(false);
//System.out.print(stareCivila);
		//TODO 7: Atribuiti proprietatii statice "curs" a clasei "Persoana" valoare "JAVA"
		Persoana.curs="java";
		//System.out.println(Persoana.curs);
		//TODO 8: Definiti un ArrayList cu tipul "Persoana" numit "persoane"
		ArrayList<Persoana> test = new ArrayList<Persoana>(5);
		//TODO 9: Instantiati variabila persoane si alocati dimensiunea 5
		
		//TODO 10: Folositi un for pentru a parcurge array-urile
		//si a crea folosind valorile de pe fiecare pozitie o noua instanta de tip persoana
		//care sa fie apoi adaugata in ArrayList-ul "persoane"
		//Rezultatul final ar trebui sa fie un ArrayList cu 5 instante de tip Persoana
		//prima avand nume, prenume, oras, varsta, stareCivila ce corespunde cu pozitia 0, al doilea cu pozitia 1 samd
		
		for(int i = 0;i<5;i++) {
			Persoana loko= new Persoana(Prenume.get(i),Nume.get(i),Orase.get(i),Varsta.get(i),stareCivila.get(i));
			//System.out.println(loko);
			test.add(loko);
		}
		
		
		//TODO 11: Folositi un simplu System.out.println pentru a vedea cum arata afisarea ArrayListului persoane
		System.out.println(test);
		//TODO 12: Folositi un for-each pentru a parcurge si a afisa persoanele din lista persoane pe cate un rand
		for(Object elem:test) {
			System.out.println(elem + ", ");
		}
		
		//Vom realiza o structura de date ce contine notele elevilor bazata pe o cheie reprezentata de identificatorul persoanei 
		//TODO 13: Definiti si initializati un HashMap numit "catalog" cu tipurile <String, Integer>
		HashMap<String,Integer> Catalog= new HashMap<String,Integer>(5);
		
		//TODO 14: Pentru fiecare persoana din lista introduceti in HashMap valoarea returnata de
		//metoda obtineIdentificator() drept cheie si o nota intre 1 si 10 drept valoare (minim o nota sub 5)
		//Hint: obtineti persoana din lista folosind pozitia acesteia, nu parcurgeti lista intr-o bucla
		
		
		Catalog.put(test.get(0).obtineIdentificator(), 6);
		Catalog.put(test.get(1).obtineIdentificator(), 4);
		Catalog.put(test.get(2).obtineIdentificator(), 10);
		Catalog.put(test.get(3).obtineIdentificator(), 9);
		Catalog.put(test.get(4).obtineIdentificator(), 1);
		
		//TODO 15: Folositi un simplu System.out.println pentru a afisa HashMapul catalog
		System.out.println(Catalog);
		
		//TODO 16: Iterati peste HashMapul catalog si afisati pe cate un rand fiecare key-value
		//cu formatarea "Studentul ID are nota NOTA" - ex: "Studentul ion_POPESCU are nota 7"
		for(Entry<String, Integer> pair : Catalog.entrySet()) {
			System.out.println("Studentul "+pair.getKey()+" are nota :  "+pair.getValue());
		}
		
		//TODO 17: Afisati dimensiunea listei de persoane si a catalogului
		
		System.out.println();
		System.out.println(test.size());
		System.out.println(Catalog.size());
		System.out.println();

		//TODO 18: Iterati peste lista de persoane si eliminati studentii cu nota mai mica decat 5
		//Pentru aceasta se va verifica valoarea notei pentru fiecare persoana din "catalog"
		//Daca se elimina o persoana din lista se va elimina si intrarea legata de aceasta din catalog
		//HINT: ordinea stergerilor conteaza
		
		
		Iterator<Map.Entry<String, Integer>>  iter = Catalog.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> aux = iter.next();
			for (int i = 0; i < test.size(); i++) {
				String temp = test.get(i).obtineIdentificator();
				if ((temp.equals(aux.getKey())) && aux.getValue() < 5) {
					test.remove(i);
					iter.remove();
				}
			}
		}
		
		
		
		
		
		//TODO 19: Afisati iar dimensiunea listei de persoane si a catalogului pentru a vedea rezultatele
		System.out.println();
		System.out.println(test.size());
		System.out.println(Catalog.size());
		System.out.println();

		
		//TODO 20: Afisati lista de persoane si catalogul pentru a vedea ca au fost sterse valorile corecte
		for(Entry<String, Integer> pair : Catalog.entrySet()) {
			System.out.println("Studentul "+pair.getKey()+" are nota :  "+pair.getValue());
		}
		
	}
}
