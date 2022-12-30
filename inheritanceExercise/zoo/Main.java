package inheritanceExercise.zoo;

public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake("John The Snake");
        Gorilla gorilla = new Gorilla("Mery");
        Lizard lizard = new Lizard("Franz The Lizard");
        Bear bear = new Bear("Winnie");

        System.out.printf("In the Zoo there are: %s, %s, %s and %s.",
                lizard.getName(), snake.getName(), gorilla.getName(), bear.getName());
    }
}
