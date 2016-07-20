import java.util.*;
class String{
public static void main(String[] args){
String a="hai how are you";
int len=0;
String[] b=a.split("");
int c=b.length;
for(int i=0;i<c;i++)
{
char[] d=a[i].toCharArray();
int e=d.length;
for(int j=0;j<e;j++)
{
if(d[j]==a[i+1])
{

++len;
}
}
}