public class OOPSBannerApp7{

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        String[] oPattern = {
            "  *** ",
            " * * ",
            "* *",
            "* *",
            "* *",
            " * * ",
            "  *** "
        };

        String[] pPattern = {
            "***** ",
            "* * ",
            "* * ",
            "***** ",
            "* ",
            "* ",
            "* "
        };

        String[] sPattern = {
            " **** ",
            "* ",
            "* ",
            " **** ",
            "     * ",
            "     * ",
            " **** "
        };

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern)
        };

        displayBanner(patterns);
    }

    public static void displayBanner(CharacterPatternMap[] patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}
