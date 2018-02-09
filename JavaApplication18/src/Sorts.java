/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioMarchena
 */
public class Sorts {
    
    
    static void gnomeSort(int arr[], int n)
    {
        int index = 0;
        while (index < n)
        {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index-1])
                index++;
            else
            {
                int temp =0;
                temp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = temp;
                index--;
            }
        }
    }
     static void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
         
     /** Radix Sort function **/

    static void radixSort( int[] a)

    {

        int i, m = a[0], exp = 1, n = a.length;

        int[] b = new int[3000];

        for (i = 1; i < n; i++)

            if (a[i] > m)

                m = a[i];

        while (m / exp > 0)

        {

            int[] bucket = new int[3000];

 

            for (i = 0; i < n; i++)

                bucket[(a[i] / exp) % 10]++;

            for (i = 1; i < 10; i++)

                bucket[i] += bucket[i - 1];

            for (i = n - 1; i >= 0; i--)

                b[--bucket[(a[i] / exp) % 10]] = a[i];

            for (i = 0; i < n; i++)

                a[i] = b[i];

            exp *= 10;        

        }

    }    
    
     
}
