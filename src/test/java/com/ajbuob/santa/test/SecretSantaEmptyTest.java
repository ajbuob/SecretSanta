package com.ajbuob.santa.test;

import static org.junit.Assert.assertTrue;

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
public class SecretSantaEmptyTest {

    private final SecretSanta secretSanta;

    public SecretSantaEmptyTest(SecretSanta secretSanta) {
        this.secretSanta = secretSanta;
    }

    @Test
    public void testGenerateAssignments() {

        final String[] participants = new String[]{};
        secretSanta.generateAssignments(participants);

        final String[] assignments = secretSanta.generateAssignments(participants);

        assertTrue(Arrays.equals(new String[]{}, assignments));
    }

    @Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {new SecretSantaImpl1()},
                {new SecretSantaImpl2()}
        });
    }
}