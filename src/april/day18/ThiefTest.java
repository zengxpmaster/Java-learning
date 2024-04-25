package april.day18;

public class ThiefTest {
    public static void main(String[] args) {
        ThiefFather thief1, thief2;
        thief1 = new ThiefFather("扳手");
        thief2 = new ThiefSon("尖嘴钳");
        thief1.steal();
        thief2.steal();
    }
}
