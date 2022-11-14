public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miav");

    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("Spinder");
        }
        else {
            System.out.println("hvæser");
        }
    }
}
