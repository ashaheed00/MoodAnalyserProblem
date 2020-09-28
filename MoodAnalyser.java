// Version UC3

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE,
						"Empty input. Enter valid message");
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MESSAGE, 
						"Null input. Enter valid message");
		}
	}
}