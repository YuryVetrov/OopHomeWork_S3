public class Foo {
        int arg1;
        String arg2;
        double arg3;
        int arg4;
        String arg5;
        int arg6;
        String arg7;
    Foo() {
    }

public static void main(String args[]) {
    Foo myFoo = new Foo();
        
        myFoo.arg1 = 12;
        myFoo.arg2 = "qwe";
        myFoo.arg3 = 3.24;
        myFoo.arg4 = 78;
        myFoo.arg5 = "qweasd";
        myFoo.arg6 = 19;
        myFoo.arg7 = "qwe";
        
        System.out.println(myFoo.arg3);
        System.out.println(myFoo.arg5);
    }
}

    