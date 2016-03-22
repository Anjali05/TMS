import java.util.ArrayList;
import java.util.Iterator;

/*
 * @author Anjali
 */

public class Data 
{
	public static ArrayList<String> empID = new ArrayList<String>();
	public static ArrayList<String> username = new ArrayList<String>();
	public static ArrayList<String> projID = new ArrayList<String>();
	public static ArrayList<String> description = new ArrayList<String>();
	public static ArrayList<String> meetingID = new ArrayList<String>();
	public static ArrayList<String> date = new ArrayList<String>();
	public static ArrayList<String> time = new ArrayList<String>();
	public static ArrayList<String> EmpMeetingDetails = new ArrayList<String>();
	
	
	public static ArrayList<String> getEmpID()
	{
		return empID;
	}
	
	public static ArrayList<String> getMeetingID()
	{
		return meetingID;
	}
	
	public static String addMeetingDetails(String epID, String meetID)
	{
		if (epID=="")
		{
			return "Enter Value";
		}
		int empi= empID.indexOf(epID);
		int mi = meetingID.indexOf(meetID);
		String d= date.get(mi);
		String t= time.get(mi);
		String value="Meeting Id:"+mi+" at "+"t "+"on "+d;
		EmpMeetingDetails.add(empi,value);
		return "Scheduled!";
	}
	
	public static String checkLogin(String usrname, String password)
	{
		Iterator<String> pass = empID.iterator();
		Iterator<String> user = username.iterator();
		 
		 int flag=0;
		 while(user.hasNext()&& pass.hasNext())
	        {
	    	 if(usrname.equals(user.next().toString())&& password.equals(pass.next().toString()))
	    	 {
	    		 flag=1;
	    		 break;
	    	 }
	            
	        }
		 if(flag==1)
		 {
			 return "Success";
		 }
		 else
		 {
			 return "Fail";
		 }
	}
	
	
	public static String addEmp(String empid, String user)
	{
		empID.add(empid);
		username.add(user);
		
		return "Employee added Successsfully";
	}
	
	public static String removeEmp(String empid, String user)
	{
		Iterator<String> itr1 = empID.iterator();
		Iterator<String> itr2 = username.iterator();
		 
		 int flag=0;
		 while(itr1.hasNext()&& itr2.hasNext())
	        {
	    	 if(empid.equals(itr1.next().toString()))
	    	 {
	    		 empID.remove(empid);
	    		 username.remove(itr2.next());
	    		 flag=1;
	    		 break;
	    	 }
	            
	        }
		 if(flag==1)
		 {
			 return "Employee deleted Successsfully";
		 }
		 else
		 {
			 return "Employee not found";
		 }
		
	}
	
	public static String addProj(String projid, String desc)
	{
		projID.add(projid);
		description.add(desc);
		return "Project added successfully";
	}
	
	public static String removeProj(String projid)
	{
		 Iterator<String> itr1 = projID.iterator();
		 Iterator<String> itr2 = description.iterator();
		 
		 int flag=0;
		 while(itr1.hasNext()&& itr2.hasNext())
	        {
	    	 if(projid.equals(itr1.next().toString()))
	    	 {
	    		 projID.remove(projid);
	    		 description.remove(itr2.next());
	    		 flag=1;
	    		 break;
	    	 }
	            
	        }
		 if(flag==1)
		 {
			 return "Project deleted successfully";
		 }
		 else
		 {
			 return "Project not found";
		 }
		
	}
	
	public static String addMeeting(String meetid, String d, String t)
	{
		meetingID.add(meetid);
		date.add(d);
		time.add(t);
	
		return "Meeting added Successsfully";
	}
	
	public static String updateMeeting(String meetid, String d, String t)
	{
		int index=0;
		int flag=0;
		Iterator<String> itr1 = meetingID.iterator();
		
		while(itr1.hasNext())
		{
			if(meetid.equals(itr1.next().toString()))
			{
				flag=1;
				index=meetingID.indexOf(meetid);
				break;
			}
		}
		
		if(flag==0)
		{
			return "Meeting not present";
		}
		
		else
		{
			date.add(index,d);
			time.add(index,t);
			return "Meeting updated successfully";
		}
	}
	
}
