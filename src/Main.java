import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 12, 8, 3};
        array = bubble(array,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static int[] bubble(int[] array, int tam){
        //considerando que tam inicial é igual ao array length -1
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
            return bubble(array,tam-1);
        }
    }
}