package Week3day1assignment;

import java.util.Arrays;
import java.util.Collections;



public class sortingusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companies[] ={"Google","Microsoft","TestLeaf","Maverick"};
		int y=companies.length;
		for(int i=0;i<y-1;i++) {
			for(int j=i+1;j<companies.length;j++) {
				if(companies[i].compareTo(companies[j])>0){
					String MNC=companies[i];
					companies[i]=companies[j];
					companies[j]=MNC;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(companies));
		
	}

}
