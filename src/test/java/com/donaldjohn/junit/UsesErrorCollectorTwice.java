package com.donaldjohn.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class UsesErrorCollectorTwice
{
    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        collector.addError(new Throwable("first thing went wrong"));
        collector.addError(new Throwable("second thing went wrong"));
    }
}
