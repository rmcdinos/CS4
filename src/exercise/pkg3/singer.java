/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.pkg3;

/**
 *
 * @author Acer
 */
public class singer {
    String name;
    private int numperformance;
    static double earnings = 0;
    static double earnings2 = 0;
    private song favsong;
    private song newfavsong;
    public int audience = 0;
    
    public singer(String name, song song1){
        this.name = name;
        numperformance = 0;
        favsong = song1;
    }
    
    public void perform(int audience){
        numperformance++;
        this.audience = audience;
        earnings=100*audience;
    }
    
    public void perform2(int audience){
        numperformance++;
        this.audience = audience;
        earnings2=(100*audience)/2;
    }
    
    public void changefavsong(song song1, song song2){
       newfavsong=song2;
    }
    
    public int getnumperformance(){
        return numperformance;
    }
    
    public song favsong(){
        return favsong;
    }
    
    public song newfavsong(){
        return newfavsong;
    }
}
