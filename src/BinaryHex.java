public class BinaryHex {
    public static void main(String[] args) {
        int num = 123;

        String binarySting = Integer.toBinaryString(num);
        System.out.println("Binary: " + binarySting);

        String HexString = Integer.toHexString(num);
        System.out.println("Hex: " + HexString);
    }
}
