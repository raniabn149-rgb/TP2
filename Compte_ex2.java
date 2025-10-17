class Compte_ex2 {
    String titulaire;
    int solde = 0;

    Compte_ex2(String nomTitulaire) {
        titulaire = nomTitulaire;
    }

    void deposer(int montant) {
        solde = solde + montant;
    }

    void retirer(int montant) {
        solde = solde - montant;
    }

    void virerVers(int montant, Compte_ex2 destination) {
        this.retirer(montant);
        destination.deposer(montant);
    }

    void afficher() {
        System.out.println("Titulaire : " + titulaire + " | Solde : " + solde + " euros");
    }
}
