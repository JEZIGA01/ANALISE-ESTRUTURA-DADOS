public class MergeSort {
    public static void mSort(int[] array, int inicio, int termino) {

        if(termino - inicio >=2) {
            int meio = (inicio + termino) / 2;
            mSort(array,  inicio, meio);
            mSort(array,  meio , termino);
            mergeIntercala(array, inicio, meio, termino);
        }
    }
    private static void mergeIntercala(int arr[], int inicio, int meio, int termino) {
        int tamanhoA = meio;
        int tamanhoB = termino;
        int tamanhoC = termino - inicio;

        int arrayAuxilar[] = new int [tamanhoC];
        int posicaoA = inicio, posicaoB = meio, posicaoC = 0;

        while (posicaoA < tamanhoA && posicaoB < tamanhoB){
            if(arr[posicaoA] < arr [posicaoB]){
                arrayAuxilar[posicaoC++] = arr[posicaoA++];
            }
            else{
                arrayAuxilar[posicaoC++] = arr[posicaoB++];
            }
        }
        while(posicaoA < tamanhoA){
            arrayAuxilar[posicaoC++] = arr[posicaoA++];
        }
        while(posicaoB < tamanhoB){
            arrayAuxilar[posicaoC++] = arr[posicaoB++];
        }
        for ( int atual = 0 ; atual < arrayAuxilar.length ; atual++ ) {

            arr[atual + inicio] = arrayAuxilar[atual];
        }
    }
}