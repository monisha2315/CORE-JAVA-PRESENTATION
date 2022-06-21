package trainTicket;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrainTicket
{
static void select()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket","root","monisha2315");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from reservation");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

public void delete() {
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket","root","monisha2315"); 
    Statement st=con.createStatement(); 
	st.executeUpdate("delete from reservation where seat number = 45"); 	
	System.out.println("Ticket deleted Successfully.......");
	con.close(); 
	} 
	catch(Exception e)
	{ 
	   System.out.println(e.toString());
	}
	}
public void insert() {
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket","root","monisha2315"); 
	Statement st=con.createStatement(); 
	st.executeUpdate(("insert into reservation values(50,'Yamini',22,'chennai','bangalore','2021-06-25')"));
	System.out.println("inserted Successfuly........");
	con.close();
	} 
	catch(Exception e)
	{ 
		System.out.println(e.toString());
	}
}
public void Update() {
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticket","root","monisha2315"); 
	Statement st=con.createStatement(); 
	st.executeUpdate(("update into reservation values(50,'Yamini chowdary',22,'chennai','bangalore','2021-06-25')"));
	System.out.println("updated Successfuly.......");
	con.close();
	} 
	catch(Exception e)
	{ 
		System.out.println(e.toString());
	}
}
	
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Press");
	System.out.println("1. select");
	System.out.println("2. delete");
    System.out.println("3. insert");
    System.out.println("4. Update");
	int i = sc.nextInt();
	TrainTicket T = new TrainTicket();
	
	switch(i)
	{
	
	case 1:
		T.select();
		break;
		
	case 2:
		T.delete();
		break;
		
	case 3:
		T.insert();
		break;
	case 4:
		T.Update();
		break;
	}
}
}