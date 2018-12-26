package com.exer.sort;

/**
 * 插入排序
 *
 * 原理 ： 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * 描述 ： 从第一个元素开始，该元素可以认为已经被排序；
 *          取出下一个元素，在已经排序的元素序列中从后向前扫描；
 *          如果该元素（已排序）大于新元素，将该元素移到下一位置；
 *          重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 *          将新元素插入到该位置后；
 *          重复步骤2~5。
 */
public class InsertionSort {

    public static void main(String[] args) {
        int preIndex, current;
        for (int i = 1; i < SortArr.arr.length; i++) {
            preIndex = i - 1;
            current = SortArr.arr[i];
            for (; preIndex >= 0 && SortArr.arr[preIndex] > current; preIndex--) {
                SortArr.arr[preIndex + 1] = SortArr.arr[preIndex];
            }
            SortArr.arr[preIndex + 1] = current;
        }
//        System.out.println(Arrays.toString(SortArr.arr));
    }
}
