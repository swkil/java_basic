public class WhileLoop {
    public static void main(String[] args) {
        boolean i = true;
        int a = 1;

        while (i) {
            System.out.println(a);
            a++;
            if (a > 5) {
                break;
            }
        }

        int input = 1;
        do {
            System.out.println("---자판기---");
            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잔액 부족");
            }
        } while (input == 0);
    }
}
