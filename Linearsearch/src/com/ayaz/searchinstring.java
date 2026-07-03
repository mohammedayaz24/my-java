package com.ayaz;

public class searchinstring {
    public static void main(String[] args){
        String name = "ayaz";
        char target = 'z';
        System.out.println("search:"+search(name,target));
        System.out.println("Output using for each loop");
        System.out.println(search2("search2:"+ name,target));

    }

    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    //type 2 using for each method
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}



