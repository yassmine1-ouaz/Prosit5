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
public class Produit {

    int id;
  //  String type;
    String libelle;
    float quantite;
    String saison;

    public Produit() {
    }

    public Produit(int id, String libelle, String saison,float quantite) {
        this.id = id;
        //this.type = type;
        this.libelle = libelle;
        this.quantite = quantite;
        this.saison = saison;
        
      
    }
    
    
    public String getLibelle (){
        return this.libelle;
    }
    
    public String determinerTypeProduit() {
        if (this instanceof ProduitFruit) {
            return ("Fruit");
        } else if (this instanceof ProduitLegume) {
            return ("Légume");
        } else {
            return ("Autre");
        }
    }
  
  //  void afficher() {

    //    System.out.println("le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix);
   // }

   // @Override
   // public String toString() {
   //     return "le produit est id = " + this.id + "\nlibelle " + this.libelle + "\nmarque" + marque + "\nprix" + this.prix;
   // }
    
     //prosit 3 quest1 
    public boolean comparer(Produit p){
        return ((this.id==p.id)&&(this.libelle==p.libelle));
   }
    
    
    
}
