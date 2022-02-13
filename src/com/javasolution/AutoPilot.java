package com.javasolution;

public class AutoPilot {

    public static void main(String[] args) {
        String dir ="NNWESW";
        System.out.println(Solution(dir));
    }

    public static String Solution(String dir) {
        int v_axis=0;
        int h_axis=0;

        for(int i=0;i<dir.length();i++){
            switch(dir.charAt(i)){
                case 'N':
                    v_axis += 5;
                    break;
                case 'S':
                    v_axis -= 5;
                    break;
                case 'E':
                    h_axis += 5;
                    break;
                case 'W':
                    h_axis -= 5;
                    break;
            }
        }

        if(v_axis==0 && h_axis==0){
            return "Returned successfully";
        }else{
            return "Not Returned successfully";
        }
    }

}
