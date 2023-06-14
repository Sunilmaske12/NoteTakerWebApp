package servlet;

import java.io.IOException;
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

public class UpdateNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UpdateNoteServlet() {
        super();
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String  title= request.getParameter("title");
		String content = request.getParameter("content");
		Date date=new Date();
		SessionFactory factory= FactoryProvider.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Note note=session.get(Note.class, id);
		note.setContent(content);
		note.setDate(date);
		note.setTitle(title);
		
		tx.commit();
		session.close();
		
		response.sendRedirect("allNotes.jsp");
	}

}
