package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Client {
  @Test(priority=1,groups={"sanity"})
  public void createcustomer() {
	  System.out.println("client customer");
  }
  @Test(priority=2,groups={"sanity"})
  public void edituser() {
	  String act="ABCD";
	  String exp="ABCD";
	  Assert.assertEquals(act, exp);
	  System.out.println("edit client");
  }
  @Test(priority=3,groups={"regression"})
  public void deleteuser() {
	  System.out.println("delete client");
  }
}
