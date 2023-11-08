import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 8, 12, 7, 3};
        /* Chamada Bubble
        array = Bubble.sort(array,array.length);
         */
        array = Insertion.Sort(array);
        System.out.println(Arrays.toString(array));
    }


}