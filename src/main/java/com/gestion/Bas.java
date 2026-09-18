package com.gestion;

public class Bas extends Vetements{
        private int tourDeTaille;
        private int quantiteBas;


    public Bas(Materiel materiel, int prix_unitaire, Taille taille, String nom, int tourDeTaille, int quantiteBas) {
        super(materiel, prix_unitaire, taille, nom);
        this.tourDeTaille = tourDeTaille;
        this.quantiteBas = quantiteBas;

    }

    public int getTourDeTaille() {
        return tourDeTaille;
    }

    public void setTourDeTaille(int tourDeTaille) {
        this.tourDeTaille = tourDeTaille;
    }

    public int getQuantiteBas() {
        return quantiteBas;
    }

    public void setQuantiteBas(int quantiteBas) {
        this.quantiteBas = quantiteBas;
    }
}
