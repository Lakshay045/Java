public class CharacterCheck {
    public static void main(String[] args) {

        Character ch = '7';

        if (Character.isDigit(ch)) {
            System.out.println("Character is a Digit");
        }
        else if (Character.isLetter(ch)) {
            System.out.println("Character is a Letter");
        }
        else if (Character.isWhitespace(ch)) {
            System.out.println("Character is Whitespace");
        }
        else {
            System.out.println("Character is a Special Character");
        }
    }
}