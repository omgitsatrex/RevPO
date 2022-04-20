package org.example;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {
        System.out.println(findPrimes(1,1000));;
    }

    public static ArrayList<Integer> findPrimes(int start, int end){

        ArrayList<Integer> primes = new ArrayList<Integer>();


        for(int n = start; n < end; n++){
            boolean prime = true;

            int i = 2;
            while(i * i <= n) {
                if(n % i == 0){
                    prime = false;
                    break;
                }
                i++;
            }

            if(prime){
                primes.add(n);
            }
        }

        return primes;
    }
}
