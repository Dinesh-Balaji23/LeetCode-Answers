int maxSum = INT_MIN;

int traversal(struct TreeNode* root){
    if(root == NULL) return 0;
    int left = fmax(traversal(root -> left) , 0);
    int right = fmax(traversal(root -> right) , 0);
    maxSum = fmax(maxSum, root -> val + left + right);
    return root -> val + fmax(left, right);
}

int maxPathSum(struct TreeNode* root) {
    maxSum = INT_MIN;
    traversal(root);
    return maxSum;
}