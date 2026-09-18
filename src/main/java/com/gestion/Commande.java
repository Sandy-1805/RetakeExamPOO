package com.gestion;

public class Commande {
    private String dateCommande;
    private String description;
    private Vetements vetements;
    private int quantite;
    private Haut haut;
    private Bas bas;
    private Client client;

    public Commande(String dateCommande, String description, int quantite, Haut haut, Bas bas, Client client) {
        this.dateCommande = dateCommande;
        this.description = description;
        this.vetements = vetements;
        this.quantite = quantite;
        this.haut = haut;
        this.bas = bas;
        this.client = client;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vetements getVetements() {
        return vetements;
    }

    public void setVetements(Vetements vetements) {
        this.vetements = vetements;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Haut getHaut() {
        return haut;
    }

    public void setHaut(Haut haut) {
        this.haut = haut;
    }

    public Bas getBas() {
        return bas;
    }

    public void setBas(Bas bas) {
        this.bas = bas;
    }

    static int coutTotal(int quantite, int prix_unitaire) {
        return quantite * prix_unitaire;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //methode pour calculer le cout total de la commande de vetements Haut + Bas
    public int coutTotal() {
        int coutHaut = 0;
        int coutBas = 0;
        if (haut != null) {
            coutHaut = haut.getPrix_unitaire() * haut.getQuantiteHaut() * quantite;
        }
        if (bas != null) {
            coutBas = bas.getPrix_unitaire() * bas.getQuantiteBas() * quantite;
        }
        return coutHaut + coutBas;
    }

    public static void main(String[] args) {
        Client c = new Client("Rakoto", "Jean", "1990-06-19", "LOT_IPV5_Andranomena", "jean@gmail.com", "0323203232");
        Haut h = new Haut(Materiel.Coton, 20000, Taille.M, "T-shirt", TypeManche.Courtes, 10);
        Bas b = new Bas(Materiel.Nylon, 5000, Taille.L, "Short_en_jean", 32, 5);

        c.getNom();

        System.out.println("Pour le client " + c.getNom());

        Commande commande = new Commande("2026-09-18", "Commande de vetements", 1, h, b, c);
        b.setQuantiteBas(1);
        h.setQuantiteHaut(2);

        System.out.println("Le cout total de la commande est : " + commande.coutTotal() + " Ariary");
    }


}
