package bubblesort;

public class Space {
public static void main(String args[]) {
	String a="  hello     my name     is vishnu   ";
	System.out.println("input string with spaces included:");
	System.out.println(a);
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)==' ')
			count++;
	}
	//trim used to remove unwanted spaces
	a=a.trim();
	int n=a.length();
	int i=0,j=1,count1=0,k=0;
	char str[]=new char[n];
	char str1[]=new char[n];
	for(i=0;i<n;i++) {
		str[i]=a.charAt(i);
	}
	j=0;
	for(i=0;i<n;i++) {
		if(str[i]!=' ') {
			str1[j]=str[i];
			j=j+1;
		}
		else {
			str1[j]=' ';
			while(str[i]==' ') {
				i++;
			}
			i=i-1;
			j=j+1;
		}
	}
	
	System.out.println("output string after removing unwanted spaces:");
	if(str1[0]==' ') {
		 k=1;
	}
	else {
		k=0;
	}
	for(i=k;i<str1.length;i++) {
	System.out.print(str1[i]);
	}
	System.out.println("");
	for(i=0;i<str1.length;i++) {
		if(str1[i]==' ') {
			count1++;
		}
	}
	System.out.println("the total spaces are:"+count);
	System.out.println("correct number of spaces are:"+count1);
	System.out.println("removed spaces are:"+(count-count1));
}
}
