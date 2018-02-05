package com.donaldjohn.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by donaldjohn on 2/3/18.
 */
public class TestRunner
{
    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(TestSuit.class, TestJUnit.class);

        for (Failure failure :
                result.getFailures())
        {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
