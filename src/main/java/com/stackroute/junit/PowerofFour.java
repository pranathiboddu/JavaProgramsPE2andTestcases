/*Write a Java method to check if a given number is power of 4*/

package com.stackroute.junit;

public class PowerofFour {
    public boolean poweroffour(int num) //initialized number to check power of four
    {
        while (num > 0)
        {
            if (num == 1) //if number is 1 then it is power of four
            {
                return true;
            }

            if (num % 4 != 0) //if number is not divisible by four it is not power of four
            {
                return false;
            }
            else
            {
                num = num / 4;
            }
        }

        return false;
    }
}

