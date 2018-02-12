/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponenciador;

/**
 *
 * @author Cayalav
 */
import java.math.BigInteger;

import java.util.Scanner;

public class Exponenciador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        BigInteger a = new BigInteger("" + 1);
        BigInteger base = new BigInteger("" + 2);
        
        System.out.println("Digite n");
        n = sc.nextInt();
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            a =  base.multiply(a); 
        }

        System.out.println("2^"+n+" es = " + a);

          long estimatedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println("Tiempo empleado = "+estimatedTime+" nano segundos ");
      
    }
}
