<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.shopdirect.SDGHealthCheckDemo.persistence.models.Server,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head> 
  	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ShopDirect</title>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart); 

      function drawChart() {
    	  
    	  //var serverlist = "${servers}";
    	  //alert(serverlist[0].name);
    	  
        var data = google.visualization.arrayToDataTable([
          ['Production Server', 'Total Space', 'Used space', 'Free space']
          <% 
          List<Server> servers = (List<Server>)request.getAttribute("servers");
          for (int i = 0; i < servers.size(); i++) {
        	  Server server = servers.get(i);
        	  String name = server.getName();
        	  //System.out.println("name="+name);
        	  int usedSpace = server.getUsedSpace();
        	  int totalSpace = server.getTotalSpace();
        	  int freeSpace = totalSpace-usedSpace;
        	  
		%>
		 ,["<%=name%>", Number('<%=totalSpace%>'), Number('<%=usedSpace%>'), Number('<%=freeSpace%>')]
		 
		<% } %>
		
        ]);
        
        var options = {
          chart: {
            title: 'Database Performance',
            subtitle: '',
          },
	        bars: 'vertical',
	        vAxis: {format: 'GB'},
	        height: 400,
	        colors: ['#1b9e77', '#d95f02', '#7570b3']
        };

        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
  </head>
  <body>
	  <nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">SHOP DIRECT</a>
		    </div>
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="<c:url value="/freespace"/> ">Home</a></li>
		      <li><a href="#">BRANDS</a></li>
		      <li><a href="#">CAREERS</a></li>
		      <li><a href="#">CONTACT US</a></li>
		      <li><a href="<c:url value="/about"/> "> ABOUT</a></li>
		    </ul>
		  </div>
		</nav>
    <div id="columnchart_material" style="width: 800px; height: 500px;"></div>
  </body>
</html>
