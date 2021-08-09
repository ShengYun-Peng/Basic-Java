package chap6;

public class GenerateRandomCharacter {
    private static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + (Math.random() * (ch2 - ch1 + 1)));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'B');
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uffff');
    }
}

class TestGenerateRandomCharacter {
    public static void main(String[] args) {
        final int CHAR_PER_LINE = 20;
        final int LINES = 5;

        for (int i = 0; i < LINES; ++i) {
            for (int j = 0; j < CHAR_PER_LINE; ++j)
                System.out.print(GenerateRandomCharacter.getRandomUpperCaseLetter());
            System.out.println();
        }
    }
}
