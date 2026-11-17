public class function {
    public static void main(String[] args) {
        // function in java
        greet();
        sayHello("shiwani");
        System.out.println(getNumber());
        System.out.println(multiply(2,4));
        return; // optional

    }
    // no input, no output funtcion
    static void greet(){
        System.out.println("hello");
        return;
    }
    //  IP.  No OP
    static void sayHello(String name) { // Number of parmeters can be anything
        System.out.println("Hello " + name);
    }

    // No ip, OP
    static int getNumber() {
        return 10;
    }

    // IP, OP
    static int multiply(int a, int b) {
        return (a * b);
    }






}
