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

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }

    /* Return the second to last node's value in the list */
    SecondToLast()
    {
        let runner = this.head; 
        if (runner == undefined){
            return undefined;
        }
        var node_value = 0;
        while(runner.next.next){
            runner = runner.next;
        }
        return runner.value
    }

    /* Remove a node whose value matches the given value */
    /* ( You will need to fix .next pointers too! ) */
    RemoveValue(value)
    {
        let runner = this.head; 
        while(runner.next){
            if (value == runner.next.value){
                runner.next.value = null;
                runner.next = runner.next.next;
            }
            runner = runner.next;
        }
    }

    /* Inserts a new node before a node whose value is the search_value. */
    /* Example: */
    /*
        Before:
        10
        30
        40

        Prepend(20,30)

        After:
        10
        20
        30
        40
    */
    Prepend(new_value,search_value)
    {
        let runner = this.head; 
        while(runner.next){
            if (search_value == runner.next.value){
                let node = new Node(new_value);
                node.next = runner.next;
                runner.next = node;
                return
            }
            runner = runner.next;
        }
    }

    /* Insert a node with the given value to the end of the list */
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
/* Code Tests Below */
/*****************************************************************************/

/* Creates our list */
let list=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([111,222,333,444,555,666]);

console.log(list.SecondToLast()) /* Expected: 555 */

list.RemoveValue(333); /* No Output */

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after RemoveValue(333):
    111
    222
        <-- this was 333
    444
    555
    666
*/

list.Prepend(333,444);

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after Prepend(333,444):
    111
    222
    333 <- 333 should be back
    444
    555
    666
*/



// ******************** Teacher Solution ********************************

// class Node
// {
//     constructor(value)
//     {
//         this.next=undefined;
//         this.value=value;
//     }
// };

// class List
// {
//     constructor()
//     {
//         this.head=undefined;
//     }

//     Iterate(fn)
//     {
//         for(let node=this.head;node;node=node.next){fn(node.value);}
//     }

//     PushBack(value)
//     {
//         if(!this.head)
//         {
//             this.head=new Node(value);
//             return;
//         }
//         for(var node=this.head;node.next;node=node.next){}
//         node.next=new Node(value);
//     }

//     PushBackN(arr)
//     {
//         for(let value of arr) this.PushBack(value);
//     }

//     SecondToLast()
//     {
//         /* Your Code Here */
//         let node=this.head;
//         while(node.next.next)
//         {
//             node=node.next;
//         }
//         return node.value;
//     }

//     RemoveValue(value) /* 3 */
//     {
//         /* Your Code Here */
//         let node=this.head;
//         let prev=null;
//         while(node)
//         {
//             if(node.value==value)
//             {
//                 prev.next=prev.next.next;
//                 node.next=undefined;
//                 return;
//             }
//             prev=node;
//             node=node.next;
//         }
//     }

//     Prepend(new_value,search_value)
//     {
//         /* Your Code Here */
//         let node=this.head;
//         let prev=undefined;
//         while(node)
//         {
//             if(node.value==search_value)
//             {
//                 let old_list=node;
//                 prev.next=new Node(new_value);
//                 prev.next.next=old_list;
//             }
//             prev=node;
//             node=node.next;
//         }
//     }
// };

// let list=new List();

// list.PushBackN([111,222,333,444,555,666]);

// list.Prepend(333,444);

// list.Iterate(value=>console.log(value));