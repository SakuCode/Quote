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
		/*
		Gets the Quote.com quote as a string
		PUT YOUR API KEY IN THE KEY PART
		*/
		response = Unirest.get("https://rapidapi.p.rapidapi.com/quotes/random/")
			.header("x-rapidapi-host", "quotes15.p.rapidapi.com")
			.header("x-rapidapi-key", "YOUR API KEY")
			.asString();

		jsonObj = new JSONObject(response.getBody());
		
		//quote JSON string
		quote = (String) jsonObj.get("content");
		
		//The quotes author
		quoteFrom = jsonObj.getJSONObject("originator");
		author = (String) quoteFrom.get("name");
	}
	
	public String getQuote()
	{
		System.out.print(quote);
		
		return quote;
	}
	
	public String getAuthor()
	{
		System.out.print(author);
		
		return author;
	}
}
