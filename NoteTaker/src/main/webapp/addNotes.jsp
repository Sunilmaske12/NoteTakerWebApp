<!DOCTYPE html>
<html>
	
  <head>
      <title>Add Noted</title>
         <%@include file="allCssJs.jsp" %>
      
  </head>
  <body>
    <div class="container">
    <%@include file="navbar.jsp" %>
    
    <form method="post" action="AddNoteServlet">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Title</label>
    <input type="text" name="title" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required/>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Content</label>
    <textarea style="height:200px" name="content" class="form-control" id="content" required ></textarea>
  </div>
  <button type="submit" class="btn btn-primary ">Add Note</button>
</form>
    
    
    </div>
   </body>


</html>