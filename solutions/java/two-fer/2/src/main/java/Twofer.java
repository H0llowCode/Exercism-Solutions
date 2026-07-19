public class Twofer {
    public String twofer(String name) {
        String response = "";
        return (name == null || name.trim().isEmpty()) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }
}
