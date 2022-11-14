public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miav");

    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }
}
