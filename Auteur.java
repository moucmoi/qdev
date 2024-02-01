import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <String, Integer> perf;
    private Map <String, String> citation;
    public Auteur(String nom,int trajedie, String cittra, int comedie, String citcom, int drame, String citdram){
        this.nom=nom;
        this.perf=new HashMap<>();
        this.citation=new HashMap<>();
        this.citation.put("Trajedie",cittra);
        this.citation.put("Comedie",citcom);
        this.citation.put("Drame",citdram);
        
        this.perf.put("Trajedie", trajedie);
        this.perf.put("Comedie", comedie);
        this.perf.put("Drame", drame);
    }
    
    public Map <String, Integer> getQualitéTragédie(){
        return this.perfoTraj;
    }

    public  getCitationTragédie

   @Override
   public String toString(){
        String s1="L'honorable";
        return s1.concat(this.nom);
   } 
}