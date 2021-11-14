public class NumbersSum {
    String numbers;

    NumbersSum(String numbers){
        this.numbers = numbers;
    }

    int Add(){
        int sum = 0;
        String[] numbersSeparated = numbers.split(",");
        for(String numbers2 : numbersSeparated) {
            String[] numbersSeparated2 = numbers2.split("\\\\n");
            for(String number : numbersSeparated2) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
