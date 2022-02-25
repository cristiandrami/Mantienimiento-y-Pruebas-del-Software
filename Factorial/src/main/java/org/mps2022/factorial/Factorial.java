package org.mps2022.factorial;

/**
 * Class providing a method that computes the factorial of an positive integer number
 * @author Cristian Domenico Dramisino
 */
public class Factorial {

    public int compute(int numberToCompute) {
        //i use 1 so i can do the factorial of 0 without check it
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
