

/**
 * Modela las caracteristicas de diferentes Sorts para emplearlo cada uno 
 * para medir su tiempo de ejeucion
 * @author SergioMarchena y Maria Fernanda Lopez
 * @version 9/02/2018
 */
public class Sorts implements Comparable {
 
    /**
     * Código extraído de: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
     * @param arr lista de numeros enteros a ordenar 
     * @param n  length de la lista
     */
    public void gnomeSort(int arr[], int n)
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
    
   
    // Merges two subarrays of arr[].
    // First subarray is arr[izquierda..m]
    // Second subarray is arr[m+1..derecha]
    /**
     * Extraído de: https://www.geeksforgeeks.org/merge-sort/
     * @param arr
     * @param l
     * @param m
     * @param r 
     */
    public void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1=m-l+1;
        int n2=r-m;
 
        /* Create temporary arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
  
     
    
    
    /**
     * Quick Sort, utilizado el algoritmo que se encuentra en el libro del curso
     * @param vector la lista de numeros enteros a ordenar
     * @param izquierda el menor numero de la lista 
     * @param derecha  el maximo numero de la lista 
     */
     public void quickSort(int[] vector, int izquierda, int derecha) {
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
       public void quickSort2(int[] vector, int izquierda, int derecha) {
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
     
      
         
     /**
      * Código extraído de: https://www.geeksforgeeks.org/radix-sort/
      * @param a lista de enteros que se va a ordenar
      */

    public void radixSort( int[] a)

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
    

    /**
     * Codigo extraído de: https://www.geeksforgeeks.org/bubble-sort/
     * 
     * @param arr lista de enteros que se necesita ordenar
     */
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
}
