/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yummygout.Entities;

import javafx.scene.image.Image;


/**
 *
 * @author tchet
 */
public class Categorie {
    private int id_categorie;
    private String nom;
    private Image image;

    public Categorie() {
    }

    public Categorie(int id_categorie, String nom, Image image) {
        this.id_categorie = id_categorie;
        this.nom = nom;
        this.image = image;
    }

    public Categorie(String nom, Image image) {
        this.nom = nom;
        this.image = image;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id_categorie=" + id_categorie + ", nom=" + nom + ", image=" + image + '}';
    }
    
    
}
