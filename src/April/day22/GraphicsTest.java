package April.day22;

public class GraphicsTest {
    public static void main(String[] args) {
        PlaneGraphics pg;
        pg = new Rectangle(10, 20);
        pg.print();
        pg = new Rectangle();
        pg.print();
        pg = new Eclipse(10, 20);
        pg.print();
        pg = new Eclipse();
        pg.print();
    }
}
