/* Hybrid inheritance is a type of inheritance that is formed by combining two or more types of inheritance.
👉 In simple words:
Combination of inheritance types = Hybrid inheritance
For example:
Single + Multilevel
Hierarchical + Multiple
Multilevel + Hierarchical
*/
/* Hybrid inheritance using classes
   Combination of Multilevel + Hierarchical
*/
// Grandparent
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
// Parent (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
// Child 1 (multilevel chain)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}
// Child 2 (hierarchical)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class hybridinheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // own

        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();  // own
    }
}
