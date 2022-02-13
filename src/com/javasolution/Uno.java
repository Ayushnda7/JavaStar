package com.javasolution;

public class Uno {

    public int Solution(int N) {

        char[] num =String.valueOf(N).toCharArray();
        int sum = 0;

        for(int i=0;i<num.length;i++){
            sum += Character.getNumericValue(num[i]);
        }
        if(sum<=9){
            return sum;
        }
        return Solution(sum);
    }

    public static void main(String[] args) {

        Uno obj = new Uno();
        int N =51112;
        int new_num =obj.Solution(N);
        if(new_num<9){
            System.out.println("UNO");
        }else{
            System.out.println("Not UNO");
        }
        System.out.println(new_num);

    }
}
