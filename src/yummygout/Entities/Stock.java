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
public class Stock {
    private int id_stock;
    private String nom;
    private LocalDate date_ajout;
    private LocalDate date_fin;
    private int quantite;
    private float prix;
    private int id_fournisseur;

    public Stock() {
    }

    public Stock(int id_stock, String nom, LocalDate date_ajout, LocalDate date_fin, int quantite, float prix, int id_fournisseur) {
        this.id_stock = id_stock;
        this.nom = nom;
        this.date_ajout = date_ajout;
        this.date_fin = date_fin;
        this.quantite = quantite;
        this.prix = prix;
        this.id_fournisseur = id_fournisseur;
    }

    public Stock(String nom, LocalDate date_ajout, LocalDate date_fin, int quantite, float prix, int id_fournisseur) {
        this.nom = nom;
        this.date_ajout = date_ajout;
        this.date_fin = date_fin;
        this.quantite = quantite;
        this.prix = prix;
        this.id_fournisseur = id_fournisseur;
    }

    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(LocalDate date_ajout) {
        this.date_ajout = date_ajout;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    @Override
    public String toString() {
        return "Stock{" + "id_stock=" + id_stock + ", nom=" + nom + ", date_ajout=" + date_ajout + ", date_fin=" + date_fin + ", quantite=" + quantite + ", prix=" + prix + ", id_fournisseur=" + id_fournisseur + '}';
    }
    
    

    
}
