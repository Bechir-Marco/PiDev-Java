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
public class Facture {
  private int id_facture;
  private int id_plat ;
   private int id_client;

    public Facture() {
    }

    public Facture(int id_facture, int id_plat, int id_client) {
        this.id_facture = id_facture;
        this.id_plat = id_plat;
        this.id_client = id_client;
    }

    public Facture(int id_plat, int id_client) {
        this.id_plat = id_plat;
        this.id_client = id_client;
    }

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public int getId_plat() {
        return id_plat;
    }

    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "Facture{" + "id_facture=" + id_facture + ", id_plat=" + id_plat + ", id_client=" + id_client + '}';
    }
   

}
