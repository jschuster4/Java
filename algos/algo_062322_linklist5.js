/* Back to linked lists! */

class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    /* Time:O(n) */
    /* Space:O(1) */
    /* Description: Iteratively reverses the linked list in-place. Don't make a new list. */
    /*
        Instructions (These go IN your loop):
        1. Store .next (The one AFTER your runner), because if you lose it, you can't go back.
        2. Set current's next to previous.
        3. Set previous to current
        4. Set current to step one's value. (The old next)
        5. Set head to previous (I go outside the loop when you're done).
    */
    Reverse()
    {
        if (this.head == undefined) return;
        if (this.head.next == undefined) return;
        var runner=this.head;
        let previous = undefined
        var current=runner;
        
        while(current){
            var next=current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head=previous;
    }

    Log()
    {
        let str="";
        for(let r=this.head;r;r=r.next) str+=r.value+"->";
        console.log(str);
    }

    PushBack(value)
    {
        /* Your Code Here */
        if(!this.head)
        {
            this.head=new Node(value);
            return;
        }
        for(var node=this.head;node.next;node=node.next){}
        node.next=new Node(value);
    }

    PushBackN(arr)
    {
        /* Your Code Here */
        for(let value of arr) this.PushBack(value);
    }
};

/*****************************************************************************/
/* Code Tests Below: */
/*****************************************************************************/
let items=[10,20,30,40,50];
let list=new List();
list.PushBackN(items); /* Remember Me? Bring me back for this to work! */
list.Reverse();
list.Log(); /* Expected: 50->40->30->20->10-> */