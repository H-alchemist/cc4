package exe1;

public class Employe {
   

    private int id;
    private String nom;
    public String getNom() {
        return nom;
    }
    private String prenom;
    public String getPrenom() {
        return prenom;
    }
    private int age ;

     public Employe(int id, String nom, String prenom, int age ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        if(age>23){
        this.age = age;
         }else{
            System.out.println("age inferieur a 23"); 
         }
    }
                  //Accesseurs
   public String toString() {
        return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ",age="+age+ "]";
    }}

