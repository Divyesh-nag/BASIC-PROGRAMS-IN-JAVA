public class q2 {
    public void subtract(int a, int b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(double a, double b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(int a, double b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public void subtract(double a, int b){
        System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
    }
    public static void main(String[] args) {
        q2 obj = new q2();
        obj.subtract(23, 13);
        obj.subtract(21.654, 12.122);
        obj.subtract(300, 122);
        obj.subtract(10.3, 4.0);
    }
}
