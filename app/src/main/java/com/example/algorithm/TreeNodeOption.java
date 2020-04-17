package com.example.algorithm;

import java.util.LinkedList;

public class TreeNodeOption {

    public static TreeNode creatTreeNode(LinkedList  <Integer> linkedList){
        TreeNode node=null;
        if (linkedList==null||linkedList.size()==0){
            return  null;
        }
        //移除并返回linkedlist 的第一个元素
        Integer data =linkedList.removeFirst();
        if (data!=null){
            node=new TreeNode(data);
            node.leftChild=creatTreeNode(linkedList);
            node.rightChild=creatTreeNode(linkedList);
        }
        return  node;
    }

    public static class TreeNode {

        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
