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
public class Plat {
   private int id_plat ;
   private String name ;
   private String description;
   private Image image;
   private int favoris;
   private int id_categorie;

    public Plat() {
    }

    public Plat(int id_plat, String name, String description, Image image, int favoris, int id_categorie) {
        this.id_plat = id_plat;
        this.name = name;
        this.description = description;
        this.image = image;
        this.favoris = favoris;
        this.id_categorie = id_categorie;
    }

    public Plat(String name, String description, Image image, int favoris, int id_categorie) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.favoris = favoris;
        this.id_categorie = id_categorie;
    }

    public int getId_plat() {
        return id_plat;
    }

    public void setId_plat(int id_plat) {
        this.id_plat = id_plat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getFavoris() {
        return favoris;
    }

    public void setFavoris(int favoris) {
        this.favoris = favoris;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    @Override
    public String toString() {
        return "Plat{" + "id_plat=" + id_plat + ", name=" + name + ", description=" + description + ", image=" + image + ", favoris=" + favoris + ", id_categorie=" + id_categorie + '}';
    }
   
}
