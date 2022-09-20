public class Person {
    String name;
    Dog dog;

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public Person() {
    }

    public void play() {
        dog.bark();
    }

    public static void main(String[] args) {
        Person p = new Person("sf", new Dog("sfw", 2));
        p.play();
        Eat eat = new Dog("sfw", 2);
        eat.eat();

    }
}
