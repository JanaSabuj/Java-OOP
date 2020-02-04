    class Stack{
            private int stack[];
            private int top;
            private int size;
    
            Stack(){}
            Stack(int n){
                    stack = new int[n];
                    top = -1;
                    size = n;
            }
    
            void push(int x){
                    if(top == size - 1)
                            System.out.println("Stack Overflow!");
                    else
                        stack[++top] = x;
            }
    
            void  pop(){
                    if(top == -1)
                            System.out.println("Stack Underflow!!");
                    else
                        System.out.println("Popped element is: " + stack[top--]);
            }
    
            void print(){
                    System.out.print("Stack is: ");
                    for(int i = top; i >= 0; i--){
                            System.out.print(stack[i] + " ");
                    }
                    System.out.println("");
            }
    
            public static void main(String args[]){
                    Stack s1 = new Stack(30);
    
                    s1.push(10);
                    s1.push(20);
                    s1.push(30);
                    s1.push(15);
                    s1.push(9);
    
                    s1.print();
    
                    s1.pop();
                    s1.pop();
                    s1.pop();
    
                    s1.print();
            }
    
        }
    
    