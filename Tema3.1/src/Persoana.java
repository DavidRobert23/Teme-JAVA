
public class Persoana {
    String nume,prenume,strada,oras;
        int varsta;
        boolean casatorit;
       String id="davidrobert_";
        
      public Persoana(String nume) {
      this.nume = nume;
      }
      public void persPrenume(String persPrenume) {
      prenume = persPrenume;
      }
   public void persVarsta(int persVarsta) {
      varsta = persVarsta; 
   }
   public void persOras(String persOras) {
      oras = persOras;
   }
   public void persCasatorit(boolean persCasatorit) {
      casatorit = persCasatorit;
   }
   public void persStrada(String persStrada){
       strada=persStrada;
   }
   public void printPersoana() {
      System.out.println("Nume:"+ nume );
      System.out.println("Prenume:" + prenume );
      System.out.println("Varsta:" + varsta );
      System.out.println("Oras:" + oras );
      System.out.println("Casatorit:" + casatorit);
      System.out.println("Strada:" + strada);      
   }
    @Override
   public String toString(){
   return "hello  "+"Nume:"+ nume + " Prenume:"+prenume+" Varsta:"+varsta+" Oras:"+oras+" Casatorit:"+casatorit;
   }
    public static void Curs() {
     String curs = "Java";
        System.out.println("Curs: " + curs);   
    }
    public String obtineIdentificator(){
       return id +nume+prenume;
    }
    public void zi_de_nastere(Integer varsta){
    	Integer age= varsta+1;
    	System.out.println("Varsta Noua: " + age);
     }
}