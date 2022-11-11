package sef.module3.sample;

public class VariableScoping {

    public boolean isTrue = true; // variable is available to the java world
    String name = "I'm a string"; // available to the current package
    private int a; // field
    private static int b; // class variable

    public void run(int c)// parameter
    {
        int d; // local variable
    }
}
