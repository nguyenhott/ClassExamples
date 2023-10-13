
/* 
 * A TDD purest would start with nothing and let the test cases demand the 
 * addition of the class, and the constructor, and the instance variable, 
 * and the method search!
 */

class Searcher
{
  private int [] hayStack;
  private static final Boolean TESTING = false;

  public Searcher(int [] hs)
  {
    hayStack = hs;
  }

  public int search(int needle)
  {
	  /*
	  if (hayStack.length == 0 )
	  {
		  return -1;
	  }
	  else if (hayStack[0] == needle)
	  {
		  return 0;
	  }
	  else if (hayStack.length >= 2 && hayStack[1] == needle)
	  {
		  return 1;
	  }
	  else if (hayStack.length >= 3 && hayStack[2] == needle)
	  {
		  return 2;
	  }
	  else
	  {
		  return -1;
	  }
	  */
	  int i;

	  for(i = 0; i < hayStack.length; i++)
		  if (hayStack[i] == needle)
			  return i;

      return -1;
  }

}
