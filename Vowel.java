class Vowel{
public static void main(String[] args){
String a="Engine42erin#%g";
int vcount=0,ccount=0,scount=0,ncount=0;
for(int i=0;i<a.length;i++){
char ch=a.charAt(i);
if(ch>='a'&&ch<='z'){
if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O')){
vcount++;
}
}
else{
ccount++;
}
else if(ch>='0'&& ch<='9'){
ncount++;
}
else if(ch!=" "){
scount++
}
}
System.out.println("Vowels Count"+vcount); 
System.out.println("Consonants Count"+ccount); 
System.out.println("Numbers Count"+ncount); 
System.out.println("Special chracters Count"+scount);
}
}
