package math;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.junit.Test;

/**
 * A class that it is used to group the 
 * MyMathFactorialParametrized and MyMathTest classes
 * @author nikiboura
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ MyMathFactorialParametrized.class , MyMathTest.class})
public class MyMathTestSuite {
// empty class
}
