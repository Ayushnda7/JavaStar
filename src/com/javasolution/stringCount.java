package com.javasolution;



public class stringCount {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int maxWord = 0;

        for(int i = 0; i<n;i++){
            int count = 0;
            for(String s:sentences[i].split(" ",0))
                count++;
            if(maxWord<count)
                maxWord=count;
        }
        return maxWord;
    }

    public static void main(String[] args) {
        stringCount sc = new stringCount();

        String sentences[] ={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        int max = sc.mostWordsFound(sentences);
        System.out.println(max);
    }
}
