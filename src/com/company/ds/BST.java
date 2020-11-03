public class BST {

    public String breathFisrtSearch(Node node) {
        String result = "";
        
        // this finds the end of the branch
        if (node == null) {
            result += " ";
            return node;
        } else {
            result += node.data;
        }

        if(node.left != null) {
        result += breathFisrtSearch(node.left);
        }

        if (node.right != null) {
        result += breathFisrtSearch(node.right);
        }

        return result;
    }
    
    public static void main (String args []) {
        BST firstTreeWithBranches = new BST();

        Node node = new Node(1, null, null);
        firstTreeWithBranches.breathFisrtSearch(node);
    }
}


class Node {
    Integer data;
    Node left;
    Node right;

    public Node (Integer data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}