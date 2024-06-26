public class apples {
            public static String ReplaceCharacter(String str,char ch1,char ch2,int n)
            {
                String res="";
                  if (str==null)
                     return null;

                for( int i=0; i<n; i++)
                {
                    if(str.charAt(i)==ch1)
                       res = res + ch2;
                     else if (str.charAt(i)==ch2)
                        res = res+ ch1;

                    else
                       res= res+ str.charAt(i);   
                }  
                return res;   
            }
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        int n = str.length();
        System.out.println(ReplaceCharacter (str,ch1,ch2,n));
    }
}
