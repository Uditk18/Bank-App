package com.app.bank.AppController;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.bank.pojo.BankAccount;
import com.app.bank.pojo.SavingsAccount;
import com.app.bank.service.BankAccountService;

/**
 * Servlet implementation class BankServlet
 */
@WebServlet("*.app")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BankAccountService service = new BankAccountService();
	private BankAccount bank1;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BankServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {

		case "/viewAllSav.app":
			Collection<SavingsAccount> bank = service.showSavings();
			request.setAttribute("bank", bank);
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewAllSav.jsp");
			dispatcher.forward(request, response);

			break;
		case "/withdraw1.app":
			//bank=service.showSavings();
			//int accountNumber=Integer.parseInt(request.getParameter("accno"));
			/*for(SavingsAccount account1: accountNumber)
			{
				if(account1.getAccountNo()==accountNumber)
				{
					double balance=service.withdraw(accountNumber,Double.parseDouble(request.getParameter("amount")));
				}
			}
			BankAccount bank1 = service.withdraw(Integer.parseInt(request.getParameter("accno")),Integer.parseInt(request.getParameter("amount")));
			
			*/
			bank1 = service.withdraw(Integer.parseInt(request.getParameter("accno")), Double.parseDouble(request.getParameter("amount")));
			request.setAttribute("banker", bank1);
			dispatcher = request.getRequestDispatcher("withdraw2.jsp");
			dispatcher.forward(request, response);
			break;
			
		
		/*case "/deposit1.app":
			break;
		case "/deposit2.app":
			break;
		case "/fundTransfer1.app":
			break;
		case "/fundTransfer2.app":
			break;
			*/
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}