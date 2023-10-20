package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int hehe = 1;
        for (int i = 1; i <= power; i++) {
            hehe = hehe * numberToPrint;
        }
        System.out.println(hehe);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
