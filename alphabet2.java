class alphabet2
{
public static void main(String args[])
{
int i,j;
for(i=65 ;i<=70 ;i++)
{
for(j=i;j<=70;j++)
 System.out.print((char)j+ " ");
{
 for(int k=70-1 ;k>=i ;k--)
  System.out.print((char)k+ " ");
 
 System.out.println();
 }
}

}
}

/*

A B C D E F E D C B A
B C D E F E D C B
C D E F E D C
D E F E D
E F E
F

*/