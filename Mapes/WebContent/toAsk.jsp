<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ask me for a distance</title>
</head>
<%@ page import="java.util.*" %>
<% ArrayList<String> cities = new ArrayList<String>();
		cities.add("Mao");
		cities.add("Es Castell");cities.add("Ferreries");
		cities.add("Alaior");cities.add("Sant Lluis");
		cities.add("Ciutadella");cities.add("Es Mercadal");cities.add("Es Migjorn");%>
<body>
	<form method="POST" action="Maps">
	<select name='from' size='1'>
		<%for (String city: cities){
			out.print("<br><option value='"+city+"'> " + city + "</option>");
		}%>

	</select> 
	<select name='to' size='1'>
		<%for (String city: cities){
			out.print("<br><option value='"+city+"'> " + city + "</option>");
		}%>

	</select> 
	
		<input type="Submit" value="Send">
	</form>
</body>
</html>