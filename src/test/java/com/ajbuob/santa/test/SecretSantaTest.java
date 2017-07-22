package com.ajbuob.santa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ajbuob.santa.SecretSanta;
import com.ajbuob.santa.impl.SecretSantaImpl1;
import com.ajbuob.santa.impl.SecretSantaImpl2;

@RunWith(Parameterized.class)
public class SecretSantaTest {

    private SecretSanta secretSanta;

    public SecretSantaTest(SecretSanta secretSanta) {
        this.secretSanta = secretSanta;
    }

    @Test
    public void testGenerateAssignments() {

        final String[] participants = new String[]{"Kyle", "Kenny", "Eric", "Stan"};

        final String[] assignments = secretSanta.generateAssignments(participants);

        //elements are shuffled randomly so we
        //can check the number of elements in each array
        assertEquals(participants.length, assignments.length);

        //Check that the corresponding elements in the array
        //are not equal and the result has been randomly shuffled.
        assertFalse(Arrays.equals(assignments, participants));
    }

    @Parameters
    public static Collection<Object[]> implementationsToTest() {
        return Arrays.asList(
                new Object[]{new SecretSantaImpl1()},
                new Object[]{new SecretSantaImpl2()}
        );
    }
}