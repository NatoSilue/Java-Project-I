//package javaProject;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//import uca.mis3339.OracleWrapper;
//
//public class StoreHTML extends HttpServlet {
//	private static final long serialVersionUID =7L;
//
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		try {
//			List<Order> OnlineOrder = new ArrayList();
//			OracleWrapper.prepareStatement("SELECT orderID, details, subtotal, salesTax, totalPrice FROM Order");
//			ResultSet rs = OracleWrapper.queryDB();
//			while (rs.next()) {
//				//OnlineOrder.add(new Order(Integer.valueOf(String.valueOf( rs.getObject(1))), rs.getString(2),Double.valueOf(String.valueOf( rs.getObject(3))),
//						//Double.valueOf(String.valueOf( rs.getObject(4))), Double.valueOf(String.valueOf( rs.getObject(5)))));
//
//			}//end while
//			out.println("<html><head><title>User Report</title></head><body>");
//			out.println("<table border=\"0\" cellpadding=\"5\">");
//			
//			for (Order eachOne: OnlineOrder) {
//				out.println(eachOne.toHTML());
//			} // end for
//			out.println("</table></body></html>");
//		} catch (SQLException e) 
//		{
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} // end catch
//	} // end doGet
//
//	@Override
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//	} // end doPost
//}//end StoreHTML