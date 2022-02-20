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
public class Blog {
    private int id_blog ;
    private String titre;
    private String description;

    public Blog() {
    }

    public Blog(int id_blog, String titre, String description) {
        this.id_blog = id_blog;
        this.titre = titre;
        this.description = description;
    }

    public Blog(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public int getId_blog() {
        return id_blog;
    }

    public void setId_blog(int id_blog) {
        this.id_blog = id_blog;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Blog{" + "id_blog=" + id_blog + ", titre=" + titre + ", description=" + description + '}';
    }
    
    
}
