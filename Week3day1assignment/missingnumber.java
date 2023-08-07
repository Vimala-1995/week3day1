package Week3day1assignment;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a[] = {1,2,4,5,6,7,8,10};
//missingNumbers(x);	
HashSet<Integer> Set=new HashSet<Integer>();
for (int sum :a) {
	Set.add(sum);
}

int n=a.length+1;
for(int i=0;i<n;i++) {
	if(!Set.contains(i)){
		System.out.println(i);
	}
}
	}
	
}




	


