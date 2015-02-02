 package com.example.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
 @WebService
 public class Function {

	//用main方法发布service
	 public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/Function", new Function());
		System.out.println("Publish Success!");

	}

	//该方法是暴露给其他应用程序调用的方法
	public String transWords(String words){
		String res = "";
		for (char ch : words.toCharArray()){
			res+="\t"+ch+"\t";
		}
		return res;
	}
}

 