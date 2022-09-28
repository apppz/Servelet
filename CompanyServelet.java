package com.xworkz.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.company.dto.CompanyDTO;

@WebServlet(loadOnStartup = 5,urlPatterns = {"/switch","/Details"+ ""})
public class CompanyServelet extends HttpServlet {
	
	public CompanyServelet() {
	System.out.println(getClass().getSimpleName());
	}
	
	List<CompanyDTO> dtos=new ArrayList<CompanyDTO>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String companyName=	req.getParameter("companyName");
		String companyFounder=	req.getParameter("founder");
		String since=	req.getParameter("since");
		String employee=req.getParameter("employee");
		String address=req.getParameter("address");
		String business=req.getParameter("business");
		
		System.out.println(companyName+companyFounder+since+employee+address+business);
		
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		
		writer.append("<html>").append("<body>").append("<h1>")
		.append("companyName :").append(companyName)
		.append("</br>")
		.append("companyFounder :").append(companyFounder)
		.append("</br>")
		.append("since :").append(since)
		.append("</br>")
		.append("employee :").append(employee)
		.append("</br>")
		.append("address :").append(address)
		.append("</br>")
		.append("business :").append(business)
		.append("</h1>").append("</body>").append("</html>")
		;
		
		CompanyDTO dto=new CompanyDTO(companyName, companyFounder,since, employee, address, business);
		dtos.add(dto);
	}
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("calling do get method");
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.append("<html>").append("<body>").append("<h1>Display all the details</h1>")
		
		
		.append("<table>");
		
		for(CompanyDTO companyDTO:dtos) {
			writer.append("<tr>")
			.append("<td>")
			.append(companyDTO.getCompanyName())
			.append("</td>")
			
			.append("<td>")
			.append(companyDTO.getCompanyFounder())
			.append("</td>")
			
			.append("<td>")
			.append(companyDTO.getSince())
			.append("</td>")
			
			.append("<td>")
			.append(companyDTO.getEmployee())
			.append("</td>")
			
			.append("<td>")
			.append(companyDTO.getAddress())
			.append("</td>")
			.append("</tr>");	
			
			writer.append("</table>").append("</body>").append("</html>");
		}
	
	}

}
