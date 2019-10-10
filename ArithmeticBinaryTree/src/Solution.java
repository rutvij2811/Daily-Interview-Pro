public class Solution {
    static class Node {
        String value;
        Node left, right;

        Node(String item) {
            value = item;
            left = right = null;
        }
    }
    //To convert leaf nodes to integer values to perform the operation.
    static int toInt(String s){
        return Integer.parseInt(s);
    }
    //Recursive evaluation
    static int eval(Node root){
        if(root==null){
            return 0;
        }
        //IF the node is Leaf Node get the integer value
        if(root.left==null && root.right == null){
            return toInt(root.value);
        }
        //Evaluating the left SubTree
        int l_val = eval(root.left);
        //Evaluating the right SubTree
        int r_val = eval(root.right);

        if(root.value=="+"){
            return l_val+r_val;
        }
        if(root.value=="-"){
            return l_val-r_val;
        }
        if(root.value=="*"){
            return l_val*r_val;
        }
        return l_val/r_val;
    }

    public static void main(String[] args) {

        Node root = new Node("*");
        root.left = new Node("+");
        root.left.left = new Node("3");
        root.left.right = new Node("2");
        root.right = new Node("+");
        root.right.left = new Node("4");
        root.right.right = new Node("5");

        System.out.println(eval(root));

    }
}
