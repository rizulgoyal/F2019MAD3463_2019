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
        // converting value to int
        int b = Integer.parseInt(s);
        int dec = 0;
        int p = 0;

        // checking if value is o
        while (true) {
            if (b == 0) {
                break;
            } else {
                int tempN = b % 10;
                dec += tempN * Math.pow(2, p);
                b = b / 10;
                p++;
            }
        }
        return dec;

    }

    public String initials(String s) {
        String[] splited = s.split("\\s+");

        String newSplit = "";

        if (splited.length == 3) {
            newSplit = splited[0].substring(0, 1).toUpperCase() + ". " + splited[1].substring(0, 1).toUpperCase() + ". " + splited[2].substring(0, 1).toUpperCase() + splited[2].substring(1).toLowerCase();
            return newSplit;
        } else {

            newSplit = "null";
            return newSplit;
        }

    }


    public char mostFrequent(String s) {
        // split the string with space
        String rSpace = s.replaceAll("\\s", "");
        int highFrequency = 0;
        char mostFrequencyChar = ' ';
        for (int i = 0; i < rSpace.length(); i++) {
            //formula to fetch  a character  and search  entire string to check how many times that char occurs
            char x = rSpace.charAt(i);

            int c = 0;

            for (int j = rSpace.indexOf(x); j != -1; j = rSpace.indexOf(x, j + 1)) {
                c++;
            }
            if (c > highFrequency) {
                highFrequency = c;
                mostFrequencyChar = x;
            }
        }

        return mostFrequencyChar;

    }

    public String replaceSubString(String s,String s1,String s2)
    {
        s.toLowerCase();
        s1.toLowerCase();
        s2.toLowerCase();


    }

    }





