public class NumbersSum {
    String numbers;

    NumbersSum(String numbers){
        this.numbers = numbers;
    }

    int Add(){
        int sum = 0;
        String delimiter = ",";
        if(numbers != numbers.replaceAll("//.+\\\\n", "")){
            //delimiter = Character.toString(numbers.charAt(2));
            int x = numbers.indexOf("n");
            delimiter = numbers.substring(2,x-1);
            numbers = numbers.substring(x+1, numbers.length());
        }
        String[] numbersSeparated = numbers.split(delimiter);
        for(String numbers2 : numbersSeparated) {
            String[] numbersSeparated2 = numbers2.split("\\\\n");
            for(String number : numbersSeparated2) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}
