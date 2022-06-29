package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StackDataBase 
{
	public void display(int choice,int size,int language) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/botchat", "root", "12345");
		if(size==0)
		{
			System.out.println("Please select the Language: ");
			System.out.println("1.English");
			System.out.println("2.Telugu");
			System.out.println("3.Hindi");
		}
		if(size==1)
		{
			Statement st=con.createStatement();
			if(choice==1)
			{
				ResultSet rs=st.executeQuery("select * from level1 where id="+choice);
				rs.next();
				System.out.println("1."+rs.getString(2));
				System.out.println("2."+rs.getString(3));
				System.out.println("3."+rs.getString(4));
			}
			if(choice==2)
			{
				ResultSet rs=st.executeQuery("select * from level1 where id="+choice);
				rs.next();
				System.out.println("1."+rs.getString(2));
				System.out.println("2."+rs.getString(3));
				System.out.println("3."+rs.getString(4));
			}
			if(choice==3)
			{
				ResultSet rs=st.executeQuery("select * from level1 where id="+choice);
				rs.next();
				System.out.println("1."+rs.getString(2));
				System.out.println("2."+rs.getString(3));
				System.out.println("3."+rs.getString(4));
			}
		}
		if(size==2)
		{
			Statement st = con.createStatement();
            if(choice ==1){
            	ResultSet rs = st.executeQuery("select * from rechargetable where id= "+language);
                rs.next();
                System.out.println("1." +rs.getString(2));
                System.out.println("2." +rs.getString(3));    
            }
            if(choice==2)
            {
            	ResultSet rs=st.executeQuery("select * from callertune");
            	rs.next();
            	System.out.println("1."+rs.getString(2));
            	System.out.println("2."+rs.getString(3));
            	System.out.println("3."+rs.getString(4));
            }
            if(choice==3)
            {
            	ResultSet rs=st.executeQuery("select * from newoffers ");
            	rs.next();
            	System.out.println("1."+rs.getString(2));
            	System.out.println("2."+rs.getString(3));
            	System.out.println("3."+rs.getString(4));
            	System.out.println("4."+rs.getString(5));
            }
		}
		
	}
}
