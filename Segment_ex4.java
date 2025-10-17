class Segment {
    int extr1;
    int extr2;

    public Segment(int e1, int e2) {
        extr1 = e1;
        extr2 = e2;
    }

    public int longueur() {
        return Math.abs(extr2 - extr1);
    }

    public boolean appartient(int point) {
        return point >= Math.min(extr1, extr2) && point <= Math.max(extr1, extr2);
    }

    public String toString() {
        return "Segment (" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + ")";
    }
}
