import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Comparacao {

    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();

        int arr[] = new int[1000];
        int valor = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
               // arr[i] = i;
                // arr[i] = valor--;
                 //arr[i] = (int)(Math.random()*5000);
        }
        Instant comeca = Instant.now();
             // bs.bubbleSort(arr);
             //  ss.SelectionSort(arr);
             //is.InsertionSort(arr);
        // qs.qSort(arr, 0, arr.length - 1);
        // ms.mSort(arr, 0, arr.length);
         aSort(arr);
        Instant termina = Instant.now();
        Duration tempo = Duration.between(comeca,termina);
        imprime(arr);
        System.out.print("\n Tempo = "+ tempo.toMillis() + " em Ms");
    }
    static void imprime(int[] lista){
        System.out.println(Arrays.toString(lista));
    }

    static void aSort(int[] a){
      Arrays.sort(a);  
    }
}