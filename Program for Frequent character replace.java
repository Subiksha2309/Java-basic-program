public class choclates 
{
    private static char ch2;
    public static String FrequentCharacterReplaced(String str, int n, char ch1,char ch2) 
    {
        String res=""; 
        for(int i =0; i<n; i++)
        {
            if(str.charAt(i)==ch2)
              res= res+ch1;

            else 
                  res= res+str.charAt(i);
        }
        return res;

    }

    public static void main(String[] args) 
    {
        String str="bbadbbababb";
        int n = str.length();
        char ch1 = 't';
        char ch2 = 'b';

        System.out.println(FrequentCharacterReplaced(str,n,ch1,ch2));

    }
}    

