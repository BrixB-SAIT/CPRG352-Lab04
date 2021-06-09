package noteserv;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author brixa
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // to store our first and second line from note.txt
        String firstLine = "";
        String secondLine = "";

        // to find where the file is located and store it to variable "path"
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        // store the contents of note.txt to the string variables we created
        firstLine += br.readLine();
        secondLine += br.readLine();

        // to display the text from note.txt
        Note note = new Note(firstLine, secondLine);
        request.setAttribute("note", note);

        // set the edit link to have a function when clicked
        String editLink = request.getParameter("edit");
        if (editLink != null) {
            // direct page to edit.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        // close the reader
        br.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        // to store edits
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        // print the lines from file
        pw.println(title);
        pw.println(contents);
        
        // close the writer
        pw.close();
        
        // to write and display from editnote into viewnote
        Note note = new Note (title, contents);
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }

}
