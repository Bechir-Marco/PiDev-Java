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
public class Avis {
   private int id_avis;
   private LocalDate date;
   private Boolean like;
   private Boolean dislike;
   private int id_client;

    public Avis() {
    }

    public Avis(int id_avis, LocalDate date, Boolean like, Boolean dislike, int id_client) {
        this.id_avis = id_avis;
        this.date = date;
        this.like = like;
        this.dislike = dislike;
        this.id_client = id_client;
    }

    public Avis(LocalDate date, Boolean like, Boolean dislike, int id_client) {
        this.date = date;
        this.like = like;
        this.dislike = dislike;
        this.id_client = id_client;
    }

    public int getId_avis() {
        return id_avis;
    }

    public void setId_avis(int id_avis) {
        this.id_avis = id_avis;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public Boolean getDislike() {
        return dislike;
    }

    public void setDislike(Boolean dislike) {
        this.dislike = dislike;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "Avis{" + "id_avis=" + id_avis + ", date=" + date + ", like=" + like + ", dislike=" + dislike + ", id_client=" + id_client + '}';
    }

    
    
}
