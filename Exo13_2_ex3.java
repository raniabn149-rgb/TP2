class Compteur_ex3 {
    int x;
    Compteur_ex3(int n) { x = n; }
    Compteur_ex3 incremente() { x++; return this; }
    int value() { return x; }
}

public class Exo13_2_ex3 {
    public static void main(String[] args) {
        Compteur_ex3 c1, c2, c3;
        c1 = new Compteur_ex3(0);
        c1.incremente();
        c2 = new Compteur_ex3(1);
        c3 = c1;

        if (c1 == c3) {
            System.out.println("c1 et c3 sont egaux");
        } else {
            System.out.println("c1 et c3 ne sont pas egaux");
        }

        if (c1.value() == c2.value()) {
            System.out.println("c1 et c2 ont meme valeur");
        } else {
            System.out.println("c1 et c2 n'ont pas la meme valeur");
        }

        if (c1 == c2) {
            System.out.println("c1 et c2 sont egaux");
        } else {
            System.out.println("c1 et c2 ne sont pas egaux");
        }

        if (c1.value() == c1.incremente().value()) {
            System.out.println("c1 et c1 incremente ont meme valeur");
        } else {
            System.out.println("c1 et c1 incremente n'ont pas la meme valeur");
        }
    }
}
