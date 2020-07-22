package com.lhy.sf;

import java.lang.annotation.AnnotationTypeMismatchException;

public class LinkedList<E> extends AbstractList<E> {

    // 头结点
    private Node<E> first;

    // 尾节点
    private Node<E> last;

    public void clear() {
        first = null;
        last = null;
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
        if (index == size) { // 往最后添加
            Node<E> oldLast = last.prev;
            last = new Node<E>(element, last, null);
            if (oldLast == null) {
                first = last;
            }else {
                oldLast.next = last;
            }
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> newNode = new Node<E>(element, prev, next);
            prev.next = newNode;
            if (next != null) {
                next.prev = newNode;
            } else {
                last = newNode;
            }
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
        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }else{
            Node<E> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    public E remove(int index) {
        rangeCheck(index);
        Node<E> old = first;
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prev = node(index - 1).next;
            old = prev.next;
            prev.next = old.next;
        }
        size--;
        return old.element;
    }

    public int indexOf(E element) {
        Node<E> node = first;
        if (element != null) {
            for (int i = 0; i < size; i++) {
                if(node.element==null) return i;
                node = node.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if(element.equals(node.element)) return i;
                node = node.next;
            }
        }

        return ELEMENT_NOT_FOUND;
    }

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size=").append(size).append(", [");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i !=0) {
                sb.append(", ");
            }
            sb.append(node.element);
            node = node.next;
        }

//        while (node.next != null) {
//            node = node.next;
//        }
        sb.append("]");
        return sb.toString();
    }
}
