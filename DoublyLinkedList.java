public class DoublyLinkedList {
       //Data - Fields
       Node head;
       Node tail;


       //Actions - Methods
   
       //Add First (new node at begining)
       public void AddFirst(int someValue) // O(1)
       {
           //create new node
           Node newNode = new Node(someValue);
   
           if(IsEmpty())
           {
                head = newNode;
                tail = newNode;
           }
           else
           {
                //link new node to head and tail node(beggining)
                newNode.next = head;

                //link the current node to the new node
                head.previous = newNode;

                //move head to point to new node
                head = newNode;


           }
       } 
   
       //AddLast
       public void AddLast(int someValue) // O(1)
       {
           if(IsEmpty())
           {
               AddFirst(someValue);
           }
           else
           {
           //create new node
           Node newNode = new Node(someValue);
   
            //link new node with previous node
            newNode.previous = tail;

            //link new node with prevoius node
            tail.next = newNode;

            //assign tail to newNode
            tail = newNode;
            }
            System.out.println();
        }
   
   
       //deletes...
       public void deleteFirst() throws Exception // O(1)
       {
           if(IsEmpty())
           {
               throw new Exception("You cannot delete from an empty list");
           }
           else if(head.next == null) // only have one node
           {
                head = null;
                tail = null;
           }
           else //we have at least two nodes
           {
                // move the head
                head = head.next;
           }
           System.out.println();
       }
       
       public void deleteLast() throws Exception // O(n)
       {
           if(IsEmpty())
           {
               throw new Exception("You cannot delete from an empty list");
           } 
           else if(head.next == null) //we only have one node in list
           {
               deleteFirst();
           }
           else //we have two nodes
           {
            tail.previous.next = null;
            tail = tail.previous;
           }
           System.out.println();
       }
   
        public void deleteValue(int someValue) throws Exception
        {
            if(IsEmpty())
            {
                throw new Exception("You cannot delete from an emptylist");
            }
            else
            {
                Node finger = head;
                while(finger != null) //traverse the list
                {
                    if(finger.value == someValue)
                    {
                        //if value is head
                        if(finger == head)
                        {
                            deleteFirst();
                            System.out.println();                              
                        }
                        //if value is tail
                        if (finger == tail) 
                        {
                            deleteLast();  
                            System.out.println();                          
                        } 
                        //if value is in the middle
                        else 
                        {
                            finger.previous.next = finger.next;
                            finger.next.previous = finger.previous;
                        }
                    finger = finger.next;
                    }
                }  
                throw new Exception("Value not found!");       
            }                               
        }



       //IsEmpty
       public boolean IsEmpty() // O(1)
       {
           // if(head == null)
           // {
           //     return true;
           // }
           // else
           // {
           //     return false;
           // }
           return head == null;
       }

       
   
       public void Clear() // O(1)
       {
           head = null;
           tail = null;
   
       }

       //Print - traversal
       public void Print() // O(n)
       {
           if(IsEmpty())
           {
               System.out.println("List is empty");
           }
           else
           {
           //start at head.
           Node finger = head;
   
           //Then repeat the following. Keep repeating until not null. 
           while (finger != null) 
           {
               //display value.
               System.out.print(finger.value + " <-> ");
   
               //move to next node.
               finger = finger.next;
           }   
           }
       }
   
       //Init Values / ctor(s)

}


