package com.gestion;

public class Bas extends Vetements{
        private int tourDeTaille;


    public Bas(Materiel materiel, int prix_unitaire, Taille taille, String nom, int tourDeTaille) {
        super(materiel, prix_unitaire, taille, nom);
        this.tourDeTaille = tourDeTaille;

    }

    public int getTourDeTaille() {
        return tourDeTaille;
    }

    public void setTourDeTaille(int tourDeTaille) {
        this.tourDeTaille = tourDeTaille;
    }
}
