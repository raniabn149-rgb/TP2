public class TesteCompte_ex1 {
    public static void main(String[] args) {
        Compte a = new Compte();
        Compte b = new Compte();

        a.deposer(500);
        b.deposer(1000);
        b.retirer(10);
        a.virerVers(75, b);

        System.out.print("Compte a : ");
        a.afficher();
        System.out.print("Compte b : ");
        b.afficher();

        System.out.print("TABLEAU \n");
        Compte[] tab = new Compte[10];

        for (int i = 0; i < 10; i++) {
            tab[i] = new Compte();
            tab[i].deposer(200 + 100 * i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                tab[i].virerVers(20, tab[j]);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Compte " + i + " : ");
            tab[i].afficher();
        }
    }
}
