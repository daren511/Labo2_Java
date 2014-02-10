public abstract class Personnage{

   //D�claration priv�e du nom / Sexe
   private String nom;
   private char sexe;
   
   // Constructeur 2 params
   public Personnage(String nom,char sexe){
      this.nom = nom;
      setSexe(sexe);
   }
   //Setter du sexe
   public void setSexe(char sexe){
      if(sexe == 'M'|| sexe == 'm' || sexe=='f'|| sexe =='F'){
         this.sexe = sexe;
      }
   }
   //Getter du sexe
   public char getSexe(){
      return sexe;
   }
   //Getter du nom
   public String getNom(){
      return nom;
   }
   //Setter du Nom
   public void setNom(String nom){
      this.nom = nom;
   }
}