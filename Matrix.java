

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.SECONDS;
// By Waleed  BSE171054     & Samra younas 
public class Matrix {


    public static void main(String[] args) {

        LocalTime l1 = java.time.LocalTime.now();
        Random rand=new Random();
        int n=Integer.parseInt(args[0]);
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                b[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    a[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        LocalTime l2 = java.time.LocalTime.now();
         System.out.println(SECONDS.between(l1, l2));

    }
    
}
