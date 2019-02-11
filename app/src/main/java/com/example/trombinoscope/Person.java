package com.example.trombinoscope;

public class Person {



    private String nom;
    private String prenom;
    private int couleur;


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


    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public Person(String nom, String prenom, int couleur){
        this.nom=nom;
        this.prenom=prenom;
        this.couleur = couleur;

    }
}
