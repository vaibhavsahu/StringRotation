package com.vaibhav;

public class Main {

    public static boolean isRotationOfAnotherString(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length() == s2.length()){
            int mStart = 0;
            int mEnd = 0;
            int nStart = 0;
            int nEnd = 0;
            char match1 = s2.charAt(0);
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) == match1){
                    break;
                }
                mStart++;
            }
            mEnd = s1.length();
            String sub1 = s1.substring(mStart, mEnd);
            char match2 = s1.charAt(0);
            for (int i = 0; i < s1.length(); i++) {
                if(s2.charAt(i) == match2){
                    break;
                }
                nStart++;
            }
            String sub2 = s2.substring(nStart, s2.length());

            if(s1.contains(sub1) && s1.contains(sub2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotationOfAnotherString("waterbottle", "erbottlewat"));
    }
}
