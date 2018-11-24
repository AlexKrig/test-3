package k_test3;

public class Person {
    private String login;
    private String password;
    private int age;

    public Person() {
    }

    public Person(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "данные персоны:" +
                "логин = " + login +
                ", пароль = " + password +
                ", возраст = " + age;
    }
}
