// motivate use of generics 

// alas Java generics don't play nice with the type system:
//    data = (E[]) new Object[MAX+1];

// (recall that == performs reference comparison (address comparison) while
// the .equals() method performs content comparison.)
// challenge: write code that illustrates this difference!

// ifok "javac Contains.java" "java -enableassertions Contains"


class IntArrayStack
{
  static final int MAX = 10;
  private Integer [] data;
  private int top;

  public IntArrayStack()
  {
    data = new Integer[MAX+1];  
    top = -1;
  }

  public void push(Integer value)
  {
    assert(top < MAX);
    data[++top] = value;
  }

  public void pop()
  {
    assert top >= 0;
    top--;
  }

  public Integer top()
  {
    return data[top];
  }

  public boolean containsIterative(Integer value)
  {
    for(int i=top; i>=0; i--)
      if (data[i].equals(value))
        return true;
    return false;
  }
}


class StringArrayStack
{
  static final int MAX = 10;
  private String [] data;
  private int top;

  public StringArrayStack()
  {
    data = new String[MAX+1];
    top = -1;
  }

  public void push(String value)
  {
    assert(top < MAX);
    data[++top] = value;
  }

  public void pop()
  {
    assert top >= 0;
    top--;
  }

  public String top()
  {
    return data[top];
  }

  public boolean containsIterative(String value)
  {
    for(int i=top; i>=0; i--)
      if (data[i].equals(value))
        return true;
    return false;
  }
}


class ArrayStack<E>
{
  static final int MAX = 10;
  private E [] data;
  private int top;

  @SuppressWarnings({"unchecked"})
  public ArrayStack()
  {
    data = (E[]) new Object[MAX+1];
    //data = new E[MAX+1];  // why does this not work?
    top = -1;
  }

  public void push(E value)
  {
    assert(top < MAX);
    data[++top] = value;
  }

  public void pop()
  {
    assert top >= 0;
    top--;
  }

  public E top()
  {
    return data[top];
  }

  public boolean containsIterative(E value)
  {
    for(int i=top; i>=0; i--)
      if (data[i].equals(value))
        return true;
    return false;
  }
}


public class Contains
{
  public static void main(String [] args)
  {
    StringArrayStack ss = new StringArrayStack();
    ss.push("fred");
    ss.push("pebbles");
    System.out.println("\nfind fred " + ss.containsIterative("fred"));
    System.out.println("find barny " + ss.containsIterative("barny"));

    ArrayStack<String> ssUsingGenerics = new ArrayStack<>();
    ssUsingGenerics.push("fred");
    ssUsingGenerics.push("pebbles");
    System.out.println("\nfind fred " + ssUsingGenerics.containsIterative("fred"));
    System.out.println("find barny " + ssUsingGenerics.containsIterative("barny"));
  }
}

