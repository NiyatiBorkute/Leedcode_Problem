class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []temp=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                k++;
                i++;
            }else{
            temp[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            temp[k]=nums1[i];
                k++;
                i++;
        }
        while(j<nums2.length){
            temp[k]=nums2[j];
                k++;
                j++;
        }
        int n=temp.length;
        if(n%2==1){
            return temp[n/2];
        }else{
            return (temp[n/2]+temp[(n/2)-1])/2.0;
        }
    
    }
}