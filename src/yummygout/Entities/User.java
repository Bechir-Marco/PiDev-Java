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
public class User {
    private int id_user;
    private String nom;
    private String prenom;
    private String adresse;
    private String mdp;
    private String email;
    private int tel ;
    private String role;

    public User() {
    }

    public User(String nom, String prenom, String adresse, String mdp, String email, int tel, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mdp = mdp;
        this.email = email;
        this.tel = tel;
        this.role = role;
    }

    public User(int id_user, String nom, String prenom, String adresse, String mdp, String email, int tel, String role) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mdp = mdp;
        this.email = email;
        this.tel = tel;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", mdp=" + mdp + ", email=" + email + ", tel=" + tel + ", role=" + role + '}';
    }
    
    
    
    
    
}

