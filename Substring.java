class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        int hLen = haystack.length();

        for(int  i = 0 ; i <= hLen - nLen ; i ++){
            if(haystack.substring(i,i+nLen).equals(needle)){
                return i;
            }
        }
     return -1;

       }
}
