package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
  // TODO: Remove this comment
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        System.out.println( "This is a new line!" );
        login();
        System.err.println("Hello")
    }
    
    // Simulating hard-coded credentials to trigger SonarQube rule
    public static void login() {
        String username = "admin";
        String password = "password123"; // Hard-coded password
        System.out.println("Hello " + username + ". Password: " + password);
    }

    private static void unusedMethod() {
        System.out.println("This method is never used.");
    }

    public String exposedField;
}
