package Week3day1assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
		list.add(data[i]);
		}	
		Collections.sort(list);
		System.out.println(list);
		int size=list.size();
		System.out.println(list.get(size-2));
		}
		
	}


