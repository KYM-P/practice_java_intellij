package Random;
import java.util.Random;
public class random_test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(6); // 0 ~ 5 중 random 값 int
        double d = r.nextDouble(); // 0 <= r < 1 중 random 값 double
        // Math.random() 은 r.nextDouble() 와 동일한 기능
        int y = (int)(Math.random()*10)%6; // 0 ~ 5 중 random 값 int
        System.out.println(x + " " + y + " " + d);
    }
}
