

	import java.sql.*;
	import java.util.*;
	public class Prog12
	{
	public static void main(String[] args)
	{
	Connection cn;
	Statement st;
	ResultSet rs;
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	System.out.println("Data Base Connected");
	st = cn.createStatement();
	rs = st.executeQuery("select * from phone");
	Hashtable<String, String> ht = new Hashtable<String, String>();
	System.out.println("Welcome TO Siddhartha Institute of Engg. & Technology");
	System.out.println("Student Phone numbers are");
	while (rs.next())
	{
	ht.put(rs.getString(1), rs.getString(2));
	System.out.println(rs.getString(1) + ":" + rs.getString(2));
	}
	System.out.println(ht);
	rs.close();
	st.close();
	cn.close();
	System.out.println("-----------------------------------------------------");
	System.out.println("Welcome TO Siddhartha Institute of Engg. & Technology");
	System.out.println("Main Menu");
	System.out.println("1.Search by Name");
	System.out.println("2.Search by Mobile"); 
	
	System.out.println("3.Exit");
	String opt = "";
	String name, mobile;
	Scanner s = new Scanner(System.in);
	while (opt != "3")
	{
	System.out.println("-----------------------");
	System.out.println("Enter Your Option 1,2,3");
	opt = s.next();
	switch (opt)
	{
	case "1":
	System.out.println("Enter Name");
	name = s.next();
	if (ht.containsKey(name))
	{
	System.out.println("Mobile is " + ht.get(name));
	} else {
	System.out.println("Not Found");
	}
	break;
	case "2":
	System.out.println("Enter mobile");
	mobile = s.next();
	if (ht.containsValue(mobile))
	{
	for (Map.Entry e : ht.entrySet())
	{
	if (mobile.equals(e.getValue()))
	{
	System.out.println("Name is " + e.getKey());
	}
	}
	} else {
	System.out.println("Not Found");
	}
	break;
	case "3":
	opt = "3";
	System.out.println("Menu Successfully Exited");
	break;
	default:
	System.out.println("Choose Option betwen 1 and Three");
	}
	}
	} catch (Exception ex) {
	System.out.println(ex.getMessage());
	}

	}
	}
