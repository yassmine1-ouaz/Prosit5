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
        Produit p1 = new ProduitFruit (1254 ,"Fraise", "Mars", 12.3f);
        Produit p2 = new ProduitFruit (1224 ,"Pastèque", "Juin", 50f);
        Produit p3 = new ProduitFruit (7896 ,"Mandarine", "Décembre", 25.6f);
        Produit p4 = new ProduitLegume (8521 ,"Artichauts", "Janvier", 14f);
        
        
         Magasin aziza = new Magasin(1, "ESPRIT ");
         aziza.ajouterProduit(p1);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p4);
        
        System.out.println("Stock fruit total de Magasin " + aziza.getNom() + " : " + aziza.calculStock());
        System.out.println("Fruit " + p1.getid() + " " + p1.getLibelle()+ " Frais (saison Mars) : ");
        
     }
}
