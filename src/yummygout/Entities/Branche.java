/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yummygout.Entities;

import java.sql.Time;
import java.time.LocalDate;
import javafx.scene.image.Image;

/**
 *
 * @author tchet
 */
public class Branche {
    private int id_branche;
    private String nom;   
    private String contact;
    private String emplacement;
    private LocalDate heureOuverture;
    private LocalDate heurefermeture;
    private Image image;

    public Branche() {
    }

    public Branche(int id_branche, String nom, String contact, String emplacement, LocalDate heureOuverture, LocalDate heurefermeture, Image image) {
        this.id_branche = id_branche;
        this.nom = nom;
        this.contact = contact;
        this.emplacement = emplacement;
        this.heureOuverture = heureOuverture;
        this.heurefermeture = heurefermeture;
        this.image = image;
    }

    public Branche(String nom, String contact, String emplacement, LocalDate heureOuverture, LocalDate heurefermeture, Image image) {
        this.nom = nom;
        this.contact = contact;
        this.emplacement = emplacement;
        this.heureOuverture = heureOuverture;
        this.heurefermeture = heurefermeture;
        this.image = image;
    }

    public int getId_branche() {
        return id_branche;
    }

    public void setId_branche(int id_branche) {
        this.id_branche = id_branche;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public LocalDate getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(LocalDate heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public LocalDate getHeurefermeture() {
        return heurefermeture;
    }

    public void setHeurefermeture(LocalDate heurefermeture) {
        this.heurefermeture = heurefermeture;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Branche{" + "id_branche=" + id_branche + ", nom=" + nom + ", contact=" + contact + ", emplacement=" + emplacement + ", heureOuverture=" + heureOuverture + ", heurefermeture=" + heurefermeture + ", image=" + image + '}';
    }
    
    
}
