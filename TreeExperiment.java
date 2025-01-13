// TreeNode class
class TreeNode {
  int data;
  TreeNode left, right;

  // Constructor
  public TreeNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

// BinaryTree class
class BinaryTree {
  TreeNode root;

  // Constructor
  public BinaryTree() {
    this.root = null;
  }

  // Insert a node into the tree
  public void insert(int data) {
    root = insertRecursive(root, data);
  }

  private TreeNode insertRecursive(TreeNode node, int data) {
    if (node == null) {
      return new TreeNode(data);
    }

    if (data < node.data) {
      node.left = insertRecursive(node.left, data);
    } else if (data > node.data) {
      node.right = insertRecursive(node.right, data);
    }

    return node;
  }

  // In-order traversal (Left -> Root -> Right)
  public void inOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      System.out.print(node.data + " ");
      inOrder(node.right);
    }
  }

  // Pre-order traversal (Root -> Left -> Right)
  public void preOrder(TreeNode node) {
    if (node != null) {
      System.out.print(node.data + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  // Post-order traversal (Left -> Right -> Root)
  public void postOrder(TreeNode node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.data + " ");
    }
  }
}

// Main class
public class TreeExperiment {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    // Insert nodes into the tree
    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    // Perform tree traversals
    System.out.println("In-order traversal:");
    tree.inOrder(tree.root);
    System.out.println();

    System.out.println("Pre-order traversal:");
    tree.preOrder(tree.root);
    System.out.println();

    System.out.println("Post-order traversal:");
    tree.postOrder(tree.root);
    System.out.println();
  }
}
