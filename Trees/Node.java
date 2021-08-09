package Trees;

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
        Integer a[] = {50, 25, 12,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
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

                }else
                    {
                        top.node.left=null;
                    }
                top.state++;
            }else if (top.state == 2) {
                index++;
                if (a[index] != null) {
                    Node rn = new Node(a[index], null, null);
                    top.node.right = rn;

                    Pairs rp = new Pairs(rn, 1);
                    st.push(rp);
                }else {top.node.right=null;}
                top.state++;
            } else {
                st.pop();

            }

        }

        display(root);


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


}


