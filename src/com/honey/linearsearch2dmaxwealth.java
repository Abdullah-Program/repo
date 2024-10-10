package com.honey;

public class linearsearch2dmaxwealth {
public static void main(String[] args) {
    int [][] arr  = {{1,23,1},{23,56,2},{12,45,87}};
    System.out.println(Maxwealth(arr));
}   
static int Maxwealth ( int [][] accounts)
{
    // person = col
    // accounts = row
    int ans = Integer.MIN_VALUE;
    for (int person = 0; person < accounts.length; person++) {
        int sum = 0;
        for (int account = 0; account < accounts[person].length; account++) {
            sum += accounts[person] [account];
        }
       if (sum > ans)
       {
        ans = sum;
       }
    }
    return ans;
}
}

