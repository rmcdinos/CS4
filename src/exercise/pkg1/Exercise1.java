/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg1;

/**
 *
 * @author Acer
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String artist1 = "Cocteau Twins";
        int albumnum1 = 11;
        String genre1 = "shoegaze";
        
        String artist2 = "my bloody valentine";
        int albumnum2 = 4;
        String genre2 = "shoegaze";
        
        String artist3 = "Men I Trust";
        int albumnum3 = 5;
        String genre3 = "dream pop";
        
        int totalalbum= albumnum1+albumnum2+albumnum3;
        boolean albumcomparison= albumnum1 > albumnum2;
        boolean albumcomparison2= genre2 == genre3;
         
        
        System.out.println("Artist 1");
        System.out.println("Artist name:"
                + artist1); 
        System.out.println("No. of albums:"
                + albumnum1);
        System.out.println("Genre:"
                + genre1);
        
        System.out.println("");
        
        System.out.println("Artist 2");
        System.out.println("Artist name:"
                + artist2); 
        System.out.println("No. of albums:"
                + albumnum2);
        System.out.println("Genre:"
                + genre2);
        
        System.out.println("");
        
        System.out.println("Artist 3");
        System.out.println("Artist name:"
                + artist3); 
        System.out.println("No. of albums:"
                + albumnum3);
        System.out.println("Genre:"
                + genre3);
        
        System.out.println("");
        
        System.out.println("Total no. of albums:"
                + totalalbum);
        System.out.println("Does Cocteau Twins have more albums than my bloody valentine:"
                + albumcomparison);
        System.out.println("Do my bloody valentine and Men I Trust have the same genre:"
                + albumcomparison2);
        
        
        
        
        
        
        
    }
    
}
