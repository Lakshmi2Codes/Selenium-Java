package week2.day1;

public class Browser {


	public void launchBrowser(String broswerName) {
		
		System.out.println("Launching browser: " + broswerName);
		
	}
		
	
	public String loadUrl() {
	    return "https://www.google.com";
	}
			

			public static void main(String [] args) {
				
				Browser browser = new Browser();
				
				browser.launchBrowser("Chrome");
				String url = browser.loadUrl();
				
				System.out.println("Loading URL: " + url);
				
			}
			
			
	
	}

