package com.gestion;

public class Vetements {
    private String nom;
    private Taille taille;
    private int prix_unitaire;
    private Materiel materiel;

    public Vetements(Materiel materiel, int prix_unitaire, Taille taille, String nom) {
        this.materiel = materiel;
        this.prix_unitaire = prix_unitaire;
        this.taille = taille;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public int getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(int prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public static void main(String[] args) {
        Haut h = new Haut(Materiel.Coton, 20000, Taille.M, "T-shirt", TypeManche.Courtes);
        Bas b = new Bas(Materiel.Nylon, 5000, Taille.L, "Short_en_jean", 32);

        h.getTypeManche();

        System.out.println(h.getTypeManche());
    }
}

