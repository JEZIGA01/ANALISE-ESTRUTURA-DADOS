# RELATORIO
Estrutura de dados, relatório técnico para analisar a complexidade dos códigos dividindo-os em Complexidade Pior Caso: O(n²) Complexidade Caso Médio: O(n²) Complexidade Melhor Caso: O(n)

public class BubbleSort {
    //Versão normal
    public static void bubbleSort(int[] a){
        if(a == null){
            throw new NullPointerException("The array doesn't exist.");
        }
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    //versão 'otimizada' [O(n) no melhor caso]
    public static void bubbleSortOpt(int[] a){
        if(a == null){
            throw new NullPointerException("The array doesn't exist.");
        }
        boolean flag = true;
        for(int i = 0; i < a.length - 1 && flag; i++){
            flag = false; //quando não há trocas, flag continuará false
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp; 
                    flag = true; //troca realizada, flag true
                }
            }
        }
    }
}
