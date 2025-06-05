public class Ternary {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 13;
//
//        int max = (a > b) ? a : b;
//        System.out.println(max);
//
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

//        int score = 61;
//        String result = (score > 60) ? "통과" : "탈락";
//        System.out.println("결과: " + result);
//
//        score = 59;
//        if (score > 60) {
//            result = "통과";
//        } else {
//            result = "탈락";
//        }
//        System.out.println("결과: " + result);

        String color = "보라";
        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";
        System.out.println(choiceColor);

        if (color == "빨강") {
            choiceColor = "빨강";
            System.out.println(choiceColor);
        } else if (color == "파랑") {
            choiceColor = "파랑";
            System.out.println(choiceColor);
        } else {
            choiceColor = "보라";
            System.out.println(choiceColor);
        }
    }
}
