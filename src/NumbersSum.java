public class NumbersSum {
    String numbers;

    NumbersSum(String numbers){
        this.numbers = numbers;
    }

    int Add() throws Exception {
        int sum = 0;
        String negatives = "";
        String delimiters = ",";
        if (numbers != numbers.replaceAll("//.+\\\\n", "")) {
            int x = numbers.indexOf("\\n");
            delimiters = numbers.substring(2, x);
            numbers = numbers.substring(x + 2, numbers.length());
            if (delimiters.substring(0, 1).equals("[") && delimiters.substring(delimiters.length() - 1, delimiters.length()).equals("]")) {
                String[] delimitersMassive = delimiters.split("\\[");
                for (String delim : delimitersMassive) {
                    if (!delim.equals("") && !delim.substring(delim.length() - 1, delim.length()).equals("]")) {
                        delimitersMassive[java.util.Arrays.asList(delimitersMassive).indexOf(delim) + 1] = delim + "[" + delimitersMassive[java.util.Arrays.asList(delimitersMassive).indexOf(delim) + 1];
                    }
                    else if (!delim.equals("")) {
                        while (numbers.contains(delim.substring(0, delim.length() - 1))) {
                            numbers = numbers.replace(delim.substring(0, delim.length() - 1), ",");
                        }
                    }
                }
            } else {
                while (numbers.contains(delimiters)) {
                    numbers = numbers.replace(delimiters, ",");
                }
            }
            String[] numbersSeparated = numbers.split("\\\\n");
            for (String numbers2 : numbersSeparated) {
                String[] numbersSeparated2 = numbers2.split(",");
                for (String number : numbersSeparated2) {
                    if (Integer.parseInt(number) < 0) {
                        negatives += number + " ";
                    }
                    if (Integer.parseInt(number) < 1001) {
                        sum += Integer.parseInt(number);
                    }
                }
            }
            if (negatives != "") {
                throw new Exception("Negatives not allowed " + negatives);
            }
        }
        return sum;
    }
}
