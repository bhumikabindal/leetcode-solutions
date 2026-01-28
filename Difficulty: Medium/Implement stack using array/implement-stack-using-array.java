class myStack {
int arr[];
int n;
int top;
    public myStack(int n) {
        // Define Data Structures
        this.n=n;
        arr=new int[n];
        top=-1;
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return (top==-1);
    }

    public boolean isFull() {
        // check if the stack is full
        return top==n-1;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull())return;
        arr[++top]=x;

    }

    public void pop() {
        // Removes an element from the top of the stack
        if(isEmpty()){
            return;
        }
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty())return -1;
        int r=arr[top];
        return r;
    }
}