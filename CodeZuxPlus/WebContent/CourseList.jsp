<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>ICourse Table</title>
<style>
.container1
{
top :11%;;
position : absolute;
margin: 2px;
margin-left: 80%;
height: auto;
width: 100px;

}


</style>




</head>
<body>
<!-- <form action="courseJavaAction" method =  "get">   -->
<div class="container">
  <h2>Courses </h2>        
  <table class="table table-striped table-hover" >
    <thead>
      <tr>
        <th>Course ID</th>
        <th>Name of Course</th>
        <th>Time Line (days)</th>
        <th>points</th>
      </tr>
    </thead>
    <tbody>
	<%  
	int i = 0;
	Connection conn = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/My_Project","root","cool");
		PreparedStatement ps = conn.prepareStatement("select * from courses ");
		ResultSet rs = ps.executeQuery();
		while (rs.next())
		{
			i ++;
			%>
		
      <tr>
        <td><%= rs.getInt(1) %></td>
          <td><%= rs.getString(2) %></td>
          <td><%= rs.getInt(3) %></td>
            <td><%= rs.getInt(4) %></td>
           <!--  <td><button type="submit" class="btn btn-primary">Primary</button></td>   -->
      </tr>
     
		<%
		request.setAttribute("cid", i);
			
		}
	
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	 
	%>
   </tbody>
  </table>
</div>





<div class = "container1">
 <table  >
    <thead>
    
    </thead>
    <tbody>
    <tr><td><a href= "courseJavaAction">java</a></td><td>${cmess}</td></tr><tr></tr>
     <tr><td><a href ="courseCplusplusAction">C ++</a></td></tr>
     
      </tbody>
      </table>

</div>





</body>
</html>