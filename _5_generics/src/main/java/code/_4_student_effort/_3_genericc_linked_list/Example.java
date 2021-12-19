package code._4_student_effort._3_genericc_linked_list;

public class Example
{
    public static void main(String[] args)
    {
        IGenericNode<Integer> node=new GenericNode<Integer>();
        node.setValue(1);
        node.setNext(null);
        IGenericList<Integer> list=new GenericList<Integer>(node);
        IGenericNode<Integer> node2=new GenericNode<Integer>();
        node.setValue(2);
      //  node2.setNext(null);
        list.insert(node2);
        list.println();

    }
}
