/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg3;

/**
 *
 * @author Acer
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        person artist1 = new person("Parannoul" ,11 ,"shoegaze");
        person artist2 = new person("my bloody valentine" ,4 ,"shoegaze");
        person artist3 = new person("Men I Trust" ,5 ,"dream pop");
        
        song song1=new song ("Chicken", "Parannoul");
        song song2=new song ("Parade", "Parannoul");
        singer singer1= new singer("Lorde", song1);
        singer singer2= new singer("SZA", song1);
        singer1.perform(12);
        singer1.perform2(12);
        singer1.changefavsong(song1, song2);
        
        System.out.println(singer1.name + " performed to an audience of " + singer1.audience + " people and earned " + singer.earnings);
        System.out.println(singer1.name + "'s favorite song changed from " + song1.songtitle + "to" + song2.songtitle);
        System.out.println(singer1.name + " and " + singer2.name + " performed and each earned " + singer.earnings2);
    }
    
}
