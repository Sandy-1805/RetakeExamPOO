package com.gestion;

public class Haut extends Vetements{
    private TypeManche typeManche;


    public Haut(Materiel materiel, int prix_unitaire, Taille taille, String nom, TypeManche typeManche) {
        super(materiel, prix_unitaire, taille, nom);
        this.typeManche = typeManche;
    }

    public TypeManche getTypeManche() {
        return typeManche;
    }

    public void setTypeManche(TypeManche typeManche) {
        this.typeManche = typeManche;
    }
}
