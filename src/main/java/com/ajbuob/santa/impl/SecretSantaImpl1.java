package com.ajbuob.santa.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ajbuob.santa.SecretSanta;

public class SecretSantaImpl1 implements SecretSanta {

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

        //Copy the array to so the participants array will not be
        //modified and available to the client after the method call
        final String[] assignments = Arrays.copyOf(participants, participants.length);

        //Convert to a List
        List<String> assignmentsList = Arrays.asList(assignments);

        //Shuffle List
        Collections.shuffle(assignmentsList);

        //return as an array
        return assignmentsList.toArray(new String[0]);
    }
}