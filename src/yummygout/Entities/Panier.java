/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yummygout.Entities;

/**
 *
 * @author tchet
 */
public class Panier {
   private int id_panier ;
   private int quantite ;
   private int id_plat ;

    public Panier() {
    }

    public Panier(int id_panier, int quantite, int id_plat) {
        this.id_panier = id_panier;
        this.quantite = quantite;
        this.id_plat = id_plat;
    }

    public Panier(int quantite, int id_plat) {
        this.quantite = quantite;
        this.id_plat = id_plat;
    }

    public int getId_panier() {
        return id_panier;
    }

    public void setId_panier(int id_panier) {
        this.id_panier = id_panier;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getId_plat() {
        return id_plat;
    }

    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }

    @Override
    public String toString() {
        return "Panier{" + "id_panier=" + id_panier + ", quantite=" + quantite + ", id_plat=" + id_plat + '}';
    }

}
