/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btlShips;

//import static btlShips.Grid.Game;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author frase
 */
public class UserGuess {
    private btlShip btl = new btlShip();
    private String arr[][] = btl.setShips();
    private String ans = "";
    private int count = 0, guesses = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0;
    private boolean flag;
    boolean result =false;
    
    
    
//    Grid g = new Grid();

    public boolean UserG(String guess) {
        String arr[][] = btl.setShips();
        String ship1 = "", ship2 = "", ship3 = "";
        flag = false;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j][i].equalsIgnoreCase(guess)) {
                    if (j == 0) {
                        ship1 = "wahammer";
                        cnt1++;
                        arr[j][i] = " ";
                    }
                    if (j == 1) {
                        ship2 = "Malenium";
                        cnt2++;
                        arr[j][i] = " ";
                    }
                    if (j == 2) {
                        ship3 = "falcon";
                        cnt3++;
                        arr[j][i] = " ";
                    }
                    count++;
                    flag = true;
                    System.out.println("********");
                    System.out.println(arr[j][i]);
                    break;
                }
            }
        }
        if (flag == true) {
            if (cnt1 == 3) {
                System.out.println(ship1 + " hit and sunk");
                cnt1--;
            }
            if (cnt2 == 3) {
                System.out.println(ship2 + " hit and sunk");
                cnt2--;
            }
            if (cnt3 == 3) {
                System.out.println(ship3 + " hit and sunk");
                cnt3--;
            } else {
                System.out.println("HIT ");
            }
            flag = true;

        } else {
            System.out.println("Miss");
            flag = false;
        }
        guesses++;
        if (count == 9) {
            System.out.println("All ships sunk in " + guesses + " guesses");
        }
        return flag;
        
    }
}
