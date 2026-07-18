public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");

        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int closingBracket = logLine.indexOf("]");
        int openingBracket = logLine.indexOf("[");
        return logLine.substring(openingBracket + 1, closingBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
