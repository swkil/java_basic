public class StringMethod {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.indexOf("l"));
        System.out.println(message.substring(1, 3));

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0, 7) + "..." +
                address.substring(address.length() - 5));

//        String[] arr = message.split("");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("l")) {
//                System.out.println(i);
//                break;
//            }
//        }
//
//        for (int i = 0; i < message.length(); i++) {
//            if (message.charAt(i) == 'l') {
//                System.out.println(i);
//                break;
//            }
//        }
    }
}
