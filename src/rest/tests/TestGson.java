package rest.tests;

import rest.model.User;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {
	private Gson gson;
	
	public TestGson(){
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat("dd/MM/yyyy");
		gson= builder.create();
	}
	
	public String objectToJson(Object object){
		return gson.toJson(object);
	}
	
	public User jsonToUser(String jsonString){
		return gson.fromJson(jsonString, User.class);
	}
	
	public static void main(String args[]){
		TestGson test=new TestGson();
		User user=new User();
		user.setMail("mymail@mail.fr");
		user.setName("John");
		String str=test.objectToJson(user);
		System.out.println(str);
		
		String json="{id:5;name:'Jim',dateCreation:'17/03/2015'}";
		User user2=test.jsonToUser(json);
		System.out.println(user2);
	}
}
