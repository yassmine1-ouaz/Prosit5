/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prosit;

/**
 *
 * @author Mohamed
 */
public class Magasin {
    private int id ;
    private String nom;
    private String adresse ;
    private int capacite; 
    private Produit[] produits;
    public int nbTotal;
    public int nbEmp =20;
    public  int nbTotalemp;
    
    
public  Magasin(){
      this.produits= new Produit[50];
   
}  

//quest 3

public void supprimer (Produit p ){
    int index=-1 ;

     for (int i=0;i<this.capacite; i++){
         if (comparer(this.produits[i],p)){
            index = 1 ;
            break;
         }
     }
     if (index ==49){
         produits[index]=null;
     }
     for (int i =index;i<capacite;i++){
         produits[i]=produits[i+1];
        
     }
     capacite--;
     produits[capacite]=null;
     }

public Magasin (int id ,String adresse){
    this.id=id;
    this.adresse= adresse ;
    this.capacite=0;
     this.produits= new Produit[50];

}
public void ajouterProduit (Produit p){
    if (this.capacite<50){
    // quest 2
    if (rechercher (p)){
    //tab[i]=2;    
    produits[this.capacite]=p;
    this.capacite++;
    }else 
    {
        System.out.println("Tableau plient .....");
    }
    
}

}
  @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", adresse=" + adresse + ", capcite=" + capacite + ", Produits=" + produits + '}';
    }
 //public boolean comparer(Produit p1 , Produit p2){
 //       return ((p1.id==p2.id)&&(p1.libelle==p2.libelle)&&(p1.prix==p2.prix));
  //  }
 
 //quest2 
 
 public boolean rechercher(Produit p){
     boolean resultat = false;
     int i =0;
     while ((resultat)||(i<this.capacite)){
          resultat=comparer(p, this.produits[i]);
          i++;
     }
 
   return resultat;
 }
 /////////////////////////////
 
   public void ajouter() {
         System.out.println("Magasin{" + "id=" + id + ", adresse=" + adresse + ", capacité=" + capacite);
         System.out.println("List des produits :- "); 
 
}

    private boolean comparer(Produit p, Produit produit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

    
}
