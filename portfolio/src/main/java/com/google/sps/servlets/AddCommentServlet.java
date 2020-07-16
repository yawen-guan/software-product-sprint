package com.google.sps.servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-comment")
public class AddCommentServlet extends HttpServlet {

    @Override
    public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        final String comment_text = getParameter(request, "comment-text", "");
        final String name = getParameter(request, "name", "");
        final String email = getParameter(request, "email", "");
        final long timestamp = System.currentTimeMillis();

        final Entity commentEntity = new Entity("Comment");
        commentEntity.setProperty("comment-text", comment_text);
        commentEntity.setProperty("name", name);
        commentEntity.setProperty("email", email);
        commentEntity.setProperty("timestamp", timestamp);

        final DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(commentEntity);

        response.sendRedirect("/index.html");
    }

    /**
     * @return the request parameter, or the default value if the parameter was not
     *         specified by the client
     */
    private String getParameter(final HttpServletRequest request, final String name, final String defaultValue) {
        final String value = request.getParameter(name);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

}
