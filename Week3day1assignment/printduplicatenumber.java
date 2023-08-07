package Week3day1assignment;

import java.util.HashSet;
import java.util.Set;

public class printduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> hh=new HashSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			if(!hh.add((data[i]))) {
				System.out.println("output" +data[i]+"");
			}
		}
		
			
	}

}
