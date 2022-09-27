package com.xworkz.jobRegistratiton.servelet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.jobRegistratiton.entity.JobEntity;

@WebServlet(loadOnStartup = 5,urlPatterns = "/click")
public class JobServelet extends HttpServlet {
	
	
List<JobEntity> entity=new ArrayList<JobEntity>();
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phno=req.getParameter("phno");
		String gender=req.getParameter("gender");
		String qualification=req.getParameter("qualification");
		String yop=req.getParameter("yop");
		String university=req.getParameter("university");
		String adress=req.getParameter("address");
		
//		ArrayList skill=new ArrayList();
//		String java = req.getParameter("java");
//		String php = req.getParameter("php");
//		if(java != null || php != null) {
//			skill.add(java);
//			skill.add(php);
//		}
		
		String skill=req.getParameter("skill");
		
		String salary=req.getParameter("salary");
		String experience=req.getParameter("experience");
		String idProof=req.getParameter("idProof");
		
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		
		writer.append("<html>").append("<body>").append("<h1>")
		
		.append("im your web project")
		.append("</br>")
		.append("candidate :").append(name)
		.append("</br>")
		.append("email :").append(email)
		.append("</br>")
		.append("phno :").append(phno)
		.append("</br>")
		.append("gender :").append(gender)
		.append("</br>")
		.append("qualification :").append(qualification)
		.append("</br>")
		.append("yop :").append(yop)
		.append("</br>")
		.append("university :").append(university)
		.append("</br>")
		.append("address :").append(adress)
		.append("</br>")
		.append("skill :").append(skill)
		.append("</br>")
		.append("salary :").append(salary)
		.append("</br>")
		.append("experience :").append(experience)
		.append("</br>")
		.append("IdPoof :").append(idProof)
		.append("</br>")
		.append("</h1>")
		
		.append("</body>").append("</html>");
		
		
	JobEntity jobEntity=new JobEntity(name, email, phno, gender, qualification, yop, university, adress, skill, salary, experience, idProof);
	boolean insert=entity.add(jobEntity);
		
	}
	
	

}
