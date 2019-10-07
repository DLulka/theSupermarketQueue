package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.solveSuperMarketQueue(new int[] { 3,3,3,4,1,2,7,3,6,6,5,6,4,4,4,3,1,1 }, 5));
    }
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int registers[] = new int[n];
        int low = 0, high = 0, test = 0;
        for(int i = 0; i < customers.length; i++){
            for(int k = 0; k < registers.length; k++){
                if(registers[low] <= registers[k]){
                }else {
                    low = k;
                }
            }
            registers[low] = registers[low] + customers[i];
        }
        high = registers[0];
        if(customers.length == 1 || registers.length == 1){
            high = registers[0];
        }else {
            for (int i = 0; i < registers.length; i++) {
                if ((i + 1) == registers.length) {
                } else {
                    if (high > registers[i + 1]) {
                    } else {
                        high = registers[i + 1];
                    }
                }
            }
        }
        return high;
    }
}
