public class Voleur extends Personnage{

   //Déclaration privée du nbLarcins
   private int nbLarcins = 0;

   public Voleur(String nom,Char sexe,Int nbLarcins){
      Super (String nom,char sexe);
      nbLarcins = 0;
   }
   public Voleur(String nom,Char Sexe){
      Super (String nom,char sexe);
   }
}