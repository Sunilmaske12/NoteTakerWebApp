<!DOCTYPE html>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.entity.Note"%>
<%@page import="java.util.List"%>
<html>

<head>
<title>All Notes</title>
<%@page import="org.hibernate.Session ,org.hibernate.SessionFactory, com.helper.FactoryProvider" %>
<%@include file="allCssJs.jsp"%>
</head>
<body>
	<div class="container text-center ">
		<%@include file="navbar.jsp"%>
		
		<%
				SessionFactory factory= FactoryProvider.getFactory();
				Session s=factory.openSession();
		
				Query q=s.createQuery(" from NoteTaker", Note.class);
				List<Note> list=q.list();
				for(Note allNote:list){
				%>
			
		<div class="card p-2 m-2" style="width: 65rem; ">
		
			<img style=" max-height: 150px; width:100px;" src="icons/notepad.png" class="card-img-top m-4 p-2" alt="notes">
			<div class="card-body">
				
				<h5 class="card-title"><%=allNote.getTitle() %></h5>
				<p class="card-text"><%=allNote.getContent() %></p>
				<a href="edit.jsp?id=<%=allNote.getId() %>" class="btn btn-success">Update</a> 
				<a href="DeleteNoteServlet?id=<%=allNote.getId() %>" class="btn btn-danger">Delete</a>
				
			
			</div>
		</div>
		<%}
				s.close();
				
				%>

	</div>



</body>


</html>