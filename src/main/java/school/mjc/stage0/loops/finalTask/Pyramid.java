package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int numberR = cathetusLength;
        int numberL = cathetusLength;


        for(int i = 1; i <= cathetusLength; i++) {
            int nomer = i - 1;
            int hehe = 0;
            boolean ok = false;
            for(int j = 1; j <= cathetusLength * 2; j++){
                if(nomer < 2) {
                    ok = true;
                }

                if (j == numberL || j == numberR){
                    System.out.print(i);

                }else if(j < numberL){
                    System.out.print(" ");
                }else if(j > numberR){
                    continue;
                }
                else {
                    System.out.print(ok ? nomer++ : nomer--);
                }
            }
            numberL = numberL - 1;
            numberR = numberR + 1;

            System.out.println();

        }


    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
