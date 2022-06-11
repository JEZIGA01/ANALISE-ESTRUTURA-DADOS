import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Comparacao {

    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();

        int arr[] = new int[10000];
        int valor = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = i;
            // arr[i] = valor--;
            arr[i] = (int)(Math.random()*5000);
        }
        Instant comeca = Instant.now();
             //bs.bubbleSort(arr);
            //ss.SelectionSort(arr);
           // is.InsertionSort(arr);
        Instant termina = Instant.now();
        Duration tempo = Duration.between(comeca,termina);
        imprime(arr);
        System.out.print("\n Tempo = "+ tempo.toMillis() + " em Ms");
    }
    static void imprime(int[] lista){
        System.out.println(Arrays.toString(lista));
    }
}