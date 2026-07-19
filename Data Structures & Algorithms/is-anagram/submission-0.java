class Solution {
    public boolean isAnagram(String s, String t) {
        int[] fr = new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<t.length();i++)
        {
            fr[s.charAt(i)-'a']++;
            fr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(fr[i]!=0)
            {
                return false;
            }
        }
        return true;


    }
}
