public class Auteur{
    private String Nom;
    private int perfoTraj;
    private int perfoCom;
    private int perfoDrame;

    public Auteur(nom,perfoTraj,perfoCom,perfoDrame){
        this.Nom=nom;
        this.perfoTraj=perfoTraj;
        this.perfoCom=perfoCom;
        this.perfoDrame=perfoDrame;
    }
    public int getQualitéTragédie(){
        return this.perfoTraj;
    }
}