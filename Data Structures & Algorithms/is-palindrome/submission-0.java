class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String temp=s;
        char[] ch = s.toCharArray();
        for(int i=0,j=ch.length-1;i<j;i++,j--)
        {
            char tem = ch[i];
            ch[i]=ch[j];
            ch[j]=tem;
        }
        String og = new String(ch);
        if(og.equals(temp))
        {
            return true;
        }
        return false;

        
    }
}
