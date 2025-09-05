import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber;
        randomNumber = random.nextInt(1,7); //7 is exclusive -> gives 1 to 6

        System.out.println(randomNumber);
    }
}
