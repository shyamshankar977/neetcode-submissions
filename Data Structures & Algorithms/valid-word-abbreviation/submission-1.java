class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        char[] ch1 = word.toCharArray();
        char[] ch2 = abbr.toCharArray();
        int i=0;
        int j=0;
        for(;i<ch1.length && j<ch2.length;)
        {
            if(Character.isLetter(ch1[i]) && Character.isLetter(ch2[j]))
            {
                if(ch1[i]!=ch2[j])
                {
                    return false;
                }
                else if(ch1[i]==ch2[j])
                {
                    
                    i++;
                    j++;
                }   
            }
            else 
            {
                if(ch2[j]=='0')
                {
                    return false;
                }
                int count=0;
                while(j<ch2.length && Character.isDigit(ch2[j]))
                {
                    count=count*10+(ch2[j]-'0');
                    j++;
                
                }
                i+=count;
            }
        }
        return i==ch1.length && j==ch2.length;
        
        
    }
}