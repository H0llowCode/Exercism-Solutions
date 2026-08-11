public class LogLevels {
    
    public static String message(String logLine) {
        logLine = logLine.strip().replaceAll("\\s+", " ");
        int colonIdx = logLine.indexOf(":");
        return logLine.substring(colonIdx + 2);
    }

    public static String logLevel(String logLine) {
        int openBracket = logLine.indexOf("[");
        int closeBracket = logLine.indexOf("]");
        return logLine.substring(openBracket + 1, closeBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
