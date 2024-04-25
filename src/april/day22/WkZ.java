package april.day22;

public class WkZ extends Animal {
    WkZ(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("wkz 会吃 飞的何定志");
    }

    public void run() {
        System.out.println("wkz 会 飞");
    }
}
