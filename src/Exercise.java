public class Exercise {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.setLogin("Yunus");
        ex.setPassword("12345");

        Example ex2 = new Example();
        ex2.setLogin("Ayxan");
        ex2.setPassword("22222");

        Animal animal = new Tiger();
        Animal animal1 = new Lion();
    }
}

class Example{
    private String login = "Suleyman";
    private String password = "12345";

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

    public void getData(){
        System.out.println(login + " " + password);
    }
}

class ExampleNew extends Example implements ExampleOld, ExampleInterface{
    private String number;

    public void getData(){
        System.out.println(number);
    }

    @Override
    public void getInfo() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void getTime() {

    }
}

interface ExampleOld{
    void getInfo();
    String getName();
}

interface ExampleInterface{
    void getTime();
}

class Animal{

}

class Tiger extends Animal{

}

class Lion extends Animal{

}

class Elephant extends Animal{

}