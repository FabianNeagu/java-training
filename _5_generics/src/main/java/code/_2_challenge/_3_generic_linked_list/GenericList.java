package code._2_challenge._3_generic_linked_list;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> root;

    public GenericList( IGenericNode<T> root1) {
        this.root = new GenericNode<>();
        this.root.setValue(root1.getValue());
        this.root.setNext(root1.getNext());
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> cursor = this.root;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }

        IGenericNode<T> newNode = new GenericNode();
        newNode.setValue(element);
        cursor.setNext(newNode);
    }

    @Override
    public void println() {
        IGenericNode<T> cursor = this.root;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
            System.out.println(cursor.getValue());
        }
    }
}
