package visa;

public class Solution2 {

	public static void main(String[] args) {
		
		int arr[]= new int[]{1,0,1,0,0,0,0,1};
		
		int swapLeft = 0, count = 0, swapRight = 0;
		int swapLeft2=0,count2 = 0;
		for(int i = 0; i < arr.length ; i++){
		    if(arr[i] == 1)
		    {
		    	swapLeft += count;
		    	count2++; // check this
		    }
		    else
		    {
		        count++;
		    	swapLeft2 += count2; // check this
		    }
		}
		/*count = 0;
		for(int i = arr.length -1 ; i >= 0 ; i--){
		    if(arr[i]==1){
		        swapRight += count;
		    }else{
		        count++;
		    }
		}
		System.out.println("Swap Left " + swapLeft);
		System.out.println("Swap Right " + swapRight);
		System.out.println( swapLeft < swapRight ? swapLeft : swapRight);*/
		
		System.out.println(swapLeft < swapLeft2 ? swapLeft : swapLeft2);

	}

}


/*
int swapLeft = 0, count = 0, swapRight = 0;
for(int i = 0; i < avg.length ; i++){
    if(avg[i] == 1)
        swapLeft += count;
    else
        count++;
}
count = 0;
for(int i = avg.length -1 ; i >= 0 ; i--){
    if(avg[i]==1){
        swapRight += count;
    }else{
        count++;
    }
}
return swapLeft < swapRight ? swapLeft : swapRight;*/