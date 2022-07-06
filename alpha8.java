class alpha8
{
public static void main(String args[])
{
int i,j;
for(i=65; i<=71 ; i++)
{
   
for(j=65 ; j<=i ;j++)
System.out.print((char)j + "");
 for(int k=i-1; k>=65; k--)
System.out.print((char)k + "");
System.out.println();
}
}
}