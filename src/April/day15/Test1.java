package April.day15;


public class Test1 {

    static class Box {
        private int width, height, depth;

        void setBox(int w, int h, int d) {
            width = w;
            height = h;
            depth = d;
        }

        void showBox() {
            System.out.println("width=" + width + "  height=" + height + "  depth=" + depth);
        }
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.setBox(10, 20, 30);
        b.showBox();
    }
}