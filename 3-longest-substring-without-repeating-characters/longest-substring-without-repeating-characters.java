class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || s.length() == 0) {
            return 0;   
        }
        int max=0;
        for (int i=0;i<s.length();i++){
            int count=0;
            String temp="";
            for (int j=i;j<s.length();j++){
                if(temp.indexOf(s.charAt(j))!=-1){
                    break;
                }

                temp += s.charAt(j);
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
        
    }
}