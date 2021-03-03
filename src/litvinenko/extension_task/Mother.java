package litvinenko.extension_task;

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
