package Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static class Pairs {
        Node node;
        int state;

        public Pairs(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Integer a[] = {50, 25, 12, null, null, 110, 30, null, null, null, 75, 62, null, 70, null, null, 98, null, null};
        Node root = TreeContructor(a);
       /* System.out.println("Size of the Tree: " + size(root));
        System.out.println("Sum of the Tree: "+sum(root));
        System.out.println("Max data in Tree: "+ maxInTree(root));
        System.out.println("Height of the Tree: "+heightOfTree(root));

        System.out.println("Preorder Traversal:");
        traversalPre(root);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Inorder Traversal: ");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Postorder Traversal: ");
        traversalPost(root);*/

        System.out.println(preIterativeTraversal(root));
        traversalPre(root);
    }

    public static Node TreeContructor(Integer a[]){
        Node root = new Node(a[0], null, null);
        Pairs rtp = new Pairs(root, 1);
        Stack<Pairs> st = new Stack<>();
        st.push(rtp);

        int index = 0;
        while (st.size() > 0) {
            Pairs top = st.peek();
            if (top.state == 1) {
                index++;
                if (a[index] != null) {
                    Node ln = new Node(a[index], null, null);
                    top.node.left = ln;

                    Pairs lp = new Pairs(ln, 1);
                    st.push(lp);

                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                index++;
                if (a[index] != null) {
                    Node rn = new Node(a[index], null, null);
                    top.node.right = rn;

                    Pairs rp = new Pairs(rn, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();

            }

        }
        return root;

    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data;
        str += "<-" + node.data + "->";
        str += node.right == null ? "." : node.right.data;

        System.out.println(str);
        display(node.left);
        display(node.right);
    }


    public static int sum(Node node) {

        if(node==null){
            return 0;
        }

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);
        int totalSum = leftSum + rightSum + node.data;
        return totalSum;
    }

    public static int maxInTree(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int maxInLeft = maxInTree(node.left);
        int maxInRight = maxInTree(node.right);

        int maxNode = maximum(node.data,maximum(maxInRight,maxInLeft));
        return maxNode;
    }

    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);
        int totalSize = leftSize+rightSize+1;

        return totalSize;
    }


    public static int heightOfTree(Node node){
        if(node==null){
            return -1;
        }
        int leftHeight = heightOfTree(node.left);
        int rightHeight = heightOfTree(node.right);
        int totalHeight = maximum(leftHeight,rightHeight)+1;


        return totalHeight;
    }

    public static int maximum(int a,int b){
        if(a>b)return a;
        else return b;
    }


    //Traversals

    public static void traversalPre(Node node){
        if(node==null)return;
        System.out.print(node.data+" ");
        traversalPre(node.left);
        traversalPre(node.right);
    }
    public static void traversalIn(Node node){
        if(node==null)return;

        traversalIn(node.left);
        System.out.print(node.data+ " ");
        traversalIn(node.right);
    }
    public static void traversalPost(Node node){
        if(node==null)return;
        traversalPost(node.left);
        traversalPost(node.right);
        System.out.print(node.data+" ");
    }


    public static void levelWiseDataPrint(Node node){
        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(node);
        while (nodeQueue.size()>0){
            int count = nodeQueue.size();
            for(int i = 0;i<count;i++){
                node = nodeQueue.remove();
                System.out.print(node.data+" ");


                if(node.left!=null){
                    nodeQueue.add(node.left);
                }
                if(node.right!=null){
                    nodeQueue.add(node.right);
                }

            }
            System.out.println();

        }
    }


    // 1-> pre, state++, left
    //2-> In, state++, right
    //3-> post, pop,

    public static String preIterativeTraversal(Node node){

        String pre = "";

        Stack<Pairs> st = new Stack<>();
        Pairs rtp = new Pairs(node,1);
        st.add(rtp);

        while (st.size()>0){
           Pairs top = st.peek();
           if(top.state==1){
               pre+=top.node.data+" ";
               top.state++;

               if(top.node.left!=null){
                   Pairs lp = new Pairs(top.node.left,1);
                   st.push(lp);
               }

           }else if(top.state==2){
               top.state++;

               if(top.node.right!=null){
                   Pairs rp = new Pairs(top.node.right,1);
                   st.push(rp);
               }
           }else st.pop();
        }
        return pre;
    }
    public static String inIterativeTraversal(Node node){

        String In = "";

        Stack<Pairs> st = new Stack<>();
        Pairs rtp = new Pairs(node,1);
        st.add(rtp);

        while (st.size()>0){
            Pairs top = st.peek();
            if(top.state==1){

                top.state++;

                if(top.node.left!=null){
                    Pairs lp = new Pairs(top.node.left,1);
                    st.push(lp);
                }

            }else if(top.state==2){
                In+=top.node.data+" ";
                top.state++;

                if(top.node.right!=null){
                    Pairs rp = new Pairs(top.node.right,1);
                    st.push(rp);
                }
            }else st.pop();
        }
        return In;
    }
    public static String postIterativeTraversal(Node node){

        String post = "";

        Stack<Pairs> st = new Stack<>();
        Pairs rtp = new Pairs(node,1);
        st.add(rtp);

        while (st.size()>0){
           Pairs top = st.peek();
           if(top.state==1){

               top.state++;

               if(top.node.left!=null){
                   Pairs lp = new Pairs(top.node.left,1);
                   st.push(lp);
               }

           }else if(top.state==2){
               top.state++;

               if(top.node.right!=null){
                   Pairs rp = new Pairs(top.node.right,1);
                   st.push(rp);
               }
           }else
           {
               post+=top.node.data+" ";
               st.pop();}
        }
        return post;
    }








}


