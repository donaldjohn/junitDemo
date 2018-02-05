package com.donaldjohn.junit;

import org.junit.After;
import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import static junit.framework.TestCase.fail;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class WatchmanTest
{
    private static String watchedLog;

    @Rule
    public final TestRule watchMan = new TestWatcher()
    {
        @Override
        public Statement apply(Statement base, Description description)
        {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description)
        {
            watchedLog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        protected void failed(Throwable e, Description description)
        {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description)
        {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void skipped(org.junit.internal.AssumptionViolatedException e, Description description)
        {
            super.skipped(e, description);
        }

        @Override
        protected void starting(Description description)
        {
            super.starting(description);
        }

        @Override
        protected void finished(Description description)
        {
            super.finished(description);
        }
    };

    @Test
    public void fails() {
        fail();
    }

    @Test
    public void succeeds() {
    }


    @After
    public void printWatchedLog()
    {
        System.out.println(watchedLog);
    }

}
