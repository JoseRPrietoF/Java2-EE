<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result:</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%
	Integer distance = (Integer)request.getAttribute("distance");
	Float bike = (Float)request.getAttribute("bike");
	Float foot = (Float)request.getAttribute("foot");
	Float car = (Float)request.getAttribute("car");
	String from = (String)request.getAttribute("from");
	String to = (String)request.getAttribute("to");
	Integer zoom = (Integer)request.getAttribute("zoom");
	Integer centerX = (Integer)request.getAttribute("centerX");
	Integer centerY = (Integer)request.getAttribute("centerY");
	//String iFrame = "<iframe width='625' height='500' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='http://ide.cime.es/visorIDE/Iframe.aspx?wkid=25831&x="+x+"&y="+y+"&zoom=6&srv=http%3A%2F%2Fide.cime.es%2FCache%2FIDEMenorca%2Fbaserefcatxe%2F_alllayers%2CWmsVacio.ashx&capas=%2C0&trans=1%2C0&tit=%2C'></iframe>";

	%>
	<h1>The distance of <%=from %> to <%= to %> is: <%=distance %> Kms </h1>
	<h2>by bike: <%=bike %></h2>
	<h2>By foot: <%=foot %></h2>
	<h2>By car: <%=car %></h2>
	<h2>zoom: <%=zoom %></h2>
	center X : <%=centerX%>
	center Y : <%=centerY%>
	<br/>
	<iframe width='625' height='500' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' src='http://ide.cime.es/visorIDE/Iframe.aspx?wkid=25831&x=<%=centerX %>&y=<%=centerY %>&zoom=<%=zoom %>&srv=http%3A%2F%2Fide.cime.es%2FCache%2FIDEMenorca%2Fbaserefcatxe%2F_alllayers%2CWmsVacio.ashx&capas=%2C0&trans=1%2C0&tit=%2C'></iframe>

</body>
</html>