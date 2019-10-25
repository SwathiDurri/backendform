package com.noesisinformatica.test;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        TestService testService = new TestService();
        System.out.println( "Number of terms : " + testService.getAllTerm().size());
        testService.saveTerm("Term from app");
    }
}
