class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length, m=nums2.length, k=0;
        int[]merged=new int[n+m];
        for(int i=0;i<n;i++)
        {
            merged[k++]=nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            merged[k++]=nums2[i];
        }
        Arrays.sort(merged);
        int total=merged.length;
        if(total%2==0)
        {
            int m1=merged[total/2-1], m2=merged[total/2];
            return((double)m1+(double)m2)/2.0;
        }
        else
        {
            return (double)merged[total/2];
        }
    }
}