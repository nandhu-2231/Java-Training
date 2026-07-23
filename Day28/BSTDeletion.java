package Day28;

public class BSTDeletion {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public TreeNode deleteNode(TreeNode root, int key) {

            if (root == null)
                return null;

            if (key < root.val) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else {

                // Case 1: No left child
                if (root.left == null)
                    return root.right;

                // Case 2: No right child
                if (root.right == null)
                    return root.left;

                // Case 3: Two children
                TreeNode minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, minNode.val);
            }

            return root;
        }

        private TreeNode findMin(TreeNode node) {
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        public void inorder(TreeNode root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        Solution obj = new Solution();

        System.out.print("Before Deletion: ");
        obj.inorder(root);

        root = obj.deleteNode(root, 3);

        System.out.print("\nAfter Deletion: ");
        obj.inorder(root);
    }
}