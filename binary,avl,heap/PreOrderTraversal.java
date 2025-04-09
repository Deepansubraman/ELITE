import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }

            i++;
            if (i >= ip.length) break;

            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Solution solution = new Solution(); // Create an instance of Solution

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            ArrayList<Integer> res =
                solution.preorder(root); // Call the preorder method
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;
            System.out.println("~");
        }
    }
}


//Back-end complete function Template for Java
class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> arr1=new ArrayList<>();
        helper(root,arr1);
        return arr1;
        
    }
    static void helper(Node root,ArrayList< Integer>arr1)
    {
        if(root==null)
        {
            return ;
        }
        else
        {
            arr1.add(root.data);
            helper(root.left,arr1);
            helper(root.right,arr1);
        }
    }
}