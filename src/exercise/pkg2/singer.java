/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author Acer
 */
public class singer {
    
    String name;
    public int numperformance;
    public double earnings = 0;
    public song favsong;
    public song newfavsong;
    int audience;
    
    public singer(String name, song song1){
        this.name = name;
        numperformance = 0;
        favsong = song1;
    }
    
    public void perform(int audience){
        numperformance++;
        this.audience = audience;
        earnings+=100*audience;
    }
    
    public void changefavsong(song song1, song song2){
       newfavsong=song2;
    }
}
