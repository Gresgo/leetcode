class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String src = strs[0];
        String realPrefix = "";
        for (int i = 0; i <= src.length(); i++) {
            String prefix = src.substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) return realPrefix;
            }
            realPrefix = prefix;
        }
        return realPrefix;
    }
}