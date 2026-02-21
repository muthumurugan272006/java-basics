//One parent class is inherited by multiple child classes.
//Parent → Child1, Child2, Child3
// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Rocky";
        d1.eat();
        d1.bark();

        Cat c1 = new Cat();
        c1.name = "Kitty";
        c1.eat();
        c1.meow();
    }
}