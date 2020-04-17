package com.example.algorithm;

import android.util.Log;

/**
 * description ：二叉堆操作
 * author : 赵青春
 * email : 1458174550@qq.com
 * date : 2020/4/16 22:13
 */
public class BinaryHeapOption {

    /**
     * 构建最小二叉堆
     * @param array
     */
    public static void structrueHeap(int[] array) {
        //从最后一个非子叶节点开始 依次做下沉处理
        for (int i =  (array.length-2)/2; i >=0; i--) {
            downHeap(array,i,array.length);
        }
    }

    /**
     * 下沉处理
     * @param array 构建二叉堆的数组
     * @param parentIndex 父节点下标
     * @param length 数组总长度
     */

    public static void downHeap(int[] array, int parentIndex, int length) {
        // temp存储父节点值
        int temp = array[parentIndex];
        //存储左孩子下标
        int childIndex = parentIndex * 2 + 1;
        //判断左孩子下标是否小于二叉堆总长度
        while (childIndex < length) {
            //判断是否有右孩子 及右孩子是否小于左孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                //条件成立右孩子小于左孩子 将子节点下标加1 取出最小子节点下标
                childIndex++;
            }
            if (temp < array[childIndex])
                //若父节点小于两个子节点中的最小值 则当前二叉堆已是最小二叉堆  返回
                break;
            //父节点大于两个子节点中的最小值 将最小值赋值给父节点 二叉堆下沉基本结束
            array[parentIndex] = array[childIndex];
            //将当前子节点下标赋值给父节点下标
            parentIndex = childIndex;
            //子节点下标重新赋值 指向下一个父节点的左孩子下标
            childIndex = childIndex * 2 + 1;
        }
        //一次二叉堆下沉结束 重新对父节点赋值
        array[parentIndex]=temp;
    }


    /**
     * 上浮处理
     * @param array 上浮调整的二叉堆的数组
     */

    public static void upHeap(int[] array ) {
        // temp存储父节点值
        int childIndex = array.length-1;
        //存储左孩子下标
        int parentIndex = (childIndex - 1)/2;
        int temp=array[childIndex];
        while (childIndex > 0&&array[parentIndex]>temp) {
            //父节点小于两个子节点中的最小值 将最小值赋值给父节点 二叉堆上浮基本结束
            array[childIndex] = array[parentIndex];
            //将当前父节点下标赋值给子节点下标
            childIndex  = parentIndex;
            //父节点下标重新赋值 指向下一个父节点下标
            parentIndex = (parentIndex - 1)/2;
            Log.e("==========","tiaozjheng");
        }
        //一次二叉堆上浮结束 重新对子节点赋值
        array[childIndex]=temp;
    }
}
