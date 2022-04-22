package Day21;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyzerException {

		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerException(Day21.MoodAnalyzer.MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
			}
			if (this.message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyzerException(Day21.MoodAnalyzer.MoodAnalyzerException.ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
	}
	
	
	public class MoodAnalyzerException extends RuntimeException {

		enum ExceptionType {
			ENTERED_NULL, ENTERED_EMPTY
		}

		ExceptionType type;

		public MoodAnalyzerException(ExceptionType type, String message) {

			super(message);
			this.type = type;
		}
	}
}
