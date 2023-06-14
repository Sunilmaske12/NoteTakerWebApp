<!DOCTYPE html>
<html>
	
  <head>
      <title>Edit Noted</title>
         <%@include file="allCssJs.jsp" %>
      
  </head>
  <body>
    <div class="container">
    <%@include file="navbar.jsp" %>
    <h3>Edit note</h3>
    <form method="post" action="UpdateNoteServlet">
    <%int id = Integer.parseInt(request.getParameter("id"));  %>
    <input type="hidden" name="id" value="<%= id%>">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Title</label>
    <input type="text" name="title" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required/>
  </div>
  <div class="mb-3">
  	
    <label for="exampleInputPassword1" class="form-label">Content</label>
    <textarea style="height:200px" name="content" class="form-control" id="content" required ></textarea>
  </div>
  <button type="submit" class="btn btn-primary ">Update Note</button>
</form>
    
    
    </div>
   </body>


</html>