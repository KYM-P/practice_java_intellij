package Random;
import java.util.Random;
public class random_test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(6); // 0 ~ 5 �� random �� int
        double d = r.nextDouble(); // 0 <= r < 1 �� random �� double
        // Math.random() �� r.nextDouble() �� ������ ���
        int y = (int)(Math.random()*10)%6; // 0 ~ 5 �� random �� int
        System.out.println(x + " " + y + " " + d);
    }
}
