import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        NumbersSum ns = new NumbersSum(numbers);
        int result = ns.Add();
        System.out.println("Your sum "+Integer.toString(result));
    }
}


