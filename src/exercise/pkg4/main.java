/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg4;

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        boolean playing = true;
        int winreq = 2;
        int userpoint = 0;
        int comppoint = 0;
        
        Move rock = new Move("Rock");
        Move scissors = new Move("Scissors");
        Move paper = new Move ("Scissors");
        
        Move usermove = new Move("");
        Move compmove = new Move("");
        
        rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
        
        while (playing == true){
            System.out.println( "Welcome to Rock, Paper, Scissors. Please choose an option:" 
                    + "\n" + "1.Start game" + "\n" + "2.Change number of rounds" + "\n" + "3.Exit application");
            int choose = scan.nextInt();
            
            if (choose == 1){
                System.out.println("This match will be first to " + winreq );
                
                for(var i=1; i<=winreq; i++){
                    int random = (int) Math.floor(Math.random()*3) + 1;
                    switch (random){
                        case 1: compmove = rock;
                        break;
                        case 2: compmove = paper;
                        break;
                        case 3: compmove = scissors;
                        break;
                    }
                    
                    
                    
                    System.out.println("The computer has selected its move. Select your move:" + "\n" +
                            "1.Rock" + "\n" + "2:Paper" + "\n" + "3.Scissors");
                    int playerchoice = scan.nextInt();
                    switch (playerchoice){
                        case 1: usermove = rock;
                        break;
                        case 2: usermove = paper;
                        break;
                        case 3: usermove = scissors;
                        break;
                    }
                    
                    switch (Move.compareMoves(compmove, usermove)){
                        case 0:
                            comppoint++;
                            System.out.printf("Player chose %s. Computer chose %s. Computer wins round!" 
                            + "\n" + "Player:" + userpoint + " Computer:" + comppoint, 
                                    compmove.getName(), usermove.getName());
                        break;
                        
                        case 1:
                            userpoint++;
                            System.out.printf("Player chose %s. Computer chose %s. Player wins round!" 
                            + "\n" + "Player:" + userpoint + " Computer:" + comppoint,
                                    compmove.getName(), usermove.getName());
                        break;
                        
                        case 2:
                            System.out.printf("Player chose %s. Computer chose %s. Player wins round!" 
                            + "\n" + "Player:" + userpoint + " Computer:" + comppoint,
                                    compmove.getName(), usermove.getName());
                        break;
                            
                }
            }
                
                if (comppoint<userpoint){
                    System.out.println("\n" + "Player wins!");
                }
                else if (userpoint<comppoint){
                    System.out.println("\n" + "Computer wins!");
                }
                else if (userpoint=comppoint){
                    System.out.println("\n" + "Player and computer tied!");
                }
        }
            
            else if (choose == 2){
                System.out.println("How many wins are needed to win a match?");
                winreq = scan.nextInt();
                System.out.println("New setting has been saved!");
            }
            
            else if (choose == 3){
                playing = false;
                System.out.println("Thanks for playing!");
            }
            
            else {
                System.out.println("Please enter a valid option");
                choose = scan.nextInt();
            }
            
    }
    
}
}
