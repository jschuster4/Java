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

	/* Insert a node with the given value to the front of the list */
	PushFront(value)
	{
        let OldHead = this.head;
		this.head = new Node(value);
        this.head.next = OldHead;
	}

	/* Remove and return the first node in the list, */
	/* but also set the head to be the next node */
	PopFront()
	{
		let OldHead = this.head;
        this.head = this.head.next;
	}

	/* Calculate and return the average of all the node values in the list. */
	Average()
	{
		var sum = 0; 
        var i = 0;
        let node = this.head
        while(node){
            sum += node.value;
            node = node.next;
            i++;
        }
        return sum/i;
	}
};

let test_data1=123;
let test_data2=234;
let test_data3=345;
let test_data4=456;
let test_data5=567;
let test_data6=678;

/* Create our list */
let list=new List();

/* Inserts a few nodes at the beginning of the list: */
list.PushFront(test_data1);
list.PushFront(test_data2);
list.PushFront(test_data3);

/* Removes and returns the head of list, but updates the list's head */
let old_head=list.PopFront();

/* Inserts a few more nodes at the beginning of the list */
list.PushFront(test_data4);
list.PushFront(test_data5);
list.PushFront(test_data6);

/* Iterates our list, so we can see our node values */
// list.Iterate(value=>console.log(value));

/* Expected Output: */
/*
	678
	567
	456
	234
	123
*/

console.log(list.Average()); /* Expected: 411 */