public class Auteur{
    private String Nom;
    private Map <String.Integer> perfoTraj;
    private Map <String.Integer> perfoCom;
    private Map <String.Integer> perfoDrame;

    public Auteur(nom){
        this.Nom=nom;
        this.perfoTraj=new HashMap<>();
        this.perfoCom=new HashMap<>();
        this.perfoDrame=new HashMap<>();
    }
    public int getQualitéTragédie(){
        return this.perfoTraj;
    }

   @Override
   public String toString(){
        string s1="L'honorable";
        return s1.concat(this.nom);
   } 
}