package com.javasolution;

public class EquivalentString {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for(String s1:word1){
            str1 += s1;
        }
        for(String s2:word2){
            str2 += s2;
        }
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        EquivalentString obj = new EquivalentString();
        String word1[] = {"a", "bc"};
        String word2[] = {"ab", "c"};


        System.out.println(obj.arrayStringsAreEqual(word1,word2));
    }
}

