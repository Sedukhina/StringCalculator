public class NumbersSum {
    String numbers;

    NumbersSum(String numbers){
        this.numbers = numbers;
    }

    int Add() throws Exception{
        int sum = 0;
        String negatives = "";
        String delimiter = ",";
        if(numbers != numbers.replaceAll("//.+\\\\n", "")){
            int x = numbers.indexOf("n");
            delimiter = numbers.substring(2,x-1);
            numbers = numbers.substring(x+1, numbers.length());
        }
        String[] numbersSeparated = numbers.split(delimiter);
        for(String numbers2 : numbersSeparated) {
            String[] numbersSeparated2 = numbers2.split("\\\\n");
            for(String number : numbersSeparated2) {
                if (Integer.parseInt(number)<0){
                    negatives += number + " ";
                }
                sum += Integer.parseInt(number);
            }
        }
        if(negatives != "") {
            throw new Exception("Negatives not allowed " + negatives);
        }
        return sum;
    }
}
