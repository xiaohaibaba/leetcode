package com.lhy.sf;

import java.util.Arrays;

public class ArrayList {
    /**
     * 所有的元素
     */
    private int[] elements;

    /**
     * 默认大小
     */
    private static final int DEFAULT_CAPACITY = 10;

    private static final int ELEMENT_NOT_FOUND = -1;
    /**
     * 元素的数量
     */
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capaticy) {
        capaticy = (capaticy < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capaticy;
        this.elements = new int[capaticy];

    }

    /**
     * 清除所有元素
     */
    public void clear() {
        size = 0;
    }

    /**
     * 元素的数量
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素到尾部
     * @param element
     */
    public void add(int element) {
        // 判断容量是否足够
        elements[size++] = element;
    }

    /**
     * 获取index位置的元素
     * @param index
     * @return
     */
    public int get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    public int set(int index, int element) {
        rangeCheck(index);
        int old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    public void add(int index, int element) {
        rangeCheckForAdd(index);
        for (int i = size-1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void rangeCheck(int index) {
        outOfBounds(index);
    }
    private void rangeCheckForAdd(int index) {
        outOfBounds(index);
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);
    }


    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public int remove(int index) {
        rangeCheck(index);
        int old = elements[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elements[i-1] = elements[i];
        }
        size--;
        return old;
    }

    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if(elements[i]==element) return i;
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size=").append(size).append(", [");
        for (int i = 0; i < size; i++) {
            if (i !=0) {
                sb.append(", ");
            }
            sb.append(elements[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
