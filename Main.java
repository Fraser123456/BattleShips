/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btlShips;

/**
 *
 * @author frase
 */
public class Main {
    private static boolean flag = false;
    public static void main(String[] args) {
        boolean flag = false;
        Grid grid = new Grid();
        grid.GameStart(flag);
        UserGuess ug = new UserGuess();
    }
    
    public static void Done(boolean res)
    {
        flag = res;
    }
}
