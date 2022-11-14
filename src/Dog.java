public class Dog extends Animal {

    public void makeSound() {
        System.out.println("Vuf");
    }


    public boolean eat(String foodtype) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood){
            System.out.println("logrer");
        }
        else {
            System.out.println("knurre");
        }

    }
}
