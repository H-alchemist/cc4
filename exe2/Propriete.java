package exe2;

public class Propriete {
    
    private String nom;
    private String type;
    private String ModeAcces;

    public Propriete(String nom, String type, String modeAcces) {
        this.nom = nom;
        this.type = type;
        ModeAcces = modeAcces;
    } 
    
    public String toString() {
        return "\n" + ModeAcces + " " + type + " " + nom + ";";
    }
    
}
