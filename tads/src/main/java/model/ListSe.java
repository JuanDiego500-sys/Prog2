package model;


import lombok.Data;


@Data
//There we are going to have all the methods that we want to create to fill the beginning and end of lse
public class ListSe {

    private Node head;
//definition of the variables--------------------------------------------------------------------

    /*
    algorithm to add a new kid into the beginning
    so , I have to know that I need to receive a kid and with that kid im going to fill the node
    so my parameters ´ll the kids
    1)I have to know if the list is full or empty
    2)if the list is empty, I have to fill the list with a new kid. and that´s all.
    3)but , if the list is full , I have to ask the head and then , traverse all the list with the creation of an
    assistant
    4)I´ll traverse all the array with a while
    5) and fifth I´ll use the assistant node to add the new node and kid in the final position.

     */
    public void add(Kid kid) {//method to fill the lst in the end----------------------------------
        if (head != null) {
            Node temp = head;
            while (temp.getNext() != null) {//while to traverse all the array with the assistant
                temp = temp.getNext();
            }
            //now, in the last
            Node newNode = new Node(kid);
            temp.setNext(newNode);//in this , I´ll put the kid in the new node
        } else {
            head = new Node(kid);
        }

    }//end of the add of the kid-----------------------------------------------------------

    /*
    to add to start
    1)I have to know if the head is full or empty
    2)if the head is full , I have to create the new node , put in the kid and add that kid in the first space
    3)change the name of the newNode to head
    4)if the head is empty, add a new node and add the new kid to put it into the space and change the name to head
     */
    public void addToStart(Kid kid) {
        if (head != null) {//if the head is full
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        } else {
            head = new Node(kid);//the difference when the head is full and empty
        }
    }//end of the addtostart------------------------------------------------------------

    /*
        the method to add a kid into a specific position:
        1)ask the position
        2)do the for to traverse into the list and search the position of the other kid
        3)When it finds the pos , add the kid in that space.
         */
    //method to add a new node and kid in the pos that the user says---------------------
    public void addInPos(Kid kid, int pos) {
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        Node newNode = new Node(kid);
        temp.setNext(newNode);
    }
    //method to delete a kid receiving his id
    public void deleteKid(String id){
        Node temp = head;
        while (!temp.getNext().getData().getId().equals(id)){
            temp= temp.getNext();
        }
        temp.getNext().setData(null);
    }


}//end of list se---------------------------------------------------------------------------------
