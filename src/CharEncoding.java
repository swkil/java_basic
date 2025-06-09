public class CharEncoding {
    public static void main(String[] args) {
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        System.out.println("ASCII Code: " + (int)asciiChar);

        char koreanChar = '가';
        System.out.println("Character: " + koreanChar);

        System.out.println("Unicode Code: U+" + Integer.toHexString((int)koreanChar).toUpperCase());
    }
}
