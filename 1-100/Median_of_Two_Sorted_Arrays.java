import java.util.Arrays;
class Median_of_Two_Sorted_Arrays {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n = nums1.length, m = nums2.length, k =0;
            int[] mergedArray = new int[n+m];
            for(int i =0;i <n; i++){
                mergedArray[k++] = nums1[i];
            }
            for(int i =0;i <m; i++){
                mergedArray[k++] = nums2[i];
            }
            Arrays.sort(mergedArray);
            int total = mergedArray.length;
            if(total % 2 == 1 ){// this means itis odd
                return mergedArray[total/2];
            }
            else
            {
                int middle1 = mergedArray[total/2];
                int middle2 = mergedArray[total/2-1];
                return ((double)middle1+(double)middle2)/2;
            }
        }
}
