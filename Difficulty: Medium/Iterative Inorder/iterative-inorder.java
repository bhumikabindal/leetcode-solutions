// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)return result;

        Stack<Node> st=new Stack<>();
        // st.push(root);
        Node node=root;
       while(true){
           if(node!=null){
               st.push(node);
               node=node.left;
               }
           else{
               if(st.isEmpty())break;
               node=st.pop();
               result.add(node.data);
               node=node.right;
           }
       }
       return result;
    }
}