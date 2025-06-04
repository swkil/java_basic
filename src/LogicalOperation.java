public class LogicalOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("접속 가능");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("쉴 수 있습니다");
        }

        boolean isRaining = true;
        if (!isRaining) {
            System.out.println("맑다");
        } else {
            System.out.println("비가 온다");
        }
    }
}
