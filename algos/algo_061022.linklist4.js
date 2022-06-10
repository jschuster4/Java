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

    Iterate()
    {
        let str="";
        for(let node=this.head;node;node=node.next)
        {
            str+=node.value+"->";
        }
        console.log(str);
    }

    PushBack(value)
    {
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
        for(let value of arr) this.PushBack(value);
    }
    
    /* Add all nodes of the supplied list to this list */
    Concat(other_list) {
        let runner = this.head;
        while (runner.next) {
            if (!runner.next.next) {
                runner.next.next = other_list.head;
                return this;
            }
            runner = runner.next;
        }
    }

    /* Finds the node with the smallest value and moves it to the front. */
    MinToFront()
    {
        let runner = this.head;
        if (runner == undefined) {
            return undefined;
        }
        var min_value = runner.value;
        var min_pointer = runner;
        while (runner.next) {
            if (min_value > runner.next.value) {
                min_value = runner.next.value;
                min_pointer = runner.next;
            }
            runner = runner.next;
        }
        runner = this.head;
        while(runner.next){
            if (runner.next == min_pointer){
                var temp = runner.next;
                // runner.next.value = null
                runner.next = runner.next.next;
            }
            else{
                runner = runner.next
            }
        }
        min_pointer.next = this.head
        this.head = min_pointer;
        // this.head = temp;
        // temp.next = runner;
        return this;
    }

    /* Split our list into two lists, where the second list starts with the node */
    /* that has the given value */
    Split(value)
    {
        let runner = this.head;
        if (runner == undefined) {
            return undefined;
        }
        runner = this.head;
        var lis = new List();
        while(runner.next){
            if (runner.next.value == value){
                lis.head = runner.next;
                runner.next = undefined;
            }
            else{
                runner = runner.next
            }
        }
        
        return lis;
    }
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/

/* Creates our list */
let list=new List();
let list2=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([765,234,545,112]);
list2.PushBackN([65,567,433,656]);

list=list.Concat(list2);
list.Iterate();
/*
    Expected:765->234->545->112->65->567->433->656
*/
list.MinToFront();
list.Iterate();
/*
    Expected:65->765->234->545->112->567->433->656
*/
let split_list=list.Split(545);
list.Iterate();
split_list.Iterate();
/*
    Expected:65->765->234->
    Expected:545->112->567->433->656
*/