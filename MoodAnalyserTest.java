import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test // TC1.1
	public void testShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("SAD", mood.analyseMood("I am in Sad Mood"));
	}

	@Test // TC1.2
	public void testShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("HAPPY", mood.analyseMood("I am in Any Mood"));
	}
}