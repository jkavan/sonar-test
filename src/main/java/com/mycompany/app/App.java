package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "This is a new line!" );
        printDuplicateMessage();
    }
    
    // Intentionally duplicating code to trigger SonarQube rule
    public static void printDuplicateMessage() {
        System.out.println( "Hello World!" );
        System.out.println( "This is a new line!" );
    }
}
