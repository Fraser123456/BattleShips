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
public class btlShip {

    private String ship1[] = new String[3];
    private String ship2[] = new String[3];
    private String ship3[] = new String[3];
    private String[][] arrays = new String[][]{ship1, ship2, ship3};
    private int num;
    private int let;
    private int dir;
    private int count = 0;
    boolean flag = false;

    public String[][] setShips() {
        if (flag == false) {
            for (int j = 0; j < 3; j++) {
                if (arrays[j] != null) {
                    num = (int) (Math.random() * 7) + 1;
                    let = (int) (Math.random() * 7) + 1;
                    dir = (int) (Math.random() * 2) + 1;
                    if (dir == 1) {
                        for (int x = 0; x <= 2; x++) {
                            if (num < 3) {
                                arrays[j][x] = Letter(let) + Integer.toString(num + x);
                            } else {
                                arrays[j][x] = Letter(let) + Integer.toString(num - x);
                            }
                            System.out.println("Ship " + j + ": " + arrays[j][x]);
                        }
                        num = 0;
                        let = 0;
                        count = 0;
                    } else {
                        for (int x = 0; x <= 2; x++) {
                            if (let < 3) {
                                arrays[j][x] = Letter(let + x) + Integer.toString(num);
                            } else {
                                arrays[j][x] = Letter(let - x) + Integer.toString(num);
                            }
                            System.out.println("Ship " + j + ": " + arrays[j][x]);
                        }
                        num = 0;
                        let = 0;
                        count = 0;
                    }
                }
            }
            DuplicateCheck();
        }
        return arrays;
    }

    public String Letter(int lett) {
        String letter = "";
        switch (lett) {
            case 1:
                letter = "A";
                break;
            case 2:
                letter = "B";
                break;
            case 3:
                letter = "C";
                break;
            case 4:
                letter = "D";
                break;
            case 5:
                letter = "E";
                break;
            case 6:
                letter = "F";
                break;
            case 7:
                letter = "G";
                break;
        }
        return letter;
    }

    public void DuplicateCheck() {
        for (int j = 0; j <= 1; j++) {
            for (int i = 0; i <= 2; i++) {
                for (int x = 0; x <= 2; x++) {
                    if (arrays[j][i].equals(ship3[x])) {
                        setShips();
                    }
                    if (arrays[0][i].equals(arrays[1][x])) {
                        setShips();
                    }
                }
            }
        }
        flag = true;
    }
}
