/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neighborhood;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author icpc17g
 */
public class hood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("in"));

        //while (in.hasNext()) {
            int totalHouses = in.nextInt();
            int totalsafe = in.nextInt();
            int score = 0;
            boolean[] houses = new boolean[totalHouses + 1];
            ArrayList<Integer> safeHouses = new ArrayList<>();
            for (int i = 0; i < totalsafe; i++) {
                safeHouses.add(in.nextInt());
            }
            for (int x : safeHouses) {
                houses[x] = true;
            }

            for (int i = 1; i <= totalHouses; i++) {
                if (houses[i] == false) {
                    for (int j = i + 1; j <= totalHouses; j++) {
                        if (houses[j] == true) {
                            score++;
                        } else {
                            for (int k : safeHouses) {
                                if (i < k && j > k) {
                                    score++;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    //add up all values for that house
                    score += totalHouses - i + 1;
                }
            }

            System.out.println(score);
        //}
    }

}
