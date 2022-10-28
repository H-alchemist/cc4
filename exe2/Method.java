package exe2;

import java.util.ArrayList;

public class Method {
   
   
    private String nom;
    private String typeretour;
    private String ModeAcces;
    private String code;
    private ArrayList<Parametre> Para;
   
    
     


    public Method(String nom, String typeretour, String modeAcces, String code) {
        this.nom = nom;
        this.typeretour = typeretour;
        ModeAcces = modeAcces;
        this.code = code;
        
    }

    public void setPara(Parametre p) {
        this.Para.add(p);
    }
   
    public String toString() {
        return "\n" +  ModeAcces +" " + typeretour + " " + nom+"(){"+code+"}";
    }


    
    
    
}
