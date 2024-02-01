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
    
    public Integer getQualitéTragédie(){
        return this.perf.get("Trajedie");
    }

    public String getCitationTragédie(){
        return this.citation.get("Trajedie");
    }
    
    public Integer getQualitéComedie(){
        return this.perf.get("Comedie");
    }

    public String getCitationComedie(){
        return this.citation.get("Comedie");
    }

    public Integer getQualitéDrame(){
        return this.perf.get("Drame");
    }

    public String getCitationDrame(){
        return this.citation.get("Drame");
    }

    public String pointFort() {
        int min = -5;
        String res = null;
        for (Map.Entry<String, Integer> type : perf.entrySet()) {
            if (type.getValue() > min) {
                res = type.getKey();
            }
        }
        return res;
    }


    @Override
    public String toString(){
        String s1="L'honorable";
        return s1.concat(this.nom);
   } 
}