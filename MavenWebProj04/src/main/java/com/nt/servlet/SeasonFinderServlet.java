package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 */
@WebServlet("/season")
public class SeasonFinderServlet extends HttpServlet {
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
	   //get PrintWriter
		PrintWriter pw=res.getWriter();	
		//set response content type
		res.setContentType("text/html");
		//get System Date and Time
		LocalDateTime ldt=LocalDateTime.now();
		//get current month value
		int month=ldt.getMonthValue();
		//generate the current season name
		String seasonName=null;
		if(month>=3&&month<=6) {
			seasonName="Summer SEASON";
		}else if(month>=7&&month<=12) {
			seasonName="Rainy SEASON";
		}else {
			seasonName="Winter Season";
		}
		//write the results/output to browser as a response
		pw.println("<h1 style='color:green;text-align:center'>"+seasonName+"</h1>");
		//add home hyperlink
		pw.println("<a href='index.jsp'>home <img src='images/home.jpeg' width='50' height='50'> </a>");
	}

	/**
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
