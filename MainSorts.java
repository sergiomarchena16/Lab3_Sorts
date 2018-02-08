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
            for (int i=1; i<=20; i++){
                int randomInt = randomNum.nextInt(100);
                writer.println(randomInt); 
            }
            writer.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //LEE EL ARCHIVO.TXT (nums.txt) Y LO GUARDA EN UN ARRAY.
        FileReader file = new FileReader("nums.txt");
        int[] integers = new int [20];
        int i=0;
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                integers[i] = input.nextInt();
                i++;
            }
            input.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        } 
        
        System.out.println("Not sorted:" +Arrays.toString(integers));
        Sorts.gnomeSort(integers, integers.length);
        System.out.print("Gnome sorted: ");
        System.out.println(Arrays.toString(integers));
        
    }
    
        
       
    }  
    
