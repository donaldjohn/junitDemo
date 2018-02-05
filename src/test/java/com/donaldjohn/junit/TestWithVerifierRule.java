package com.donaldjohn.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class TestWithVerifierRule
{
    private static String sequence;

    public static class UsesVerifier {
        @Rule
        public final Verifier collector = new Verifier() {
            @Override
            protected void verify() {
                sequence += "verify ";
            }
        };

        @Test
        public void example() {
            sequence += "test ";
        }

        @Test
        public void verifierRunsAfterTest() {
            sequence = "";
            assertThat(testResult(UsesVerifier.class), isSuccessful());
            assertEquals("test verify ", sequence);
        }
    }
}
