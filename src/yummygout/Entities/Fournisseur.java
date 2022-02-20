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
public class Fournisseur {
private int id_fournisseur;
private String nom;
private String prenom;
private String categorieFournisseur;
private int tel;
private String adresse;

    public Fournisseur() {
    }

    public Fournisseur(String nom, String prenom, String categorieFournisseur, int tel, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.categorieFournisseur = categorieFournisseur;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Fournisseur(int id_fournisseur, String nom, String prenom, String categorieFournisseur, int tel, String adresse) {
        this.id_fournisseur = id_fournisseur;
        this.nom = nom;
        this.prenom = prenom;
        this.categorieFournisseur = categorieFournisseur;
        this.tel = tel;
        this.adresse = adresse;
    }

    public int getId_fournisseur() {
        return id_fournisseur;
    }

    public void setId_fournisseur(int id_fournisseur) {
        this.id_fournisseur = id_fournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCategorieFournisseur() {
        return categorieFournisseur;
    }

    public void setCategorieFournisseur(String categorieFournisseur) {
        this.categorieFournisseur = categorieFournisseur;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "id_fournisseur=" + id_fournisseur + ", nom=" + nom + ", prenom=" + prenom + ", categorieFournisseur=" + categorieFournisseur + ", tel=" + tel + ", adresse=" + adresse + '}';
    }


    
}
