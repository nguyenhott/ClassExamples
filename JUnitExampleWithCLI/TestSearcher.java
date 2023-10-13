import org.junit.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

// for main
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// for listener
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class TestSearcher
{
  public TestSearcher() {}

  @Test
  public void emptyListTest()
  {
    int [] hayStack = new int [] {};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(42);
    assertEquals( -1, returnValue );
  }

  @Test
  public void singleElementTest()
  {
    int [] hayStack = new int [] {42};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(42);
    assertEquals( 0, returnValue );
  }


  @Test
  public void notSingleElementTest()
  {
    int [] hayStack = new int [] {42};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(6);
    assertEquals( -1, returnValue );
  }

  @Test
  public void multiElementTest()
  {
    int [] hayStack = new int [] {6, 42};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(6);
    assertEquals( 0, returnValue );
  }

  @Test
  public void multiSecondElementTest()
  {
    int [] hayStack = new int [] {6, 42};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(42);
    assertEquals( 1, returnValue );
  }

  @Test
  public void threeElementTest()
  {
    int [] hayStack = new int [] {6, 42, 9};
    Searcher s = new Searcher(hayStack);
    int returnValue = s.search(9);
    assertEquals( 2, returnValue );
  }


  public static void main(String[] args) 
  {
    JUnitCore runner = new JUnitCore();
    runner.addListener(new TestListener());
    Result result = runner.run(TestSearcher.class);
  }
}


class TestListener extends RunListener 
{
  public void testStarted(Description description) { 
  
    //System.out.println("Starting "+ description.getMethodName());

  }

  public void testFinished(Description description) 
  {
    //System.out.println("Finished "+ description.getMethodName());
  }

  public void testFailure(Failure failure)
  {
      System.out.println(failure.getMessage());
  }

  public void testRunFinished(Result result) 
  {
    int ran = result.getRunCount();
    int failed = result.getFailureCount();

    System.out.println("Ran " + ran + " passed " + (ran-failed) 
      + (result.wasSuccessful() ? " all passed!" : " ... Failed:"));
   
    for (Failure failure : result.getFailures())
      System.out.println(failure.toString());
  }


}
