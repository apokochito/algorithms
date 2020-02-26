package mostFamousAlgorithms;

public class MonteCarlo {

    /* The reason for this is that the for-each loop internally does not have a counter;
        it is based on the Iterable interface, i.e. it uses an Iterator to loop through the
        "collection" - which may not be a collection at all, and may in fact be something
        not at all based on indexes (such as a linked list).
         */

    public void startCarloMethod() {

        float[] array = new float[100000000];

        int odd = 0;
        int even = 0;

        for (int index = 0; index < 100000000; index++) {
            array[index] = (int) (Math.random() * 2);
            if (array[index] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Pares (even): "+even);
        System.out.println("Impares (odd): "+odd);
        float pi = (float) even/100000000;
        System.err.println(pi*4);

    }

}
