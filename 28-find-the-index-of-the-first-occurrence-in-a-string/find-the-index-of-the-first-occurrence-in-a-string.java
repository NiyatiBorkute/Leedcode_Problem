class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null || needle.length()==0){
            return 0;
        }
        int val=haystack.indexOf(needle);
        return val;
    }
}