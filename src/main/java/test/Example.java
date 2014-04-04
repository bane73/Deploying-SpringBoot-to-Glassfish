package test;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	boolean wasConstructorCalled = false;
	static Integer counter = new Integer(0);
	
	public Example() {
		System.out.println( "Constructing Example!");
		System.err.println( "This is a sys-err in the constructor" );
		wasConstructorCalled = true;
	}

	@RequestMapping("/hello")
	String home() {		
		Logger.getAnonymousLogger().severe( "From the logger" );
		counter++;				
		System.out.println( "Example#home() has been called: " + counter );		
		return "Hello world!  (" + counter + ") -- was the constructor called? " + wasConstructorCalled;
	}
	
}
