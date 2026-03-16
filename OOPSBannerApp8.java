import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });
        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });
    }

    public static void displayBanner(String message) {
        int rows = 5; 
        
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : message.toUpperCase().toCharArray()) {
                if (patternMap.containsKey(c)) {
                    line.append(patternMap.get(c)[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}
