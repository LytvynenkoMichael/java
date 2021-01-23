package litvinenko.lemon_school_homework_1;

public class Mother implements MotherImpl {
    private String sex;

    public Mother(String sex) {
        this.sex = sex;
    }

    @Override
    public void canRead() {
        System.out.println("I can read");
    }
}
