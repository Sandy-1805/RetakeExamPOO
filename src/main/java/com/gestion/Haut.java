package com.gestion;

public class Haut extends Vetements{
    private TypeManche typeManche;
    private int quantiteHaut;


    public Haut(Materiel materiel, int prix_unitaire, Taille taille, String nom, TypeManche typeManche, int quantiteHaut) {
        super(materiel, prix_unitaire, taille, nom);
        this.typeManche = typeManche;
        this.quantiteHaut = quantiteHaut;
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }

    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }

    public int getQuantiteHaut() {
        return quantiteHaut;
    }

    public void setQuantiteHaut(int quantiteHaut) {
        this.quantiteHaut = quantiteHaut;
    }
}
