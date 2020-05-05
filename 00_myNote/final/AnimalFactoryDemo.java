public class AnimalFactoryDemo {
    public static void main(String[] args) {
        // Dog without Factory
        Dog dog = new Dog();
        dog.eat();

        // Cat with Factory
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal("cat");
        animal.eat();
    }
}

class AnimalFactory {
    public Animal createAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if ("dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        }
        if ("cat".equalsIgnoreCase(animalType)) {
            return new Cat();
        }
        return null;
    }
}

interface Animal {
    public void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}