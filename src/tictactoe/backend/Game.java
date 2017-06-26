/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.backend;

import java.util.Scanner;
import java.util.ArrayList;

public class Game
{
    public static void main(String[] args)
    {
        System.out.println("Tic Tac Toe");
        Referee ref = new Referee();
        System.out.println();
        System.out.println("Enter \"quit\" to exit or \"reset\" to refresh the board. This counts as a loss.");
        
        ArrayList<Block> block = ref.getList();
        
        ref.turn();
        
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        while(!(input.equals("quit")))
        {
            ref.turn();
        }
    }
}
