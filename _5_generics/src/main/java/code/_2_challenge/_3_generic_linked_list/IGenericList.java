package code._2_challenge._3_generic_linked_list;

import code._4_student_effort._4_genericc_iterator.IGenericNode;

public interface IGenericList<T> {
    void insert(T element);

    void println();

    IGenericNode<T> getRoot();
}
