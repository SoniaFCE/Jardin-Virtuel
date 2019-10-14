import java.util.HashMap;

public class Jardin {
       private int longueur;
       private int largeur;
       private Emplacement emplacement[][];
       private HashMap<String, Integer> panier;
       
       public Jardin(int longueur,int largeur) {
              this.panier = new HashMap<String, Integer>();
              this.panier.put("Ail" ,4);
              this.panier.put("Carotte" ,2 );
              this.panier.put("Betterave" ,7 );
              this.longueur = longueur;
              this.largeur = largeur;
              emplacement = new Emplacement[longueur][largeur];
              
       }
}  