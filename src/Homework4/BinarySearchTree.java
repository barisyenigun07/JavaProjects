package Homework4;

public class BinarySearchTree implements SearchTreeInterface {
    public class Node {
        private IItem data;
        private Node leftChild;
        private Node rightChild;
        public Node() {
            this(null);
        }
        public Node(IItem dataPortion) {
            this(dataPortion, null, null);
        }
        public Node(IItem dataPortion, Node newLeftChild, Node newRightChild) {
            data = dataPortion;
            leftChild = newLeftChild;
            rightChild = newRightChild;
        }
        public IItem getData() {
            return data;
        }
        public void setData(IItem newData) {
            data = newData;
        }
        public Node getLeftChild() {
            return leftChild;
        }
        public void setLeftChild(Node newLeftChild) {
            leftChild = newLeftChild;
        }
        public boolean hasLeftChild() {
            return leftChild != null;
        }
        public Node getRightChild() {
            return rightChild;
        }
        public void setRightChild(Node newRightChild) {
            rightChild = newRightChild;
        }
        public boolean hasRightChild() {
            return rightChild != null;
        }
        public boolean isLeaf() {
            return leftChild == null && rightChild == null;
        }
    }
    private Node root;
    public BinarySearchTree() {
        root = null;
    }
    public BinarySearchTree(IItem rootData) {
        root = new Node(rootData);
    }
    public BinarySearchTree(IItem rootData, BinarySearchTree leftTree, BinarySearchTree rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    }
    public void setTree(IItem rootData) {
        root = new Node(rootData);
    }
    public void setTree(IItem rootData, BinarySearchTree leftTree, BinarySearchTree rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    }
    private void privateSetTree(IItem rootData, BinarySearchTree leftTree, BinarySearchTree rightTree) {
        root = new Node(rootData);
        if (leftTree != null) {
            root.setLeftChild(leftTree.root);
        }
        if (rightTree != null) {
            root.setRightChild(rightTree.root);
        }
    }
    protected Node getRootNode() {
        return root;
    }
    protected void setRootData(IItem rootData) {
        root.setData(rootData);
    }
    protected void setRootNode(Node rootNode) {
        root = rootNode;
    }
    public boolean contains(IItem entry) {
        return getEntry(entry) != null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public IItem add(IItem newEntry) {
        IItem result = null;
        if (isEmpty()) {
            setRootNode(new Node(newEntry));
        } else {
            result = addEntry(getRootNode(), newEntry);
        }
        return result;
    }
    private IItem addEntry(Node rootNode, IItem newEntry) {
        assert rootNode != null;
        IItem result = null;
        int comparison = newEntry.compareTo(rootNode.getData());
        if (comparison <= 0) {
            if (rootNode.hasLeftChild()) {
                result = addEntry(rootNode.getLeftChild(), newEntry);
            } else {
                rootNode.setLeftChild(new Node(newEntry));
            }
        } else {
            assert comparison > 0;
            if (rootNode.hasRightChild()) {
                result = addEntry(rootNode.getRightChild(), newEntry);
            } else {
                rootNode.setRightChild(new Node(newEntry));
            }
        }
        return result;
    }
    public IItem getEntry(IItem entry) {
        return findEntry(getRootNode(), entry);
    }
    private void inorderTraverse(Node node) {
        if (node != null) {
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
            inorderTraverse(node.getRightChild());
        }
    }
    public void inorderTraverse() {
        inorderTraverse(root);
    }
    private void reverseTraverse(Node node) {
        if (node != null) {
            reverseTraverse(node.getRightChild());
            System.out.println(node.getData());
            reverseTraverse(node.getLeftChild());
        }
    }
    public void reverseTraverse() {
        reverseTraverse(root);
    }
    private Node getMinimum(Node rootNode) {
        if (rootNode.hasLeftChild()){
            rootNode = getMinimum(rootNode.getLeftChild());
        }
        return rootNode;
    }
    public IItem getMinimum() {
        IItem item = getMinimum(root).getData();
        return item;
    }
    private Node getMaximum(Node rootNode) {
        if (rootNode.hasRightChild()){
            rootNode = getMaximum(rootNode.getRightChild());
        }
        return rootNode;
    }
    public IItem getMaximum() {
        IItem item = getMaximum(root).getData();
        return item;
    }
    private IItem findEntry(Node rootNode, IItem entry) {
        IItem result = null;
        if (rootNode != null) {
            IItem rootEntry = rootNode.getData();
            if (entry.equals(rootEntry)) {
                result = rootEntry;
            } else if (entry.compareTo(rootEntry) < 0) {
                result = findEntry(rootNode.getLeftChild(), entry);
            } else {
                result = findEntry(rootNode.getRightChild(), entry);
            }
        }
        return result;
    }
    private void lessOrEqualToTree(Node node,int price){
        int minPrice = getMinimum().itemPrice();
        if (node == null){
            return;
        }
        if (minPrice <= node.getData().itemPrice()){
            lessOrEqualToTree(node.getLeftChild(),price);
        }
        if (minPrice <= node.getData().itemPrice() && price >= node.getData().itemPrice()){
            System.out.println(node.getData());
        }
        if (price > node.getData().itemPrice()){
            lessOrEqualToTree(node.getRightChild(),price);
        }
    }
    public void printLessOrEqual(int price){
        lessOrEqualToTree(root,price);
    }
    private void greaterTree(Node node,int price){
        int maxPrice = getMaximum().itemPrice();
        if (node == null){
            return;
        }
        if (maxPrice >= node.getData().itemPrice()){
            greaterTree(node.getRightChild(),price);
        }
        if (maxPrice >= node.getData().itemPrice() && price < node.getData().itemPrice()){
            System.out.println(node.getData());
        }
        if (price < node.getData().itemPrice()){
            greaterTree(node.getLeftChild(),price);
        }
    }
    public void printGreater(int price){
        greaterTree(root,price);
    }
}