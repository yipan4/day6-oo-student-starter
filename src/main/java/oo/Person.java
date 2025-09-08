package oo;

public class Person {
    protected final int id;
    protected final String name;
    protected final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is %s. I am %d years old.".formatted(name, age);
    }
}

