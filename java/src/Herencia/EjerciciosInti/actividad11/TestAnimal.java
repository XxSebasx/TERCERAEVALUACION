package Herencia.EjerciciosInti.actividad11;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bidDog = new BigDog();
        bidDog.greeting();

        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        /**
         * Las clases abstractas no se pueden instanciar
         * sin usar los constructores de otra clase que herede
         * ya que se usan para extenderse en otras clases
         */
        // Animal animal4 = new Animal();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        //Cat cat2 = (Cat) animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bidDog);

    }
    
}
