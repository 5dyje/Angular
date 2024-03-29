package com.Projet.Projet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "TASKS")
public class Tache {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "TITEL")
    private String titel;
//    @Column(name = "DATE_CREATION")
//    private Date date_creation ;
//    @Column(name = "DATE_LINITE")
//    private Date date_limite ;
    @Column(name = "DESCRIPTION")
    private String description ;
    @Column(name = "ETAT")
    private String etat;
    @Column(name = "PROPRIETE")
    private String propriete;
    @Column(name = "ASSIGNE_A")
    private String assigne_a ;
    @Column(name = "AVANCEMENT")
    private String avancement;
    private String categories;

    public Tache(int id, String titel, String description, String avancement,
                 String assigne_a, String categories, String propriete, String etat ){
        this.id = id;
        this.titel = titel;
//        this.description = description;
//        this.date_creation = date_creation;
//        this.date_limite = date_limite;
        this.avancement = avancement;
        this.assigne_a = assigne_a;
        this.categories = categories;
        this.propriete = propriete;
        this.etat = etat;
    }


    public int getId(){
        return id;
    }
    public void setId(){
        this.id =id;
    }
    public String getTitel(){
        return titel;
    }
    public void setTitel(){
        this.titel =titel;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }
//    public Date getDate_creation(){
//        return date_creation;
//    }
//    public void setDate_creation(){
//        this.date_creation = date_creation;
//    }
//    public Date getDate_limite(){
//        return date_limite;
//    }
//    public void setDate_limite(){
//        this.date_limite = date_limite;
//    }
    public String getEtat(){
        return etat;
    }
    public void setEtat(){
        this.etat = etat;
    }
    public String getPropriete(){
        return propriete;
    }
    public void setPropriete(){
        this.propriete = propriete;
    }
    public String getAssigne_a(){
        return assigne_a;
    }
    public void setAssigne_a(){
        this.assigne_a = assigne_a;
    }
    public String getAvancement(){
        return avancement;
    }
    public void setAvancement(){
        this.avancement = avancement;
    }
    public String getCategories(){
        return categories;
    }
    public void setCategories(){
        this.categories = categories;
    }


}
