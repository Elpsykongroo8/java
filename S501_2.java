package s501_01;

class Calculator1 {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}


public class S501_2 {
    public static void main(String[] args) {
        Calculator1 cal1 = new Calculator1();  
        Calculator1 cal2 = new Calculator1();  
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
