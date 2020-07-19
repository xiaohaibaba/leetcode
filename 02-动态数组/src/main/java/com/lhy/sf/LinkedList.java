package com.lhy.sf;

public class LinkedList<E> extends AbstractList<E> {

    private Node<E> first;

    public void clear() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return indexOf(element) == ELEMENT_NOT_FOUND;
    }

    public E get(int index) {
        return node(index).element;
    }

    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);

        if (index == 0) {
            first = new Node<E>(element, first);
        } else {
            // 获取当前索引位置的前一个node
            Node<E> prev = node(index - 1);
            prev.next = new Node<E>(element,prev.next);
        }

        size++;
    }

    /**
     * 获取 index 对应的node对象
     * @param index
     * @return
     */
    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(E element) {
        return 0;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

}
