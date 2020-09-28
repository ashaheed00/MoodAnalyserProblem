import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test // TC1.1
	public void testShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.analyseMood());
	}

	@Test // TC1.2
	public void testShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser("I am in Happy Mood");
		assertEquals("HAPPY", mood.analyseMood());
	}

}