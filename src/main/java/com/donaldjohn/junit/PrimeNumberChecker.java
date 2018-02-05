package com.donaldjohn.junit;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class PrimeNumberChecker
{
    public Boolean validate(final Integer primeNumber)
    {
        for (int i = 2; i < (primeNumber / 2); i++)
        {
            if (primeNumber % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
