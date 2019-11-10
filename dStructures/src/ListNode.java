class ListNode
{
    String data;
    ListNode nextNode;

    ListNode( String object )
    {
        this( object, null );
    }

    ListNode(String object, ListNode node )
    {
        data = object;
        nextNode = node;
    }


    String getObject()
    {
        return data; // return Object in this node
    }


    ListNode getNext()
    {
        return nextNode; // get next node
    }
} 