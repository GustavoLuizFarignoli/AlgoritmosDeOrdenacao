import java.util.Arrays;

public class Bubble {
    public static int[] sort(int[] array, int tam){
        System.out.println("Interação " + (array.length - tam));
        System.out.println(Arrays.toString(array));
        tam -= 1;
        if (tam <= 0 ){
            return array;
        } else {
            for (int i = 0; i < tam; i++){
                if (array[i] > array[i+1]){
                    int maior = array[i+1];
                    int menor = array[i];
                    array[i] = maior;
                    array[i+1] = menor;
                }
            }
            return sort(array,tam);
        }
    }
}
