package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
public class getenrollments extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(6);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: getenroll-0000
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "getenroll-0000", "getenroll-0000.wav", "Enrollment has been completed for this VoiceIt profile."); 

		// phrase: getenroll-0001
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "getenroll-0001", "getenroll-0001.wav", "It appears you have not completed the enrollment process. Let\'s complete that now."); 

		// phrase: getenroll-0002
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "getenroll-0002", "getenroll-0002.wav", "I\'m sorry. I could not retrieve a list of enrollments."); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(getenrollments.PHRASE_MAP, phraseName));
	}
}
