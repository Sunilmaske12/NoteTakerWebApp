package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Note;
import com.helper.FactoryProvider;

public class AddNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String  title= request.getParameter("title");
	String content = request.getParameter("content");
	Date date=new Date();
	Note note=new Note(title, content, date);
	
	SessionFactory factory= FactoryProvider.getFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(note);
	tx.commit();
	session.close();
	PrintWriter out=response.getWriter();
	out.println("<div style='text-center'> Note added successfuly");
	out.println("<h2><a href='allNotes.jsp'> View All Notes </a></h2> </div>");
	
	}

}
