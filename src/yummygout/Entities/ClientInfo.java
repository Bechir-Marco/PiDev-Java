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
public class ClientInfo {
    private int id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String mdp;
    private String email;
    private int tel ;
    private int points;
    private int id_commande;

    public ClientInfo() {
    }

    public ClientInfo(int id_client, String nom, String prenom, String adresse, String mdp, String email, int tel, int points, int id_commande) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mdp = mdp;
        this.email = email;
        this.tel = tel;
        this.points = points;
        this.id_commande = id_commande;
    }

    public ClientInfo(String nom, String prenom, String adresse, String mdp, String email, int tel, int points, int id_commande) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mdp = mdp;
        this.email = email;
        this.tel = tel;
        this.points = points;
        this.id_commande = id_commande;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
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

    public String getAdress() {
        return adresse;
    }

    public void setAdress(String adresse) {
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    @Override
    public String toString() {
        return "ClientInfo{" + "id_client=" + id_client + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", mdp=" + mdp + ", email=" + email + ", tel=" + tel + ", points=" + points + ", id_commande=" + id_commande + '}';
    }
    
}
