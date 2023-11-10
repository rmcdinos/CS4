/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author Acer
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        person artist1 = new person("Parannoul" ,11 ,"shoegaze");
        person artist2 = new person("my bloody valentine" ,4 ,"shoegaze");
        person artist3 = new person("Men I Trust" ,5 ,"dream pop");
        
        song song1=new song ("Chicken", "Parannoul");
        song song2=new song ("Parade", "Parannoul");
        singer singer= new singer("Lorde", song2);
        singer.perform(12);
        singer.changefavsong(song1, song2);
        
        System.out.println(singer.name + " performed to an audience of " + singer.audience + " people and earned " + singer.earnings);
        System.out.println(singer.name + "'s favorie song changed from " + singer.favsong.songtitle + " to " + singer.newfavsong.songtitle);
         
    }
    
}
