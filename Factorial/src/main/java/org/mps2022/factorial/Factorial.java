package org.mps2022.factorial;

public class Factorial {

    public int compute(int numberToCompute) {
        int factorial=1;
        if(numberToCompute < 0){
            throw new RuntimeException("The value is negative: " + numberToCompute);
        }

        for(int i=1; i<=numberToCompute; i++){
            factorial*=i;
        }


        return factorial;
    }
}
