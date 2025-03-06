import java.util.Random;

public class GitHubProject {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("The generated number is: " + number);
    }
}
