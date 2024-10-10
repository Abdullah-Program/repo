package com.honey;

public class linearsearchstrings {
    public static void main(String[] args) {
    String name = "Honey";
    char target = 'y';
    System.out.println(linearSearch2(name, target));
    // System.out.println(Arrays.toString(name.toString()));
    
    }
    static boolean linearSearch2(String str, char target)
    {
        if (str.length()==0)
       {
        return false;
       }   
    for (char ch : str.toCharArray()) {
        if (ch == target) {
            return true;
        }
    }
    return false;
    }
    // static boolean search(String str, char target)
    // {
    //     if (str.length()==0)
    //    {
    //     return false;
    //    }   
    //    for (int i = 0; i < str.length(); i++) {
    //     if (target == str.charAt(i)) {
    //         return true;
    //     }
    // }
    // return false;
    // }
}
