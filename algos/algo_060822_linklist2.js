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

    /* Determines whether the given value was found within the list */
    /* ( Returns a bool, true or false ) */
    Contains(value)
    {
        if(this.head && this.head.value == value){
            return true;
        }
        let runner = this.head;
        while(runner.next){
            let current_value = runner.value;
            if (current_value == value){
                return true;
            }
            runner = runner.next;
        }
        return false;
        /* Your Code Here */
    }

    /* Recursively determines whether the given value was found within the list. */
    /* ( Returns a bool, true or false ) */
    ContainsRecursive(value, node = this.head)
    {
        if (!node){
            return false;
        }
        if (node.value == value){
            return true;
        }
        let runner = node.next;
            return this.ContainsRecursive(value, runner);
    }

    /* Removes and returns the last value in the list. */
    /* Treat me like array.pop() would */
    PopBack()
    {
        let runner = this.head;
        if (runner == undefined) return undefined;
        if (runner.next == undefined) return this.PopFront();
        while(runner.next.next){
            runner = runner.next
        }
        let node = runner.next;
        runner.next = undefined;
        return node;
    }

    /* EXTRA / OPTIONAL */
    /* Recursively finds and returns the largest number in the list. */
    MaxR(node)
    {
        /* Your Code Here */
    }


    // **************** Day 1 code ***********************
        /* Determine whether the list is empty. */
    IsEmpty()
    {
        /* Your Code Here */
        return this.head==undefined;
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

    /* Insert an array of nodes with the given values to the end of the list. */
    PushBackN(arr)
    {
        /* Your Code Here */
        for(let value of arr) this.PushBack(value);
    }
};



/* Create our list */
let list=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([123,234,345,456,567,678]);

console.log(list.Contains(456)); /* Expected Output: true */
console.log(list.ContainsRecursive(345)); /* Expected Output: true */
// console.log(list.PopBack()); /* Expected Output: 678 */
// console.log(list.PopBack()); /* Expected Output: 567 */
// console.log(list.Contains(567)); /* Expected Output: false */
/* Iterates our list, so we can see our node values */
/* I'm a freebie, don't change me. */
list.Iterate(value=>console.log(value));
/*
    Expected Output:
    123
    234
    345
    456
*/

// ****************** TEACHER SOLUTION *************************
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
//         /* Your Code Here */
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
//         /* Your Code Here */
//         for(let value of arr) this.PushBack(value);
//     }

//     /* Determines whether the given value was found within the list */
//     /* ( Returns a bool, true or false ) */

//     /* value=40 */
    
//     Contains(value)
//     {
//         /* Your Code Here */
//         let node=this.head;
//         while(node)
//         {
//             if(node.value==value)
//             {
//                 return true;
//             }
//             node=node.next;
//         }
//         return false;
//     }

//     /* Recursively determines whether the given value was found within the list. */
//     /* ( Returns a bool, true or false ) */

//     /* node=10,20,30 */
//     /* value=30 */
//     ContainsRecursive(node,value)
//     {
//         /* Your Code Here */
//         /* Call Me Recursively! */
//         if(!node) return false;
//         if(node.value==value) return true;
//         return this.ContainsRecursive(node.next,value);
//     }

//     /* Removes and returns the last value in the list. */
//     /* Treat me like array.pop() would */
//     PopBack()
//     {
//         /* Your Code Here */
//         let node=this.head;
//         while(node.next)
//         {
//             node=node.next;
//         }
//         let value=node.value;
//         node.next=undefined;
//         return value;
//     }
// };