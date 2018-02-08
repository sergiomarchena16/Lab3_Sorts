/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
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
        return;
    }
}
