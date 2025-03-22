
public class LinkedList {
    Node head;
    Node tail;
    int length;
    
    LinkedList(){
        head = null;
        tail = null;
        length =0;
    }
    
    public void append(int value){
        Node newNode = new Node(value);
        if (length ==0){
            head = newNode;
            tail = newNode;
            length++;
        }
        else{
            tail.next =newNode;
            tail = newNode;
            length++;
        }
    }
    public void printAll(){
        
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        
    }
    
    public void remove_last(){
        if (length<2){
            head =null;
            tail =null;
            length = 0;
        }
        else{
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            length--;

        }
    }
    public void prepend(int value){}
    public int remove_first(){}
    public int get(int index){
        
    }
    public void set(int index, int value){}
    public void insert(int index,int value){}
    public void remove(int index){} 
    
}

