package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class WebFunctions {

	// ======================================================================

	// TYPE
	public void type(Testing test, WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.clear();
				element.sendKeys(value);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(2000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD

//	======================================================================

	// TYPE DYNAMIC
	public void type(Testing test, String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement = webElement.replace("{0}", var1);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		; // By D
		WebElement element = test.driver.findElement(By.xpath(webElement));
		type(test, element, value);

	}// Closing METHOD

//	-------------------------------------------------------------------------------

	// TYPE DYNAMIC-2
	public void type(Testing test, String webElement, String var1, String var2, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement = webElement.replace("{0}", var1);
		webElement = webElement.replace("{1}", var2);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		type(test, element, value);

	}// Closing METHOD

	// ------------------------------------------------------------------------------
	// CLICK ONLY WITH WEBELEMENT PARAMETER
	public void click(Testing test, WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
				element.click();
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				;
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(3000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD

	// ------------------------------------------------------------------------------
//	CLICK DYNAMIC
	public void click(Testing test, String webElement, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement = webElement.replace("{0}", value);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		click(test, element);

	}// Closing METHOD

//	-------------------------------------------------------------------------------

	// CLICK DYNAMIC-2
	public void click(Testing test, String webElement, String value1, String value2) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement = webElement.replace("{0}", value1);
		webElement = webElement.replace("{1}", value2);

		WebElement element = test.driver.findElement(By.xpath(webElement));

		click(test, element);

	}// Closing METHOD

//	======================================================================

	// CLICK AND BLUR
	public void clickAndBlur(Testing test, WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
				test.driver.findElement(By.id("ext-element-1")).click();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(2000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD

//	======================================================================

	// CLICK AND BLUR (JAVASCRIPT)
	public void clickJS(Testing test, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) test.driver;
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				jse.executeScript("arguments[0].click();", element);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				; // D
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(3000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD

	// ------------------------------------------------------------------------------
//		CLICKJS DYNAMIC
	public void clickJS(Testing test, String webElement, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement = webElement.replace("{0}", value);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		clickJS(test, element);

	}// Closing METHOD

//	-------------------------------------------------------------------------------

// CLICK Quote Page Elements using Actions
	public void clickUsingAction(Testing test, WebElement webElement) {
		staticWait(2000);
		String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
				+ "var elementTop = arguments[0].getBoundingClientRect().top;"
				+ "window.scrollBy(0, elementTop-(viewPortHeight/2));";

		((JavascriptExecutor) test.driver).executeScript(scrollElementIntoMiddle, webElement);
		staticWait(2000);
		Actions builder = new Actions(test.driver);
		builder.click(webElement);
		builder.perform();

	}// Closing METHOD

//		-------------------------------------------------------------------------------

// CLICK Quote Page Sliders using Action DYNAMIC-1
	public void clickUsingAction(Testing test, String webElement, String value1) {

		webElement = webElement.replace("{0}", value1);

		WebElement element = test.driver.findElement(By.xpath(webElement));

		clickUsingAction(test, element);

	}// Closing METHOD

//======================================================================
	// CLICK Quote Page Sliders using Action DYNAMIC-2
	public void clickUsingAction(Testing test, String webElement, String value1, String value2) {

		webElement = webElement.replace("{0}", value1);
		webElement = webElement.replace("{1}", value2);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		clickUsingAction(test, element);

	}// Closing METHOD

//	======================================================================

	// SELECT GUIDEWIRE'S DROPDOWN
	public void dropdown(Testing test, WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
//				Select dropdown= new Select(element);
//				dropdown.selectByVisibleText(value);
				try {
					element.click();
				} catch (WebDriverException e) {
					/* Do Nothing */}
				staticWait(3000);
				test.driver.findElement(By.xpath("//option[contains(text(),'" + value + "')]")).click();
				staticWait(1000);
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(2000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD
//	======================================================================
	// SELECT GUIDEWIRE'S DROPDOWN

	public void dropdown(Testing test, WebElement element, WebElement option) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.elementToBeClickable(element));
//					Select dropdown= new Select(element);
//					dropdown.selectByVisibleText(value);
				try {
					element.click();
				} catch (WebDriverException e) {
					/* Do Nothing */}
				staticWait(3000);
				option.click();
				staticWait(1000);
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(2000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD
//		======================================================================

	// SELECT DROPDOWN - DYNAMIC
	public void dropdown(Testing test, String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement = webElement.replace("{0}", var1);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		dropdown(test, element, value);

	}// Closing METHOD

//	-------------------------------------------------------------------------------

	// SELECT DROPDOWN - DYNAMIC-2
	public void dropdown(Testing test, String webElement, String var1, String var2, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;

		webElement = webElement.replace("{0}", var1);
		webElement = webElement.replace("{1}", var2);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		dropdown(test, element, value);

	}// Closing METHOD
		// ======================================================================

	// READ INFO FROM WEB-ELEMENT
	public String readInfo(Testing test, WebElement element) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String x = element.getText();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		;
		Utility.stop(test);
		return x;
	}
//	======================================================================

	// RE-INITIALIZE PAGE ELEMENTS
	public void reInitPageElements(Testing test) {
		test.getLogger().error("Stale Element Exception");
		try {
			Thread.sleep(1000);
		} catch (Exception e2) {
		}
		;
		// test.driver.findElement(By.id("ext-element-1")).click();
		PageFactory.initElements(test.driver, test.getPage());
	}

	// ======================================================================
	public void dropdownMelissaJS(Testing test, WebElement element, String value) {
		Actions action = new Actions(test.driver);
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		done = false;
		attempt = 0;
		while (!done && (attempt <= 3)) {
			try {
				attempt++;
				wait.until(ExpectedConditions.visibilityOf(element));
				element.clear();
				action.click(element).build().perform();
				action.sendKeys(value).build().perform();
				WebElement option = test.driver.findElement(By.xpath("(//li/a/strong)[1]"));
				action.moveToElement(option).click().build().perform();

//				jse.executeScript("arguments[0].value='"+value+"';", element);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				;
//				test.driver.findElement(By.xpath("//li/a/strong")).click();;
				Utility.stop(test);
				done = true;
			} // Closing TRY

			catch (StaleElementReferenceException e) {
				if (attempt <= 3)
					reInitPageElements(test);
				else
					throw e;
			} // Closing CATCH-1

			catch (NoSuchElementException e) {
				if (attempt <= 3) {
					test.getLogger().error("NoSuchElement Exception");
					staticWait(3000);
					Utility.stop(test);
				} else
					throw e;
			} // Closing CATCH-2

			catch (WebDriverException e) {
				if (attempt <= 3) {
					test.getLogger().error("WebDriver Exception");
					staticWait(2000);
				} else
					throw e;
			} // Closing CATCH-3

		} // Closing WHILE
	}// Closing METHOD

	// ======================================================================

	public void dropdownMelissaJS(Testing test, String webElement, String var1, String value) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		webElement = webElement.replace("{0}", var1);
		WebElement element = test.driver.findElement(By.xpath(webElement));

		dropdownMelissaJS(test, element, value);

	}
//	======================================================================

	public void staticWait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// ======================================================================

	public String clickScreenshot(Testing test) {
		WebDriverWait wait = new WebDriverWait(test.driver, 40);
		Boolean done = false;
		int attempt = 0;
		Date date = new Date();

		String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot) test.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot, new File("C:\\IntelliJ\\WorkSpace\\Screenshot\\Screenshot" + fileName));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return fileName;
	}

	// ============================================================================
	public void refresh(Testing test) {
		test.driver.navigate().refresh();
		staticWait(2000);
		try {
			test.driver.switchTo().alert().accept();
		} catch (NoAlertPresentException Ex) {
		}
		staticWait(4000);
		test.getLogger().info("Page Refreshed..");
	}

	// ============================================================================
	public void scrollIntoView(Testing test, WebElement element) {
		JavascriptExecutor jse2 = (JavascriptExecutor) test.driver;
		jse2.executeScript("arguments[0].scrollIntoView()", element);
		test.getLogger().info("Scrolling into view...");
	}

	// ============================================================================
	public String generateGUID(Testing test) {
		UUID uuid = UUID.randomUUID();
        String guid = uuid.toString();
        return guid;
	}
	
	//============================================================================
    // GET DATE AS REQUIRED specifically for LEADS API:

    public String getDate(int offSet) {

        // NO. OF MILLI-SECONDS IN A DAY
        long DAY_IN_MS = 1000 * 60 * 60 * 24;

        // GETTING DATE ACCORDING TO OFFSET
        Date myDate = new Date(System.currentTimeMillis()
                + (offSet * DAY_IN_MS));

        // CHANGING THE FORMAT OF THE DATE
        SimpleDateFormat leadDate = new SimpleDateFormat("yyyy-MM-dd");

        // RETURNING DATE IN STRING
        return leadDate.format(myDate);
    }
}
