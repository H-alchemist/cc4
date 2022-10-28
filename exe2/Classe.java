package exe2;

import java.util.ArrayList;

public class Classe {
    private String nom;
    private Boolean isAbstract;
    private Boolean isFinal;
    private ArrayList <Propriete> Pro;
    private ArrayList <Method> Met;
    
    
    
    public Classe(String nom, Boolean isAbstract, Boolean isFinal) {
        this.nom = nom;
        this.isAbstract = isAbstract;
        this.isFinal = isFinal;
        
    }
    public Classe() {
        
    }
    public void AjouterPropriete( ArrayList <Propriete> Pro)
    {
        this.Pro=Pro;
         
    }
    public void AjouterMethod(ArrayList <Method> Met)
    {
        this.Met=Met;
    }
    
    public String toString() {
        return "public class "+ nom + "" + " " +  "{ " + Pro.get(0)+ ""+Pro.get(1) + ""+ Met.get(0)+ ""+ Met.get(1) + "}";
    }


}
