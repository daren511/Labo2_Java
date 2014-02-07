public abstract class Personnage{

   //Déclaration privée du nom / Sexe
   private String nom;
   private char sexe;

   public Personnage(){
      nom = "";
      sexe = '';
   }

   public SetSexe(char sexe){
      sexe=this.sexe;
   }

   public GetSexe(sexe){
      return sexe;
   }

}