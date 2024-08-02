package DemoTestNG;


import org.testng.annotations.Test;

public class Customer {
  @Test(priority=1,groups={"regression"})
  public void createcustomer() {
	  System.out.println("create customer");
  }
  @Test(priority=2,groups={"regression"})
  public void editcustomer() {
	  System.out.println("editcustomer");
  }
  @Test(priority=3,groups={"sanity","regression","functional"})
  public void Deletecustomer() {
	  System.out.println("delete customer");  
  }
  @Test(priority=4,groups={"sanity","regression","functional"})
  public void modifycustomer() {
	  System.out.println("modify customer");
  }
}
