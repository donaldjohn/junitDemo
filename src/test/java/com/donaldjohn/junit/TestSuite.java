package com.donaldjohn.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by donaldjohn on 2/4/18.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({FibonacciTest.class, PrimeNumberCheckerTest.class, TestJUnit.class})
public class TestSuite
{
}
