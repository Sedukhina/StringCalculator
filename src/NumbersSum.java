public class NumbersSum {
    String numbers;

    NumbersSum(String numbers){
        this.numbers = numbers;
    }

    int Add(){
        int sum = 0;
        String[] numbersSeparated = numbers.split(",");
        for(String number : numbersSeparated) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
