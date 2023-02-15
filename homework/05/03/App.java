class App {
    public static void main(String [] args) {
        method1(new Bird("name"));
        method1(new Human("name"));
        method1(new Dog("name"));

        method2(new Human("name"));
        method2(new Dog("name"));

        method3(new Human("name"));

        method4(new Bird("name"));
        method4(new Human("name"));
        method4(new Dog("name"));
        method4("name");
        // + every other class (cannot create new class from abstract or interface) 
        // since every class extends Object
    }
    public static void method1(Animal a) {

    }
    public static void method2(Mammal a) {
        a.makeSound();
        a.giveBirthToLivingChild();
        // only methods that are implemented in Mammal class and it's parent classes can be called here
        // a.createArt() --> not found in class Dog
        // a.sniffButt() --> not found in class Human
    }
    public static void method3(Human a) {

    }
    public static void method4(Object a) {

    }
}