public class Twofer {
    public String twofer(String name) {
        String response = "";
        return (name == null || name.isBlank()) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }
}
