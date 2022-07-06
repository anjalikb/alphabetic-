 class alpha12
{
  public static void main(String args[])
{      

 for (int i = 65; i <= 71; i++)
        {
            
            for (int j = 71; j > i; j--)
            {
                System.out.print((char)j + " ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }
}