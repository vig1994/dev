package runner;

public class Practice {


}
	
//	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://the-internet.herokuapp.com/");
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//	 driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
//	 WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
//	 addElement.click();
//	 WebElement delete = driver.findElement(By.className("added-manually"));
//	 delete.click();
//	 boolean status = true;
//	 try {
//		 status  = delete.isDisplayed(); 
//	 }catch(Exception e) {
//		 System.out.println(e.getMessage());
//	 }
//	 System.out.println(status);
//	 Assert.assertFalse(status);
//	 
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
//     wait.until(ExpectedConditions.visibilityOf(addElement));	 
	 
//	 TakesScreenshot ts = (TakesScreenshot)driver;
//	 File scrFile = ts.getScreenshotAs(OutputType.FILE);
//	 FileUtils.copyFile(scrFile,new File(""));
	 
	 
	 
	 
	 
	 
//	 String a ="Vignesh";
//	 
//	 Map<Character, Integer> map = new HashMap();
//	 for(char x: a.toCharArray()) {
//		 map.put(x, map.getOrDefault(x, 0)+1);
//	 }
//	 
//   for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//	   
//   }
// reverse a string code ->	 
//   int a = 2423;
//   int reversednum = 0 ;
//   
//   while(a%10!=0) {
//	   int lastdigit = a%10;
//	   reversednum = reversednum*10+lastdigit;
//	   a/=10;
//   }
//	 System.out.println(reversednum);
//	 
	 
//	 palaindrome code
//	 String s = "madam";
//	 StringBuffer rev ;
//	  StringBuffer sb = new StringBuffer(s);
//	  rev = sb.reverse();
//	  if(s.contentEquals(rev)) {
//		  System.out.println("is a palindrome");
//	  }else {
//		  System.out.println("Not a palindrome");
//	  }}
