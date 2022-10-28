package exe2;

import java.util.ArrayList;

public class Test {
    public static void main(String[]a){
        Classe c1=new Classe("client",false,false);
        Propriete p1 =new Propriete("numcl","int" , "protected");
        Propriete p2 =new Propriete("nomcl","String" , "private");
        Method m1=new Method("getNom", "Sting", "public","return this.nom;");
        Method m2=new Method("getNum", "int", "public","return this.num;");
        // System.out.println(p1.toString()); 
        // System.out.println(p2.toString());
        // System.out.println(m1.toString()); 
        // System.out.println(m2.toString()); 

        Classe c2=new Classe("Persone",true,false);
        
        ArrayList <Propriete> p=new ArrayList<>();
        p.add(p1);
        p.add(p2);
            c1.AjouterPropriete(p);
            ArrayList <Method> m=new ArrayList<>();
            m.add(m1);
            m.add(m2);
        c1.AjouterMethod(m);
    
       System.out.println(c1.toString()); 
       
    }

    
}
