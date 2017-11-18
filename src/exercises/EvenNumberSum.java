package exercises;
import java.util.ArrayList;

public class EvenNumberSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 10; i < 21; i++) {
            numbers.add(i);
            System.out.println(i);
        }

        System.out.println(EvenSum(numbers));
    }

    public static int EvenSum(ArrayList<Integer> thenumbers) {
        Integer even_sum = 0;
        for (int i : thenumbers) {
            if (i % 2 == 0) {
                even_sum = even_sum + i;
            }
        }
        return even_sum;
    }
}
