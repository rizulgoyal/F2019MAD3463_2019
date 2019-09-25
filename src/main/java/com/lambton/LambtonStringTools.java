package com.lambton;

public class LambtonStringTools {

    public String reverse (String s)
    {
        //for loop for reversing string by converting it into the array
        int cnt = 0;
        char [] charString = s.toCharArray();
        char[] revString = new char[s.length()];
        for(int i=charString.length-1;i>=0;i--)
        {
            revString[cnt++]=charString[i];

        }
        String finalReverse;
        finalReverse = new String(revString);

        //return is necessary becuase our function return type is string

        return finalReverse;
    }


    public int binaryToDecimal(String s) {

        int b = Integer.parseInt(s);
        int dec = 0;
        int p = 0;
        while (true) {
            if (b == 0) {
                break;
            } else {
                
            }
        }
        return dec;

    }


}
