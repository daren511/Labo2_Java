public abstract class Personnage{

   //Déclaration privée du nom / Sexe
   private String nom;
   private char sexe;

   public Personnage(String nom,char sexe){
      this.nom = nom;
      setSexe(sexe);
   }

   public void setSexe(char sexe){
      if(sexe == 'M'|| sexe == 'm' || sexe=='f'|| sexe =='F'){
         this.sexe = sexe;
      }
   }

   public char getSexe(){
      return sexe;
   }
   public String getNom(){
      return nom;
   }
   public void setNom(String nom){
      this.nom = nom;
   }
}