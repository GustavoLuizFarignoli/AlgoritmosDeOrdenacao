import java.util.Arrays;

public class Insertion {
    public static int[] Sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int atual = array[i];
            for (int j = i-1; j >= 0; j--){
                if (array[j] > atual){
                    array[j+1] = array[j];
                    array[j] = atual;
                }
            }
            System.out.println("Iteração " + (i));
            System.out.println(Arrays.toString(array));
        }
        System.out.println("Array organizado com o Insertion Sort");
        return array;
    }
}
