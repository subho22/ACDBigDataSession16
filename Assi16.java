package UDF;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Assi16  extends UDF{
	
	public String evaluate(String str,String arr[])
	{
		String st = null;
		
			for(int i=0;i<arr.length;i++)
			{
			   if(i!=arr.length-1)
				   st+=arr[i]+str;
			   else
				   st+=arr[i];
			   			
			}
			
			return st;		
			
		
	}

}
