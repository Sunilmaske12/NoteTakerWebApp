package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Note;
import com.helper.FactoryProvider;

public class DeleteNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteNoteServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		SessionFactory factory=FactoryProvider.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Note note=(Note)session.get(Note.class, id);
		session.delete(note);
		tx.commit();
		session.close();
		response.sendRedirect("allNotes.jsp");
	}

}
