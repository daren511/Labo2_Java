public class Sorcier extends Personnage{

   //D�claration priv�e du type de sorcier
   private String type;


   public Sorcier(String nom,Char sexe,String type){
      Super (String nom,char sexe);
      type = "";
   }
   public setType(String type){
      type = this.type;
   }
   public getType(String type){
      return type;
   }
}