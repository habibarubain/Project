package genericUtility;

import java.util.Set;

public class WebdriverUtility extends BaseClass {
	public static void switchingWindow(Set<String> allId) {
		for(String id:allId) {
			driver.switchTo().window(id);
		}
	}
	public static void switchingBackWindow(String Id) {
		driver.switchTo().window(Id);
	}
	public static void switchingToFrame(String FrameRef) {
		try {
			driver.switchTo().frame(FrameRef);
		}catch(Exception demo) {
			int index = Integer.parseInt(FrameRef);
			driver.switchTo().frame(index);
		}
	}

}
