public class SwitchStatement {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "happy";

        switch (mood) {
            case "happy":
                System.out.println("행복하다");
                break;
            case "angry":
                System.out.println("화가 난다");
                break;
            case "sad":
                System.out.println("슬프다");
                break;
            case "tired":
                System.out.println("피곤하다");
                break;
            default:
                System.out.println("실행");
        }

        if (mood == "happy") {
            System.out.println("행복하다");
        } else if (mood == "angry") {
            System.out.println("화가 난다");
        } else if (mood == "sad") {
            System.out.println("슬프다");
        } else if (mood == "tired") {
            System.out.println("피곤하다");
        } else {
            System.out.println("실행");
        }
    }
}
