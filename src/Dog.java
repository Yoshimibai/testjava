public class Dog implements Eat {
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void bark() {
        System.out.println("ssssssss");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
        System.out.println("sfsfsf");
        System.out.println("hotfix");
        System.out.println("hotfix test");
        System.out.println("master test");
    }
}
