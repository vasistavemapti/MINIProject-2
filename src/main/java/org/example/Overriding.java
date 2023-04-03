class Animal {
    public void move() {
        System.out.println("The animal is moving");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("The dog is running");
    }

    @Override
    public String toString() {
        return "This is a dog";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 42;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Dog dog = new Dog();
        dog.move();
        System.out.println(dog);

        Animal animal2 = new Dog();
        animal2.move();
        System.out.println(animal2);

        System.out.println(dog.equals(animal));
        System.out.println(dog.hashCode());

        // This won't compile because bark() is not defined in Animal
        // animal.bark();
        dog.bark();
    }
}
