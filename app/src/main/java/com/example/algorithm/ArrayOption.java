package com.example.algorithm;

import android.util.Log;

/**
 * Created by zhoqingchun on 2019/11/12.
 * 数组元素插入 删除
 */

public class ArrayOption {

    public static String TAG = "ArrayOption";
    int[] array;
    int size = 0;

    /**
     * @param array 插入数组
     * @param size  数组元素实际个数
     */
    public ArrayOption(int[] array, int size) {
        this.array = array;
        this.size = size;
    }


    /**
     * @param index   插入位置
     * @param element 插入元素
     * @return
     */
    public int[] insert(int index, int element) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("数组越界");
        }

        if (size >= array.length) {
            resize(array.length);
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
        return array;
    }


    public void delete(int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("数组越界");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    public void systemOut() {
        for (int i = 0; i < array.length; i++) {
            Log.e(TAG, "systemOut:   " + i + "    值    " + array[i]);
        }
    }

    /**
     * 数组扩容
     *
     * @param size
     */
    public void resize(int size) {
        int[] newArray = new int[size * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
