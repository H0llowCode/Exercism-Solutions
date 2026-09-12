class Bob {

    String hey(String input) {
        String trimmed = input.trim();

        if (trimmed.isEmpty()) {
            return "Fine. Be that way!";
        }
        else if (trimmed.matches("(?s)[^a-z]*[A-Z][^a-z]*\\?")) {
            return "Calm down, I know what I'm doing!";
        }
        else if (trimmed.matches("(?s).*[a-z]*.*\\?")) {
            return "Sure.";
        }
        else if (trimmed.matches("(?s)[^a-z]*[A-Z][^a-z]*")) {
            return "Whoa, chill out!";
        }
        
        return "Whatever.";
    }
}
