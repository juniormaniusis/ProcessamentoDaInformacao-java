/*
    Ordenação de array em ordem estritamente crescente.
 */
package edu.ufabc.pi.exercicios.bubblesort;
public class BubbleSort {
    public static void main(String[] args) {
        
        //inicializando o array
        int[] conjunto = {4,-3,9,5,7,6,1,5,3,2,-6,5};
        int aux; //variavel auxiliar
        //mostra o array inicialmente
        System.out.println("Array desordenado:");
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print(conjunto[i]+" ");
        }
        
        System.out.println("");//pular uma linha
        /* processamento
            ordena o array em ordem crescente
            varre o array e identifica se estão oraganizados
            se não estiverem, organiza
        */
        for (int i = 0; i < conjunto.length; i++) {
            for (int j = (i+1); j < conjunto.length; j++) {
                if(conjunto[i]>conjunto[j]){
                    aux=conjunto[i];
                    conjunto[i]=conjunto[j];
                    conjunto[j]=aux;
                }
            }
        }
        
        //mostra o array
        System.out.println("Array de forma crescente:");
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print(conjunto[i]+" ");
        }
    }


}
