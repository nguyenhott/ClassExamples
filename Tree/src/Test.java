
public class Test
{
  public static void main(String [] args)
  {
    BST<Integer> bst = new BST<Integer>();
    bst.add(4);
    bst.add(2);
    bst.add(8);
    bst.add(9);
    bst.add(5);
    bst.add(6);
    bst.add(7);

    bst.preorderPrint();
    bst.inorderPrint();
    bst.postorderPrint();
  }

}
