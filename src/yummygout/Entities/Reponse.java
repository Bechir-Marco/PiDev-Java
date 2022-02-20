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
public class Reponse {
    private int id_rep;
    private String description;
    private int id_personnel;

    public Reponse() {
    }

    public Reponse(int id_rep, String description, int id_personnel) {
        this.id_rep = id_rep;
        this.description = description;
        this.id_personnel = id_personnel;
    }

    public Reponse(String description, int id_personnel) {
        this.description = description;
        this.id_personnel = id_personnel;
    }

    public int getId_rep() {
        return id_rep;
    }

    public void setId_rep(int id_rep) {
        this.id_rep = id_rep;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    @Override
    public String toString() {
        return "Reponse{" + "id_rep=" + id_rep + ", description=" + description + ", id_personnel=" + id_personnel + '}';
    }
    
    
}
