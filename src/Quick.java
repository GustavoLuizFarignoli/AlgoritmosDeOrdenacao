import java.util.Arrays;

public class Quick {
    private static int iteracao = 1;

    public static int[] sort(int[] array, int inicio, int fim){
        //Pivot como último elemento da partição

        int pivot = array[fim-1];
        int position = inicio;

        for (int i = inicio; i < fim; i++){
            if (array[i] <= pivot){
                int temp = array[position];
                array[position] = array[i];
                array[i] = temp;
                position += 1;
            }
        }
        if ((position - inicio) > 2){
            array = sort(array,inicio,position-1);
        }
        if ((fim - position) >= 2){
            array = sort(array,position,fim);
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Interação " + (iteracao));
        System.out.println(Arrays.toString(array));
        iteracao += 1;

        return array;
    }
}

