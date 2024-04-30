<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ include file="connect.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Solutions by Team Manager</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<style type="text/css">
<!--
.style1 {color: #000000}
.style5 {color: #000000}
.style7 {color: #006633}
.style8 {color: #CC0033}
-->
</style>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">A Developer Centered Bug Prediction Model</a></h1>
			
		</div>
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="#">Home</a></li>
			<li><a href="AdminLogin.jsp">Admin</a></li>
			<li><a href="ManagerLogin.jsp">Manager</a></li>
			<li><a href="DeveloperLogin.jsp">Developers</a></li>
			
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
		<div id="content">
			<div class="post">
				<h2 class="title"><a href="#">Solutions based on Team Manager..</a></h2>
				<div class="entry">
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
					
					<table width="650" border="1" align="center"  cellpadding="0" cellspacing="0"  >
               <tr bgcolor="#FFFFFF">
                 <td  width="26" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b>SI NO</b></div></td>
				 <td  width="88" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b> Project Name </b></div></td>
				 <td  width="116" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b>Team Manager </b></div></td>
			     <td  width="116" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b>Defects </b></div></td>
                 <td  width="88" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b>Requested Date </b></div></td>
				 <td  width="83" height="34" valign="baseline" bgcolor="#FFFFFF" style="color: #660033;"><div align="center" class="style4 style6" ><b> </b></div></td>
				 </tr>
         
		 
		   
            <%
					  
					  String prjname=request.getParameter("prjname");
					  
					  String company=(String)application.getAttribute("dcname");
					  String developer= (String)application.getAttribute("dname");
					  	
					  String s0="",s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="";
					  int i=1,j=0,count=0,r=0;
					
						try 
						{
							
						   	String query="select * from defects_tmanager where prjname='"+prjname+"' and (developer='"+developer+"' and company='"+company+"') "; 
						   	Statement st=connection.createStatement();
						   	ResultSet rs=st.executeQuery(query);
					   		while ( rs.next() )
					   		{
								j=rs.getInt(1);
								s0=rs.getString(5);
								s1=rs.getString(4);
								s2=rs.getString(6);
								s3=rs.getString(7);
								
								
								
																
								
								count++;
					%>
            <tr>
              <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style5" >
                    <div align="center">
                    <%out.println(i);%>
                </div>
              </div></td>
			  <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style7" >
                    <div align="center">
                    <b><%out.println(s1);%></b>                </div>
              </div></td>
			  <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style8" >
                    <div align="center">
                   <a href="Developer_ManagerProfile.jsp?type=<%="Developer_ViewTeamManagerSolution"%>&prjname=<%=prjname%>&uname=<%=s0%>" style="color:#CC6600"> <b><%out.println(s0);%></b>  </a>       </div>
              </div></td>
			   
	          <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style5" >
                 	 <%out.println(s2);%> 
              </div></td>
			  <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style5" >
           	    <%out.println(s3);%>              </div></td>	
			  <td height="23"  valign="middle" bgcolor="#FFFFFF">
                  <div align="center" class="style5" >
           	        <a href="Developer_ViewMngrSolution.jsp?prjname=<%=s1%>&id=<%=j%>" style="color:#FF3300"><b>View Solution</b></a> </div></td>	
			  </tr>
            <%
					i=i+1;	
						
						}
						connection.close();
					}
					catch(Exception e)
					{
						out.println(e.getMessage());
					}
					
					if(count==0){out.print("No Project Defects Found");}
					
					%>
        </table>
		
			<p>&nbsp;</p>
		    <div align="right" class="style22"><a href="Developer_ViewSolutions.jsp" class="style11">Back</a></div>
					
					
					
					
					
					
					
				</div>
			</div>
			<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				
				<li>
					<h2>Categories</h2>
					<ul>
						<li><span></span><a href="DeveloperMain.jsp">Home</a></li>		
						<li><span></span><a href="DeveloperLogin.jsp">Logout</a></li>				
					</ul>
				</li>
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>
<div id="footer">
	<p>&nbsp;</p>
</div>
</body>
</html>
