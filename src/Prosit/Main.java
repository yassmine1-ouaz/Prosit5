/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prosit;

/**
 *
 * @author octanet
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        
        Produit[] produits = new Produit[4];
        try {
        ProduitFruit p1 = null;
		
           p1 = new ProduitFruit (1254 ,"Fraise", "Mars", 12.3f);
        } catch (PrixNegatifException e) {
                    //..
		}
                ProduitFruit p2 = null;
		try {
           p2 = new ProduitFruit (1224 ,"Pastèque", "Juin", 50f);
            } catch (PrixNegatifException e) {

		}
                  ProduitFruit p3 = null;
		try {
           p3 = new ProduitFruit (7896 ,"Mandarine", "Décembre", 25.6f);
        
         } catch (PrixNegatifException e) {

		}
                  ProduitFruit p4= null;
		try {
            p4 = new ProduitLegume (8521 ,"Artichauts", "Janvier", 14f);
            
                }catch (PrixNegatifException e) {

		}
        
        
         Magasin aziza = new Magasin(1, "ESPRIT ");
         try {
         aziza.ajouterProduit(p1);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p4);
         } catch (PrixNegatifException e) {
             
                       System.out.println("Eexception");
			System.err.println(e.getMessage());
			
		}
        
        System.out.println("Stock fruit total de Magasin " + aziza.getNom() + " : " + aziza.calculStock());
        System.out.println("Fruit " + p1.getid() + " " + p1.getLibelle()+ " Frais (saison Mars) : ");
        
     }
}
