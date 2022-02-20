/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yummygout.Entities;

import java.time.LocalDate;

/**
 *
 * @author tchet
 */
public class Livraison {
    private int id_livraison;
    private LocalDate date;
    private int id_facture;
    private int id_personnel;

    public Livraison() {
    }

    public Livraison(int id_livraison, LocalDate date, int id_facture, int id_personnel) {
        this.id_livraison = id_livraison;
        this.date = date;
        this.id_facture = id_facture;
        this.id_personnel = id_personnel;
    }

    public Livraison(LocalDate date, int id_facture, int id_personnel) {
        this.date = date;
        this.id_facture = id_facture;
        this.id_personnel = id_personnel;
    }

    public int getId_livraison() {
        return id_livraison;
    }

    public void setId_livraison(int id_livraison) {
        this.id_livraison = id_livraison;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id_livraison=" + id_livraison + ", date=" + date + ", id_facture=" + id_facture + ", id_personnel=" + id_personnel + '}';
    }
    
    
}
