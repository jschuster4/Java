class BSTNode
{
    constructor(value)
    {
        this.left=undefined;
        this.right=undefined;
        this.value=value;
    }
};

class BST
{
    constructor()
    {
        this.root=undefined;
    }

    /* Worst Time Complexity O(N) <- Only happens if you have an unbalanced tree.  */
    /* Average Time Complexity: O(log n) */
    /* Best Time Complexity: O(1) <- Only happens if the list is empty */
    /* Description: Inserts the given node into the tree based on its value */
    Insert(value)
    {
        let node = this.root; 
        while (node){
            if (node.value < value){
                if (node.right){
                    node = node.right;
                }
                else{
                    node.right = new BSTNode(value);
                    return;
                }
            }
            if (node.value > value){
                if (node.left){
                    node = node.left;
                }
                else{
                    node.left = new BSTNode(value);
                    return;
                }
            }
        }
    }

    /* Worst Time Complexity O(N) <- Only happens if you have an unbalanced tree.  */
    /* Average Time Complexity: O(log n) */
    /* Best Time Complexity: O(1) <- Only happens if the list is empty */
    /* Description: Inserts the given node into the tree RECURSIVELY based on its value */
    InsertRecursive(value, node=this.root)
    {
        if (node.value > value){
            if(node.left){
                return this.InsertRecursive(value, node.left)
            }
            else{
                node.left = new BSTNode(value);
                return;
            }
        }
        if (node.value < value){
            if(node.right){
                return this.InsertRecursive(value, node.right)
            }
            else{
                node.right = new BSTNode(value);
                return;
            }
        }      
    }

    /* I'm just here to print your BST In-Order. */
    Log(node,fmt="")
    {
        if(!node) return fmt;
        fmt=this.Log(node.left,fmt);
        fmt+=node.value+"->";
        fmt=this.Log(node.right,fmt);
        return fmt;
    }
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/
let bst=new BST();

bst.root=new BSTNode(100);
bst.root.left=new BSTNode(50);
bst.root.right=new BSTNode(150);

bst.root.left.left=new BSTNode(25);
bst.root.left.right=new BSTNode(75);

bst.root.right.left=new BSTNode(125);
bst.root.right.right=new BSTNode(175);

bst.Insert(44);
console.log(bst.Log(bst.root));     /* Expected: 25->44->50->75->100->125->150->175-> */
bst.InsertRecursive(22,bst.root);
console.log(bst.Log(bst.root));        /* Expected: 22->25->44->50->75->100->125->150->175-> */