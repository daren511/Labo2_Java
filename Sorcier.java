public class Sorcier extends Personnage{

   //Declaration static du nombre de sorciers
   static private int nbSorciers = 0;

   //Déclaration privée du type de sorcier
   private String type = "inconnu";


   public Sorcier(String nom,char sexe,String type){
      super(nom,sexe);
      this.setType(type);
      this.nbSorciers++;
   }
   public Sorcier(String nom,char sexe){
      super(nom,sexe);
      this.nbSorciers++;
   }
   public void setType(String type){
      if(type.equals("eau")||type.equals("feu")||type.equals("terre")||type.equals("air")){
         this.type = type;
      }
   }
   public String GetType(){
      return type;
   }

   static public int getNbSorciers(){
      return nbSorciers;
   }
   public String toString(){
      String chaine = "";
      if(getSexe() == 'M' || getSexe() == 'm'){
         chaine = "Mon nom est " + super.getNom() + " et je suis un sorcier de type " + GetType();
      }
      else if(getSexe() == 'F' || getSexe() == 'f'){
         chaine = "Mon nom est " + super.getNom() + " et je suis une sorcière de type " + GetType();
      }
      return chaine;
   }
}