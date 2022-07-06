class alpha9
{
public static void main(String args[])
{
int i,j;
for(i=65; i<=71 ; i++)
{
   
for(j=71 ; j>i ;j--)
System.out.print("  ");
 for(int k=65; k<=i; k++)
System.out.print((char)k + " ");
System.out.println();
}
}
}