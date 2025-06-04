public class ForLoop {
    public static void main(String[] args) {
        for (int i = 20; i >= 1; i--){
            if (i % 4 == 0) {
                System.out.println(i);
            }
        } // 4의 배수 출력

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 출력");
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
