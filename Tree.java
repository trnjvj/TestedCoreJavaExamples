class TreeNode {
   TreeNode left; 
   int data;    
   TreeNode right; 
   public TreeNode( int d )
   { 
      data = d;              
      left = right = null;
   }
   public synchronized void insert( int d )
   {
      if ( d < data ) {
         if ( left == null )
            left = new TreeNode( d );
         else
            left.insert( d );
      }
      else if ( d > data ) {
         if ( right == null )
            right = new TreeNode( d );
         else
            right.insert( d );
      }
   }
}
public class Tree {
   private TreeNode root;
   public Tree() { root = null; }
   public synchronized void insertNode( int d )
   {
      if ( root == null )
         root = new TreeNode( d );
      else
         root.insert( d );
   }
   public synchronized void preorderTraversal()
      { preorderHelper( root ); }
   private void preorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
      System.out.print( node.data + " " );
      preorderHelper( node.left );
      preorderHelper( node.right );
   }
   public synchronized void inorderTraversal()
      { inorderHelper( root ); }
   private void inorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
      inorderHelper( node.left );
      System.out.print( node.data + " " );
      inorderHelper( node.right );
   }
   public synchronized void postorderTraversal()
      { postorderHelper( root ); }
   private void postorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
      postorderHelper( node.left );
      postorderHelper( node.right );
      System.out.print( node.data + " " );
   }
}
