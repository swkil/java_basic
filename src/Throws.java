public class Throws {
    public static void main(String[] args) {
        String strNum = "123a";
        String input = "100";
        String test = "2,a20";

        try {
            int num = convertToInt(strNum);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류");
        }

        try {
            validateTokenCount(input);
            System.out.println("숫자 2개");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = multiply(test);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static void validateTokenCount(String tokens) throws NumberFormatException {
        if (tokens.length() != 2) {
            throw new NumberFormatException("숫자 2개가 아님");
        }
    }

    public static int multiply(String input) throws NumberFormatException {
        String[] splitInput = input.split(",");
        int[] results = new int[2];

        for (int i = 0; i < splitInput.length; i++) {
            results[i] = Integer.parseInt(splitInput[i]);
        }

        return results[0] * results[1];
    }
}
