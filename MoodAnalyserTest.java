import static org.junit.Assert.*;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test // TC1.1
	public void testShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("SAD", mood.analyseMood("I am in Sad Mood"));
	}
}