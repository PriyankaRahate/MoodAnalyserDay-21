package moodAnalyserDay21;

public class MoodAnalysisException extends Exception {
    enum ExceptionType {
        NULL;
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String msg) {
        super(msg);
        this.type = type;
    }
}
