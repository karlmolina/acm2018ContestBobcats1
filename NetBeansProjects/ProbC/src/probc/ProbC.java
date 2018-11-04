/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author icpc17g
 */
public class ProbC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new File("in4"));
        //long a = in.nextLong();
        long bx = in.nextLong();
        long by = in.nextLong();
        long x1 = in.nextLong(), y1 = in.nextLong(), x2 = in.nextLong(), y2 = in.nextLong();

        long gcd = gcd((long) bx, (long) by, 0, 0);
        //long gcd = gcd2(bx, by);
        //System.out.println(gcd);
        long divx = bx / gcd;
        long divy = by / gcd;
        //System.out.println(a/divy);
        //long y = 0;
        //System.out.println("divx " + divx + ", divy " + divy);
        boolean check = false;
//        for (long x = divx; x < bx; x += divx) {
//            y += divy;
//            if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
//                continue;
//            } else {
//                System.out.println("No");
//                System.out.println(x + " " + (y));
//                check = true;
//                break;
//            }
//        }
        long x = divx, y = divy;
        
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            long topy = Math.floorDiv(y2, divy) + 1;
            long topx = Math.floorDiv(x2, divx) + 1;
            //System.out.println("No");
            check = true;
            //System.out.println("topx " +topx);
            //System.out.println("topy " +topy);
            if (topy < topx) {
                x =  topy * divx;
                y = topy * divy;
            } else {
                x =  topx * divx;
                y = topx * divy;
            }
            if (bx == x && by == y) {
                System.out.println("Yes");
                System.exit(0);
            } else {
                System.out.println("No");
                System.out.println(x + " " + y);
                System.exit(0);
            }
            
        } else {
            check = true;
            if (bx == x && by == y) { 
                check = false;
            } else {
            System.out.println("No");
            System.out.println(x + " " + y);}
        }

        if (!check) {
            System.out.println("Yes");
        }

    }

    public static long gcd(long p, long q, long x, long y) {
        long x1 = 0, y1 = 0;
        long g;
        if (q > p) {
            return (gcd(q, p, y, x));
        }
        if (q == 0) {
            x = 1;
            y = 0;
            return p;
        }

        g = gcd(q, p % q, x1, y1);
        x = y1;
        y = (x1 - Math.floorDiv(p, q) * y1);

        return g;
    }

}
