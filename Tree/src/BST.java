public class BST<E extends Comparable<E>> implements IBST<E>
{
  protected class Node
  {
    protected E value;
    protected Node left;
    protected Node right;
  
    public Node(E v)
    {
      value = v;
      left = null;
      right = null;
    }
  
    public String toString() {
        return value.toString();
    }
  
    private boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean add(E item)
    {
      if (item.compareTo(value) == 0)
        return false;
  
      if (item.compareTo(value) < 0)
        if (left == null)
          left = new Node(item);
        else
          return left.add(item);         // delegate add to left
      else
        if (right == null)
          right = new Node(item);
        else
          return right.add(item);        // delegate add to right
  
      return true;
    }
    public E find(E target)
    {
      if (target.compareTo(value) == 0)
        return value;
  
      if (target.compareTo(value) < 0)
        if (left == null)
          return null;
        else
          return left.find(target);      // delegate find to left
      else
        if (right == null)
          return null;
        else
          return right.find(target);     // delegate find to right
    }

    public void preorderPrint()
    {
      System.out.print(value + " ");
      if (left != null)
        left.preorderPrint();
      if (right != null)
        right.preorderPrint();
    }

    public void inorderPrint()
    {
      if (left != null)
        left.inorderPrint();
      System.out.print(value + " ");
      if (right != null)
        right.inorderPrint();
    }

    public void postorderPrint()
    {
      if (left != null)
        left.postorderPrint();
      if (right != null)
        right.postorderPrint();
      System.out.print(value + " ");
    }

    private Node rightmostParent()
    {
        return null;
    }

    private Node remove()
    {
        return null;
    }

    public Node delete(E target)
    {
        return null;
    }
  }

  protected Node root;

  public BST() {
      root = null;
  }

  public boolean contains(E target) {
      return find(target) != null;
  }

  public E find(E target) {
      return root == null ? null : root.find(target);
  }

  public boolean remove(E target) {
      return delete(target) != null;
  }

  public boolean add(E item)
  {
    if (root == null)
    {
      root = new Node(item);
      return true;
    }
    else
      return root.add(item);
  }

    public E delete(E target)
    {
        return null;
    }

  public void preorderPrint()
  {
    if (root == null)
      System.out.print("empty tree");
    else
      root.preorderPrint();
    System.out.println("");
  }

  public void inorderPrint()
  {
    if (root == null)
      System.out.print("empty tree");
    else
      root.inorderPrint();
    System.out.println("");
  }

  public void postorderPrint()
  {
    if (root == null)
      System.out.print("empty tree");
    else
      root.postorderPrint();
    System.out.println("");
  }


}

