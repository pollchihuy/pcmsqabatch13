package com.juaracoding.testng;

public class SortAlgorithm {
	StringBuilder sBuild = new StringBuilder();
	
	public String selectionSortASCInt(int[] nums)
    {
        String bef = "";
        String aft = "";
        int initz = 0;
        int container = 0;

        //logic
        for(int i = 0 ; i < nums.length ; i++)
        {
            initz = i;
            //makes efficient , no need loop for the end of process
            if(i!=nums.length-1)
            {
                for (int j = i ; j < nums.length ; j++)
                {
                    if(nums[initz] > nums[j])
                    {
                        initz = j;// INIT PEMBANDING DI OPER DARI INDEX KURSOR KE INDEX ANGKA TERKECIL
                    }
                }
            }
            container = nums[i];
            nums[i] = nums[initz];
            nums[initz] = container;
            
        } //END logic PROCESS
        sBuild.setLength(0);
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        aft = aft.substring(0,aft.length()-1);
        System.out.println(aft + " --> SELECTION SORT");
        
        return aft;
    }//end of the procedure selectionSortASCInt
	
	public String bubbleSortASCInt(int[] nums){
        String bef = "";
        String aft = "";
        int loopNext = 0;
        int container = 0;
        //logic
        for (int i =0 ; i < nums.length ; i++ )
        {
            loopNext = 1;
            for (int j=0 ; j < nums.length-1 ; j++)
            {
                //if the current value is greater than the next value
//                if(nums[j]>nums[loopNext])
            	if(nums[j]>nums[loopNext])
                {
                    //then swap
                    container = nums[j];
                    nums[j]=nums[loopNext];
                    nums[loopNext] = container;
                }
                loopNext++;
            }
        }
        sBuild.setLength(0);
        for (int num:nums)
        {
            aft = sBuild.append(num).append(",").toString();
        }
        aft = aft.substring(0,aft.length()-1);
        System.out.println(aft + " --> BUBBLE SORT");
        return aft;
    }
	
	public boolean testParseToIntActual(String x)
	{
		boolean isExcept = true;
		
		try {
			int b = Integer.parseInt(x);
		}catch(Exception e)
		{
			isExcept = false;
		}
		System.out.println("TEST PARSE TO INT ACTUAL => "+isExcept);
		return isExcept;
	}
	
	public boolean testParseToIntExpect(String x)
	{
//		String excep = "";
		boolean isExcept = true;
		try {
			int b = Integer.parseInt(x);
		}catch(Exception e)
		{
			isExcept = false;
		}
		System.out.println("TEST PARSE TO INT EXPECT => "+isExcept);
		return isExcept;
	}
}