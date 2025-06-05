public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
//        for (int i = 1; i <= 20; i++) {
//            if (i % 5 == 0) {
//                continue;
//            }
//
//            if (i >= 15) {
//                break;
//            }
//            System.out.println(i);
//        }

        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0 || j % 3 != 0) {
                if (j == 50) {
                    break;
                }
                continue;
            }
            System.out.println(j);
        }
    }
}
