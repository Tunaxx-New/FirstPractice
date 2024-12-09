package org.practice;


public class Main2 {
    /*
    public:
        Access Modifier
        "Public classes and interfaces, along with public members, define an API.
        It’s that part of our code that others can see and use to control the behavior of our objects."

        https://www.baeldung.com/java-public-keyword

    static:
        Static Flag
        "In Java, when we declare a field static,exactly a <b> single copy </b> of that field is created
        and shared among all instances of that class."

        https://www.baeldung.com/java-static

    void:
        Type field
        "Since JDK 1.1, Java provides us with the Void type.
        Its purpose is simply to represent the void return type as a class and contain a Class<Void> public value.
        It’s not instantiable as its only constructor is private."

        https://www.baeldung.com/java-void-type

    Class.main(String[] args):
        Address field
        "Java’s main() method is the starting point from where the JVM starts the execution of a Java program."

        https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/

        @param1: String[] args
        String: Type Field
        []: Type Field syntax
        args: Address Field
        "It stores Java command-line arguments and is an array of type java.lang.String class.
        Here, the name of the String array is args but it is not fixed and the user can use any name in place of it."

        @return void
     */
    public static void main(String[] args2) {
        // Print string into console
        // java.lang.System
        // https://www.baeldung.com/java-lang-system
        java.lang.System.out.print("Hello and welcome!");

        // For loop
        // https://www.geeksforgeeks.org/java-for-loop-with-examples/
        for (int i = 1; i <= 5; i++) {
            // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}