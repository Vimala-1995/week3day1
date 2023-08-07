package Week3day1assignment;

import java.util.HashSet;
import java.util.Set;

public class Uniquecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="VimalaParthiban";
		//HashSet hs=new HashSet();
		char ca[]=name.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		for(Character cjj:ca){
			if(set.contains(cjj))
			{
				set.remove(cjj);
			}
			else
			{
			set.add(cjj);
			}
			
			
			
		}
		System.out.println("Print word" +set+"");
		
	}
}