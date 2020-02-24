package mostFamousAlgorithms;

public class MonteCarloAlgorithm {
    public static void main(String[] args) {

        /* The reason for this is that the for-each loop internally does not have a counter;
        it is based on the Iterable interface, i.e. it uses an Iterator to loop through the
        "collection" - which may not be a collection at all, and may in fact be something
        not at all based on indexes (such as a linked list).
         */

        int[] array = new int[100];

        for (int index = 0; index < 100; index++) {
            array[index] = (int) (Math.random() * 100 + 1);
        }

        for (int index = 0; index < 100; index++) {
            System.err.println(array[index]);
        }
    }
}
