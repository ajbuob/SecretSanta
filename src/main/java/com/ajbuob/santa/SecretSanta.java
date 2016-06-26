package com.ajbuob.santa;

public interface SecretSanta {
	
	/**
	 * @param participants list of individuals participating in the draw.
	 * @return the list of individuals paired with the participants where participants[0]
	 * is matched with assignments[0], participants[1] is matched with assignments[1], and so on.
	 */
	public String[] generateAssignments(final String[] participants);

}
