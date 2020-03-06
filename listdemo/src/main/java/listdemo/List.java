package listdemo;
import java.util.*;
import java.util.ArrayList; 

class List { 
    public static void main(String[] args) 
    { 
    	Scanner s=new Scanner(System.in);
    	int k=s.nextInt();
    	if(k>10)
    	{
        ArrayList<String> arr = new ArrayList<String>(k); 
        for(int i=0;i<k;i++)
        {
        arr.add(s.next()); 
        }
        System.out.print("Enter the number to be fetched:");
        String n=s.next();
        if(arr.contains(n))
        {
        System.out.println(n+" is present.");
        }
        else
        {
        	 System.out.println(n+" doesnot present.");
        }
        System.out.println("Enter the number to be removed:");
        String m=s.next();
        arr.remove(new String(m));
        System.out.println(arr);
        s.close();
    	}
    	else
    	{
    		System.out.println("Enter the number greater than 10");
    	}
    } 
}