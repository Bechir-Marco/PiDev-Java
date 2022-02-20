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
public class Reclamation {
    private int id_reclamation;
    private String description;
    private LocalDate dateReclamation;
    private int id_personnel;

    public Reclamation() {
    }
    
    public Reclamation(int id_reclamation, String description, LocalDate dateReclamation, int id_personnel) {
        this.id_reclamation = id_reclamation;
        this.description = description;
        this.dateReclamation = dateReclamation;
        this.id_personnel = id_personnel;
    }

    public Reclamation(String description, LocalDate dateReclamation, int id_personnel) {
        this.description = description;
        this.dateReclamation = dateReclamation;
        this.id_personnel = id_personnel;
    }

    public int getId_reclamation() {
        return id_reclamation;
    }

    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateReclamation() {
        return dateReclamation;
    }

    public void setDateReclamation(LocalDate dateReclamation) {
        this.dateReclamation = dateReclamation;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id_reclamation=" + id_reclamation + ", description=" + description + ", dateReclamation=" + dateReclamation + ", id_personnel=" + id_personnel + '}';
    }
    
    
}
