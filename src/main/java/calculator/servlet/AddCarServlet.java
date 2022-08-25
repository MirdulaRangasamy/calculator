package calculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import calculator.entity.Car;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddCarServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double cost = Double.parseDouble(req.getParameter("cost"));
		Car c = new Car(id,name,cost);
		PrintWriter out = resp.getWriter();
		out.println("<h1>"+c+" got added </h1>");
	}
}
