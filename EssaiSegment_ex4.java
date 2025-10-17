import java.util.Scanner;

public class EssaiSegment_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer la première extrémité du segment : ");
        int e1 = sc.nextInt();

        System.out.print("Entrer la deuxième extrémité du segment : ");
        int e2 = sc.nextInt();

        System.out.print("Entrer la coordonnée d’un point : ");
        int point = sc.nextInt();

        Segment s = new Segment(e1, e2);

        System.out.println("Le " + s.toString());
        System.out.println("Longueur du segment : " + s.longueur());

        if (s.appartient(point)) {
            System.out.println("Le point " + point + " appartient au " + s.toString());
        } else {
            System.out.println("Le point " + point + " n’appartient pas au " + s.toString());
        }

        sc.close();
    }
}
