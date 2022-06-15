class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        } else if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
}