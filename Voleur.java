final public class Voleur extends Personnage {

   //Variable static pour le nombre de voleurs
   static private int nbVoleur = 0;

   //Déclaration privée du nbLarcins
   private int nbLarcins;

   public Voleur(String nom,char sexe,int nbLarcins){
      super (nom,sexe);
      this.nbLarcins = nbLarcins;
      this.nbVoleur++;
   }
   public Voleur(String nom,char sexe){
      super (nom,sexe);
      this.nbLarcins = 0;
      this.nbVoleur++;

   }
   public String toString(){
      String chaine = "";
      if(getSexe() == 'M' || getSexe() == 'm'){
         chaine = "Mon nom est " + super.getNom() + " et je suis un voleur ayant commis " + getNbLarcins() + " larcin(s).";
      }
      else if(getSexe() == 'F' || getSexe() == 'f'){
         chaine = "Mon nom est " + super.getNom() + " et je suis une voleuse ayant commis " + getNbLarcins() + " larcin(s).";
      }
      return chaine;
   }
   static public int getNbVoleurs(){
      return nbVoleur;
   }
   public int getNbLarcins(){
      return nbLarcins;
   }
   public void incNbLarcins(){
      nbLarcins++;
   }
}