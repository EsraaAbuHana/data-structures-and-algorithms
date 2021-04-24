package utilities;
import org.junit.Test;

import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;

public class multiBracketValidationTest {
  @Test
  public void testSomeLibraryMethod() {
    MultiBracketValidation classUnderTest = new MultiBracketValidation();
    assertTrue("should be TRUE : ",multiBracketValidation("{}"));
    assertTrue("should be TRUE : ",multiBracketValidation("{}(){}"));
    assertTrue("should be TRUE : ",multiBracketValidation("()[[Extra Characters]]"));
    assertTrue("should be TRUE : ",multiBracketValidation("(){}[[]]"));
    assertTrue("should be TRUE : ",multiBracketValidation("{}{Code}[Fellows](())"));
    assertFalse("should be FALSE : ",multiBracketValidation("[({}]"));
    assertFalse("should be FALSE : ",multiBracketValidation("(]("));
    assertFalse("should be FALSE : ",multiBracketValidation("{(})"));
    assertFalse("should be FALSE >>null: ",multiBracketValidation(""));
  }

}
