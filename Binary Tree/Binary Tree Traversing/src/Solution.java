/*
*
* */

public class Solution {
    public static void main(String[] args) {
        Node head = new Node(0);

        Node p = head;
        for (int i=1; i<10; i++) {
            Node q = new Node(i);

            if (i % 2 == 0)
                p.left = q;
            else
                p.right = q;

            p = q;
        }

        preOrderTraverse(head);
        System.out.println();
        inOrderTraverse(head);
        System.out.println();
        postOrderTraverse(head);
        System.out.println();
    }

    public static void preOrderTraverse(Node head) {
        if (head == null)
            return;

        System.out.print(head.value);

        if (head.left != null)
            preOrderTraverse(head.left);
        if (head.right != null)
            preOrderTraverse(head.right);
    }

    public static void inOrderTraverse(Node head) {
        if (head == null)
            return;

        if (head.left != null)
            inOrderTraverse(head.left);

        System.out.print(head.value);

        if (head.right != null)
            inOrderTraverse(head.right);
    }

    public static void postOrderTraverse(Node head) {
        if (head == null)
            return;

        if (head.left != null)
            postOrderTraverse(head.left);

        if (head.right != null)
            postOrderTraverse(head.right);

        System.out.print(head.value);
    }
}
