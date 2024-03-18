package task1;

public class FindingDuplicates {
	public static char[] tochar(String s) {
		char[] c=new char[s.length()];
		for(int i=0;i<c.length;i++) {
           c[i]=s.charAt(i);
		}
		return c;
	}
	public static void frequency(String s) {
		char[] c=tochar(s);
		int[] f=new int[c.length];
		for(int i=0;i<c.length;i++) {
			f[i]=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]!='@'&&c[j]!='@'&&c[i]==c[j]) {
					f[i]++;
					c[j]='@';
				}
					
			}
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]!='@'&&f[i]>1&&c[i]!=' ') {
				System.out.print("Duplicates in the given string are :");
				System.out.println(c[i]+"------->"+f[i]);
			}
		}
	}
	public static void main(String[] args) {
		String s="Epam Systems Pvt Ltd";
		frequency(s);
		
	}




}
