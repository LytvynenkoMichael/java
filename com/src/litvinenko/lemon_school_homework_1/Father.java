package litvinenko.lemon_school_homework_1;

public class Father implements FatherImpl {
    private String name;
    private String age;

    public Father(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void canRead() {
        System.out.println("I can read");
    }
}
