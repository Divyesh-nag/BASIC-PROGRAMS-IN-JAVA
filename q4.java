package All;

class Outer { 
    static int x = 200;
    class Inner { 
        public void show(int x) { 
            System.out.println(x); 
        } 
    } 
} 
class q4 extends Outer { 
    public static void main(String[] args) { 
        Outer.Inner in = new Outer().new Inner(); 
        in.show(x); 
    } 
} 