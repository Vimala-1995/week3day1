package Week3day1assignment;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("We learn java basis as part of java sessions in part week1");
String [] Ssize=str.split(" ");
String Result="";
for( int i=0;i<Ssize.length;i++)
{

for(int j=i+1;j<Ssize.length;j++)
{
if(Ssize[i].equals(Ssize[j]))
		{
	Ssize[j]="Duplicate";
		}
}
}

for(String word:Ssize) {
	if(word!="Duplicate") {
		Result=Result+" "+word;
	}
}
	System.out.println("Word is "+ Result+"");
	
}
}


	


