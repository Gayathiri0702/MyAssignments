package week3day1;
    
public class FindDuplicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] num = {2,5,7,7,5,9,2,3};
    for (int i = 0;i < num.length - 1; i++) {
    for (int j = 0;j<num.length - i - 1;j++) {
    	
    if (num[j] > num[j+1]){
    int temp = num[j];
    num[j] = num[j + 1];
    num[j + 1] = temp;
    }
    }
    }
    System.out.print("Duplicate values; ");
    for (int i = 0; i < num.length - 1;i++){
    	if (num[i] == num[i + 1]) {
    		System.out.print(num[i] + " ");
    		while (i < num. length - 1 && num[i] == num [i + 1]) {
    			i++;
    		}

    	
    	
    }
    		
    }
    	
    }
    }
    
     
     
     


