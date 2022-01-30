package com.javasolution;

public class TruncateSent {
    public String truncateSentence(String s, int k) {

        String s2[] = new String[k];
        s2 = s.split(" ");
        String str = "";
        for(int i =0; i < k;i++){
            str += s2[i]+" ";
        }
        return str.trim();
        }


    public static void main(String[] args) {
        TruncateSent ts = new TruncateSent();
        String s ="Hello how are you Contestant";
        int k = 4;
        System.out.println(ts.truncateSentence(s,k));


    }
}
