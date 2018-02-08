/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
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
        
        try {
            
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int array[] = {34, 2, 10, -9, 334, 23, 0, -3, 23, 45, 100, 20, 40, 22, -12, 39, 45, 56, 346 -34, 34};
        
        Sorts.gnomeSort(array, array.length);
        
        System.out.print("Gnome sorted: ");
        System.out.println(Arrays.toString(array));
    }
}  
    
