public class Main {

    public static void main(String[] args) {

        double x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println(Point.distance(p1, p2));
    }
}
