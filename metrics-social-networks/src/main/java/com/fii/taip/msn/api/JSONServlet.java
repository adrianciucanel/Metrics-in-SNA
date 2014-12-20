package com.fii.taip.msn.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 



import com.fii.taip.msn.extapi.*;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.restfb.types.Thread;

public class JSONServlet extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
 
    /***************************************************
     * URL: /jsonservlet
     * doPost(): receives JSON data, parse it, map it and send back as JSON
     ****************************************************/
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
 
        // 1. get received JSON data from request
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String accessToken = "";
        if(br != null){
        	accessToken = br.readLine();
        }
        
      //  FacebookConnector fc =new FacebookConnector();
        
     //  User currentUser= fc.GetUserDetails(accessToken);
     //  String userDetail = currentUser.getId() +"-"+currentUser.getUsername();
       writeInFile("users.txt",accessToken);
        
    
 
      
    }
    
    private void writeInFile(String fileName, String content){
    	try {
 
			File file = new File(fileName);
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}

