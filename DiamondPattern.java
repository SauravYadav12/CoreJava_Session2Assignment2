
class DiamondPattern {
	public static void main(String args[])
{

int n = 3;

int c;
		for(int i=1;i<=n;++i)        // FOR LOOP FOR PRINTING ROWS
		{
		  c = 97;
		  for(int j=i;j<n;++j)        // FOR LOOP FOR PRINTING SPACES
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;++k)      // FOR LOOP FOR PRINTING ALPHABETS   
				{
					System.out.print((char)c);
					c++;
				}
				c-=2;
					for(int l=1;l<i;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN DECREASING ORDER
					{
						System.out.print((char)c);
						--c;
					}
						System.out.println();  // NEW LINE
			}
		for (int i = n-1; i >= 1; i--)
        {
     	c = 97;
            for (int j = n; j > i ; j--)
            {
            	
                System.out.print(" ");
            }
             for(int k=1;k<=i;++k)       
				{
					System.out.print((char) c);
					c++;
				}
				c-=2;
				for(int l=1;l < i;++l)      
					{
						System.out.print((char) c);
						--c;
					}
            System.out.println();
        }

	} // end of main method
} // end of main class
