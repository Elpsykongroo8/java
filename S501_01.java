package s501_01;

class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class S501_01 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
    }
}