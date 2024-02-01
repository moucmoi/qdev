import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <String, Integer> perfoTraj;
    private Map <String, Integer> perfoCom;
    private Map <String, Integer> perfoDrame;
    public Auteur(String nom){
        this.nom=nom;
        this.perfoTraj=new HashMap<>();
        this.perfoCom=new HashMap<>();
        this.perfoDrame=new HashMap<>();
    }
    
    public Map <String, Integer> getQualitéTragédie(){
        return this.perfoTraj;
    }

   @Override
   public String toString(){
        String s1="L'honorable";
        return s1.concat(this.nom);
   } 
}