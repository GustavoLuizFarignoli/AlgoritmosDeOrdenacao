import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        while (loop){
        System.out.println("""
                ---------------------------------------------------------------------------
                1. Bubble Sort
                2. Insertion Sort
                3. Quick Sort
                4. Encerrar programa
                ---------------------------------------------------------------------------
                """);
        int op = teclado.nextInt();
        switch (op){
            case 1:
                bubble();
                break;
            case 2:
                insertion();
                break;
            case 3:
                quick();
                break;
            case 4:
                System.out.println("Encerrando...");
                loop = false;
                break;
            default:
                System.out.println("Insira um valor válido!");
                break;
        }
    }
    }

    public static void bubble(){
        //Faz a ordenação com o Bubble Sort
        int[] array = new int[]{49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        Bubble.sort(array,array.length);
    }

    public static void insertion(){
        //Faz a ordenação com o Insertion Sort
        int[] array = new int[]{49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        Insertion.Sort(array);
    }

    public static void quick(){
        //Faz a ordenação com o Quick Sort, com o pivot como ultimo elemento da partição
        int[] array = new int[]{49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Array inicial: ");
        System.out.println(Arrays.toString(array));
        Quick.sort(array,0, array.length);
    }


}