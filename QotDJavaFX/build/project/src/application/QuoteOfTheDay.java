package application;

import org.json.JSONException;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class QuoteOfTheDay {
	
	HttpResponse<String> response;
	JSONObject jsonObj;
	JSONObject quoteFrom;
	String quote;
	String author;
	
	
	QuoteOfTheDay() throws UnirestException, JSONException
	{
		
		response = Unirest.get("https://rapidapi.p.rapidapi.com/quotes/random/")
			.header("x-rapidapi-host", "quotes15.p.rapidapi.com")
			.header("x-rapidapi-key", "62338f1ad7msh469beaf3100930cp119448jsn0adeaf338c66")
			.asString();

		jsonObj = new JSONObject(response.getBody());
		quote = (String) jsonObj.get("content");
		quoteFrom = jsonObj.getJSONObject("originator");
		author = (String) quoteFrom.get("name");
	}
	
	public String getQuote()
	{
		return quote;
	}
	
	public String getAuthor()
	{
		return author;
	}
}
