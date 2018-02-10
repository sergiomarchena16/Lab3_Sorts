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
        Sorts o = new Sorts();
        
        //GENERA UN ARCHIVO CON NUMEROS RANDOM.
        try {
            PrintWriter writer = new PrintWriter("nums.txt", "UTF-8");
            Random randomNum = new Random();
            for (int i=1; i<=3000; i++){ // ACA HAY QUE PONER 3000 
                int randomInt = randomNum.nextInt(3000);
                writer.println(randomInt); 
            }
            writer.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //LEE EL ARCHIVO.TXT (nums.txt) Y LO GUARDA EN UN ARRAY.
        FileReader file = new FileReader("nums.txt");
        int[] integers = new int [3000];
        int i=0;
        int[] unsorted= new int [3000];
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
        
        
        o.quickSort(integers,0,2999);
        System.out.print("quick sorted: ");
        System.out.println(Arrays.toString(integers));
        o.quickSort2(integers,0,2999);
        System.out.print("quick sorted: ");
        System.out.println(Arrays.toString(integers)); 
        o.sort(integers,0,2999);
        System.out.print("quick sorted: ");
        System.out.println(Arrays.toString(integers));
        o.bubbleSort(integers);
        System.out.print("quick sorted: ");
        System.out.println(Arrays.toString(integers));
        o.radixSort(integers);
        System.out.print("quick sorted: ");
        System.out.println(Arrays.toString(integers));
        System.out.println("Not sorted:" +Arrays.toString(unsorted));
        o.gnomeSort(unsorted,3000);
        System.out.println("gnomeSort: ");
        System.out.println(Arrays.toString(integers));
        
        
       
       
        
        
       
        
        
     
       
       
        

    }
    
        
       
    }  
    
