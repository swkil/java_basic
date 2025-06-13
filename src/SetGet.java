class AdultPerson {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("성인만 가입 가능.");
        } else {
            this.age = age;
        }
    }
}

class ReadOnlyStudent {
    private final int score;

    public ReadOnlyStudent(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class SetGet {
    public static void main(String[] args) {
        AdultPerson person = new AdultPerson();

        person.setName("Alice");
        System.out.println(person.getName());

        person.setAge(20);
        System.out.println(person.getAge());

        ReadOnlyStudent ros = new ReadOnlyStudent(99);
        System.out.println(ros.getScore());
    }
}
