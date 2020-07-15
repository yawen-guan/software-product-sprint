package com.google.sps.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cat-name")
public class CatNameServlet extends HttpServlet {
  private List<String> names;

  @Override
  public void init() {
    names = Arrays.asList("Oliver", "Leo", "Milo", "Charlie", "Max", "Jack", "Simba", "Loki", "Oscar", "Jasper",
        "Buddy", "Tiger", "TOBY", "George", "Smokey", "Simon", "Tigger", "Ollie", "Louie", "Felix");
  }

  @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    final String name = names.get((int) Math.round(Math.floor(Math.random() * names.size())));
    response.setContentType("text/html;");
    response.getWriter().println(name);
  }
}
