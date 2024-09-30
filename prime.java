class prime{
public static void main (String args[])
{
int n=5;
int count =0;
for(int i=1;i<=n+1;i++){
if(n%i==0)
{
count = count+1;
}
}
if (count==2)
{
System.out.println("prime");
}
else{
System.out.println("not prime");
}
}}
