class Animal {
    void makeSound(){
        System.out.println("all animals make sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("barks");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.makeSound();
        Dog dog=new Dog();
        dog.makeSound();
    }
}