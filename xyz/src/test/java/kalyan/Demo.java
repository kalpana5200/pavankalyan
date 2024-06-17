package kalyan;

import org.testng.annotations.Test;

public class Demo {
	@Test(dependsOnMethods = "m3()",enabled = false)
	public void m1() {
		System.out.println("from m1()");
	}

	@Test
	public void m2() {
		System.out.println("from m2()");
	}

	@Test()
	public void m3() {
		System.out.println("from m3()");
	}
}
