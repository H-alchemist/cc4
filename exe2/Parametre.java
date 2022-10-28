package exe2;

public class Parametre {
     String nom;
    private String type;
   
   
    public Parametre(String n, String t) {
        this.nom = n;
        this.type = t;
    }
    
     public String toString() {
        return "Parametre nom=" + nom + ", type=" + type + "";
    }
    
}
