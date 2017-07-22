package com.ajbuob.santa.impl;

import java.util.Arrays;
import java.util.Random;

import com.ajbuob.santa.SecretSanta;

public class SecretSantaImpl2 implements SecretSanta {

    private static final String[] NULL_STRING_ARRAY = new String[0];

    @Override
    public String[] generateAssignments(final String[] participants) {

        //Ensure that the passed-in argument is valid to process
        if (participants == null)
            return new String[]{};

        if (participants.length < 1)
            return NULL_STRING_ARRAY;

        //Ensure that more than one person is involved in the game
        //and the assignment activity should take place.
        if (participants.length == 1)
            return participants;

        Random random = new Random();

        //We will return a new array assuming the client will need to use the
        //Participants array after this method call
        String[] assignments = Arrays.copyOf(participants, participants.length);

        for (int i = 0; i < assignments.length; i++) {
            //Generates random int 0 (inclusive) to length (exclusive-array index starts at 0)
            int randomPosition = random.nextInt(assignments.length);

            //Retrieve the current array element in the iteration
            String temp = assignments[i];

            //Place the random element in the current array element
            assignments[i] = assignments[randomPosition];

            //Place the current element in the random element position
            assignments[randomPosition] = temp;
        }
        return assignments;
    }
}
