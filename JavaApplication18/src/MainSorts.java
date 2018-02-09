/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author SergioMarchena
 */
public class MainSorts{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        //GENERA UN ARCHIVO CON NUMEROS RANDOM.
        try {
            PrintWriter writer = new PrintWriter("nums.txt", "UTF-8");
            Random randomNum = new Random();
            for (int i=1; i<=20; i++){ // ACA HAY QUE PONER 3000 
                int randomInt = randomNum.nextInt(1000);
                writer.println(randomInt); 
            }
            writer.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //LEE EL ARCHIVO.TXT (nums.txt) Y LO GUARDA EN UN ARRAY.
        FileReader file = new FileReader("nums.txt");
        int[] integers = new int [20]; // ACA SON 3000
        int i=0;
        int[] unsorted= new int [20]; // ACA SON 3000
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                integers[i] = input.nextInt();
                i++;
                unsorted=integers;
            }
            input.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        } 
        
        /**
        Sorts.gnomeSort(integers, integers.length);
        System.out.print("Gnome sorted: ");
        System.out.println(Arrays.toString(integers));
         */
        /**
        
        System.out.println("Not sorted:" +Arrays.toString(unsorted));
        Sorts.quickSort(unsorted, 0, integers.length-1);
        System.out.println("QuickSort: ");
        System.out.println(Arrays.toString(integers));
        */
        System.out.println("Not sorted:" +Arrays.toString(unsorted));
        Sorts.radixSort(unsorted);
        System.out.println("QuickSort: ");
        System.out.println(Arrays.toString(integers));
        
        
        //MERGE SORT
        
        Sorts merge = new Sorts();
        merge.sort(integers, 0, 2999); //3000-1 = 2999 (ES LA CANTIDAD DE NUMEROS).
        
        
    }
    
        
       
    }  
    
