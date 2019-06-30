/*Write a Java method to check if a given number is power of 4*/

package com.stackroute.junit;

public class PowerofFour {
    public boolean poweroffour(int num) {
        while (num > 0) {
            if (num == 1) {
                return true;
            }

            if (num % 4 != 0) {
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

