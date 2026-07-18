import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        if(language != null && !language.isBlank()){
            languages.add(language);
        }
    }

    public void removeLanguage(String language) {
        for(int i = languages.size() - 1; i>=0; i--){
            if(languages.get(i).equalsIgnoreCase(language)){
                languages.remove(i);
            }
        }
    }

    public String firstLanguage() {
        if(!languages.isEmpty()){
            return languages.get(0);
        }
        return "List Empty";
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.stream()
                .anyMatch(lang -> lang.equalsIgnoreCase("Java") 
                               || lang.equalsIgnoreCase("Kotlin"));
    }
}
