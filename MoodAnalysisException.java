// Custom Exception

public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		NULL_MESSAGE, EMPTY_MESSAGE;
	}

	ExceptionType exceptionType;

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.exceptionType = type;
	}
}
