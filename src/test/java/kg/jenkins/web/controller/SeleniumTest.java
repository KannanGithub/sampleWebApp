package kg.jenkins.web.controller;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TrialCI on 6/27/2018.
 */
@Config(
        url = "http://google.com", // base url that the test launches against
        browser = Browser.CHROME // the browser to use.
       )
public class SeleniumTest extends Locomotive {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHome() throws Exception {
        System.out.println("Testing....");
        Thread.sleep(4000);
    }

}