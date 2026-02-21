// A class inherits from a parent class, and then another class inherits from that child class.
//Grandparent → Parent → Child

        // Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();   // from Animal
        p1.bark();  // from Dog
        p1.weep();  // from Puppy
    }
}
 