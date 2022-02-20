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
public class Personnel {
    private int id_personnel;
    private LocalDate dateEmbauche;
    private float salaire;
    private String fonction;
    private String branche;

    public Personnel() {
    }

    public Personnel(int id_personnel, LocalDate dateEmbauche, float salaire, String fonction, String branche) {
        this.id_personnel = id_personnel;
        this.dateEmbauche= dateEmbauche;
        this.salaire = salaire;
        this.fonction = fonction;
        this.branche = branche;
    }

    public Personnel(LocalDate dateEmbauche, float salaire, String fonction, String branche) {
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
        this.fonction = fonction;
        this.branche = branche;
    }

    public int getId_fichep() {
        return id_personnel;
    }

    public void setId_fichep(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public String toString() {
        return "FichePersonnel{" + "id_personnel=" + id_personnel + ", dateEmbauche=" + dateEmbauche + ", salaire=" + salaire + ", fonction=" + fonction + ", branche=" + branche + '}';
    }
    
    
}
