package exe1;



import java.util.HashMap;

public class Test {
    public static void main(String[]a) {

        HashMap <Integer,Employe> collection=new HashMap<>();

        Employe em1=new Employe(1, "echchabli", "hamza", 40);
        Employe em2=new Employe(2, "Alami", "Ali", 45);
        Employe em3=new Employe(3, "kolchi", "ismail", 30);
        collection.put(1,em1);
        collection.put(2,em2);
        collection.put(3,em3);
       

        for (int i=1; i < collection.size(); i++) {
            if(collection.get(i).getNom()=="Alami" && collection.get(i).getPrenom()=="Ali"){
                System.out.println("employe est existe dans la collection est son id:"+i); 

            }else{
                System.out.println("employe n'existe pas dans la collection "); 

            }
            
        }
        System.out.println(collection);

        
    }
}
