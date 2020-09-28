import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test // TC1.1
	public void testShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.analyseMood());
	}

	@Test // TC1.2
	public void testShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser("I am in Happy Mood");
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test(expected = MoodAnalysisException.class) // TC2.1
	public void testNullMoodShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser mood = new MoodAnalyser(null);
		assertEquals("HAPPY", mood.analyseMood());
	}

	@Test // TC3.1
	public void testNullMoodShouldThrowMoodAnalysisException() {
		MoodAnalyser mood = new MoodAnalyser(null);
		try {
			mood.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.NULL_MESSAGE, e.exceptionType);
		}
	}
}