public class QuickSort {
    public  static void qSort (int[] arr, int comeca, int termina ) {
        if(comeca < termina){
            int q = particao(arr, comeca, termina);
            qSort(arr, comeca, q);
            qSort(arr, q + 1 , termina);
        }
    }
    public static void troca (int[] arr, int origem, int destino ) {
        int aux = arr[origem];
        arr[origem] = arr[destino];
        arr[destino] = aux;
    }
    public static int particao(int[] arr, int inicio, int termino){
        int pivo = arr[(inicio + termino)/2];
        int i = inicio - 1;
        int aux = termino + 1;
        while( i < aux){
            do{
                aux = aux - 1;
            }
            while (arr[aux] > pivo);
            do{
                i = i + 1;
            }
            while (arr[i] < pivo );
            if(i < aux ) troca (arr , i , aux );
        }
        return aux;
    }
}