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
    
    public Integer getQualiteTragedie(){
        return this.perf.get("Trajedie");
    }

    public String getCitationTragedie(){
        return this.citation.get("Trajedie");
    }
    
    public Integer getQualiteComedie(){
        return this.perf.get("Comedie");
    }

    public String getCitationComedie(){
        return this.citation.get("Comedie");
    }

    public Integer getQualiteDrame(){
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
                min = type.getValue();
            }
        }
        return res;
    }

    public int qualitStyle(Style s){
        return this.perf.get(s.toString());
    }


    public String citationStyle(Style s){
        return this.citation.get(s.toString());
    }



    @Override
    public String toString(){
        String s1="L'honorable";
        return s1.concat(this.nom);
   } 
}
ubgeizgfriuezgfezSYZELUYSFVUYSJVFjhedsuyvfeFSVFJHSEDVFHVFSDVVGHFDSF