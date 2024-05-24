package practice.SetupBinaryTree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root ;
    protected int size = 0;
    public BST(){

    }
    public BST(E[] object){
        for (int i = 0 ; i < object.length ; i++) {
            insert(object[i]);
        }
    }
    @Override
    public boolean insert(E e){
        if (root == null){
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element)<0){
                parent.left =createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }
    @Override
    public int getSize(){
        return size ;
    }

    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E>root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.element+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BST <String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: "+tree.getSize());
    }
}
