package com.javasolution;

public class StringCompare {
        public boolean checkString(String s) {
            int a = s.lastIndexOf("a");
            int b = s.indexOf("b");

            if(a+1 == b || s.indexOf('a') == 0 && s.indexOf('b') == -1){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        StringCompare obj = new StringCompare();
        String s = "abab"; //"a"
        System.out.println(obj.checkString(s));
    }
    }
