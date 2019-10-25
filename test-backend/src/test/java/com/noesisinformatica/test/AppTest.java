package com.noesisinformatica.test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    TestService testService = null;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // instantiate data service
        testService = new TestService();
    }

    public void testApp(){

        // some terms must have been created during initialisation
        int termInDataService = testService.getAllTerm().size();
        System.out.println( "Number of terms : " + termInDataService);
        assert termInDataService > 0;
    }

    public void testSaveTerm() throws Exception {

        int termInDataService = testService.getAllTerm().size();
        // adding term should increment number
        testService.saveTerm("Term from app");
        assert testService.getAllTerm().size() > termInDataService;
    }

    public void testGetTerm() throws Exception {

        String testTerm = "Second test term";
        // adding term and getting last used id should give us the id
        testService.saveTerm(testTerm);
        long id = testService.getLastUsedId();
        // retrieving using id should give us the term
        assertEquals(testTerm, testService.getTermForId(id));
    }
}
