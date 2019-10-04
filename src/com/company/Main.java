package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.solveSuperMarketQueue(new int[] { 4,4,6,5,1,1,3,1,6,5,5,2,1,7,2,4,5,7,5,7 }, 4));
    }
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int registers[] = new int[n];
        int low = 0, high = 0;
        for(int i = 0; i < customers.length; i++){
            for(int k = 0; k < registers.length; k++){
                System.out.println("Registers low tiene: " + registers[low] + " y registers k tiene: " + registers[k] );
                if(registers[low] <= registers[k]){
                }else {
                    low = k;
                }
                System.out.println("Low tiene: " + low);
            }
            registers[low] = registers[low] + customers[i];
        }
        if(registers.length == 1){
            high = registers[0];
        }else {
            for (int i = 0; i < registers.length; i++) {
                if ((i + 1) == registers.length) {
                } else {
                    if (registers[i] > registers[i + 1]) {
                        high = registers[i];
                    } else {
                        high = registers[i + 1];
                    }
                }
            }
        }
        return high;
    }
}
