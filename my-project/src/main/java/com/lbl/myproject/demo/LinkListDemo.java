package com.lbl.myproject.demo;

import lombok.Data;
import lombok.ToString;

/**
 * @author: BaoLei Li
 * @date: 2020/7/29
 **/
@Data
public class LinkListDemo {

    private NodeDemo<Integer> head;

    private NodeDemo<Integer> tail;

    private int capacity = Integer.MAX_VALUE;

    private int size;

    @Data
    @ToString
    public static class NodeDemo<T>{

        private NodeDemo prev;

        private NodeDemo next;

        private T value;

        private T key;
    }

    /**
     * 头部增加节点
     * @param list
     * @param value
     * @return
     */
    public NodeDemo<Integer> addFromHead(LinkListDemo list, Integer value){
        NodeDemo<Integer> node = new NodeDemo<>();
        node.setValue(value);
        if (list.getHead() == null){
            list.setHead(node);
            list.setTail(node);
        }else {
            node.setNext(list.getHead());
            list.getHead().setPrev(node);
            list.setHead(node);
        }
        list.setSize(list.getSize() + 1);
        return node;
    }

    /**
     * 尾部添加节点
     * @param list
     * @param value
     * @return
     */
    public NodeDemo<Integer> addFromTail(LinkListDemo list, Integer value){
        NodeDemo<Integer> node = new NodeDemo<>();
        node.setValue(value);
        if (list.getTail() == null){
            list.setHead(node);
            list.setTail(node);
        }else {
            node.setPrev(list.getTail());
            list.getTail().setNext(node);
            list.setTail(node);
        }
        list.setSize(list.getSize() + 1);
        return node;
    }




}
