import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.io.*;
import java.util.Random;
import java.util.Set;
public class trendyolnewyok {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Downloads/chromedriveraaa");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
        chromeOptions.addArguments("disable-infobars"); // disabling infobars
        chromeOptions.addArguments("--disable-extensions"); // disabling extensions
        int i;
        for (i = 1; i < 2578680; ) {
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            try {
                System.out.println(i);
                i++;
                driver.get("https://tempmail.plus/en/#!");
                //ilk penceremi kaydettim
                String firstWinUrl = driver.getCurrentUrl();
                System.out.println("Başlangıç pencerem :   " + firstWinUrl);
                Thread.sleep(5000);
                WebElement refsayisi = driver.findElement(By.xpath("//*[@id=\"pre_copy\"]"));
                refsayisi.click();
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Clipboard clipboard = toolkit.getSystemClipboard();
                String copyFromClipboard= (String) clipboard.getData(DataFlavor.stringFlavor);
                System.out.println(copyFromClipboard);
                String a = "window.open('about:blank','_blank');";
                ((JavascriptExecutor) driver).executeScript(a);
                Thread.sleep(1213);
                //        Pencere değişimi için set kullandım.
                Set<String> windowAllWindows = driver.getWindowHandles();

                for (String window : windowAllWindows) {
//                                      windowun parantez içine sıradaki pencereyi yazdım..
                    driver.switchTo().window(window);
                }
                driver.get("https://www.trendyol.com/uyelik");
                Thread.sleep(1300);
                String firstWin = driver.getWindowHandle();
                Thread.sleep(5000);
                WebElement btn212111 = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
                btn212111.click();
               /*     driver.get("https://www.trendyol.com/moda-degirmeni/siyah-cilt-kadin-bot-md1011-116-0001-p-48491307?boutiqueId=580617&merchantId=142292&filterOverPriceListings=false");
                    Thread.sleep(1300);
                    String firstWin = driver.getWindowHandle();
                    WebElement btn212111 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[5]/div/div/div[1]/button")));
                    btn212111.click();
*/                  Thread.sleep(5000);
                WebElement btn2111 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[2]/div/button[2]"));
                btn2111.click();
                WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"register-email\"]"));
                btn1.sendKeys(copyFromClipboard);
                String password = new Random().ints(10, 33, 122).collect(StringBuilder::new,
                                StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
                Random rand = new Random();
                int rand_int1 = rand.nextInt(1000);
                WebElement btn13 = driver.findElement(By.xpath("//*[@id=\"register-password-input\"]"));
                btn13.sendKeys(password + rand_int1);
                Thread.sleep(5000);
                WebElement btn21113 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[3]/div/button[1]"));
                btn21113.click();
                Thread.sleep(500);
                WebElement btn211135 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[5]/div/div[1]/div"));
                btn211135.click();
                Thread.sleep(500);
                WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[6]/div/div[1]/div"));
                btn3.click();
                Thread.sleep(500);
                WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button"));
                btn4.click();
                Thread.sleep(1000);
                System.out.println("2. pencerenin Url'i =  " + driver.getCurrentUrl());
                String b = "window.open('about:blank','_blank');";
                ((JavascriptExecutor) driver).executeScript(b);
                Thread.sleep(1213);
                Set<String> windowAllWindowsa = driver.getWindowHandles();

                for (String windowa : windowAllWindowsa) {
//                                      windowun parantez içine sıradaki pencereyi yazdım..
                    driver.switchTo().window(windowa);
                }
                Thread.sleep(25000);
                driver.get("https://tempmail.plus/en/#!");
                Thread.sleep(10000);
                WebElement refsayisis = driver.findElement(By.xpath("//*[@id=\"container-body\"]/div[1]/div[2]/div[2]/div/div[3]/span"));
                refsayisis.getText();
                System.out.println(refsayisis);
                String textTelephone=refsayisis.getText();
                System.out.println(textTelephone);
                String sal = textTelephone.substring(39,45);
                System.out.println(sal);
                driver.close();
                driver.switchTo().window(firstWin);
                Thread.sleep(5000);
                WebElement btn6 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input"));
                btn6.click();
                System.out.println(i);
                Thread.sleep(5000);
                WebElement btn1a = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[2]/input"));
                btn1a.sendKeys(sal);
                Thread.sleep(5000);
                System.out.println("Şuanki sayfanın Url ' i =   " + driver.getCurrentUrl());
                WebElement btn7 = driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/div/div/div/div[2]/form/div[3]/button[1]"));
                btn7.click();
                Thread.sleep(5000);


                try{
                    System.out.println("1");
                    driver.get("https://www.trendyol.com/jaxet/unisex-siyah-los-angeles-baskili-oversize-sweatshirt-p-376698120?boutiqueId=61&merchantId=656143&utm_source=share");
                    Thread.sleep(5000);
                    WebElement btn9avqqve = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqqve.click();
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("HATA!1");
                }

                try{
                    System.out.println("2");
                    driver.get("https://www.trendyol.com/jaxet/unisex-gri-new-york-199x-baskili-oversize-sweatshirt-p-376604609");
                    Thread.sleep(5000);
                    WebElement btn9avq = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avq.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!2");
                }
                try{
                    System.out.println("3");
                    driver.get("https://www.trendyol.com/jaxet/unisex-gri-california-west-baskili-oversize-sweatshirt-p-376598667");
                    Thread.sleep(5000);
                    WebElement btn9avqw = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqw.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!3");
                }
                try{
                    System.out.println("4");
                    driver.get("https://www.trendyol.com/jaxet/unisex-gri-michigan-middle-baskili-oversize-sweatshirt-p-376600782");
                    Thread.sleep(5000);
                    WebElement btn9avqwc = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwc.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!4");
                }
                try{
                    System.out.println("5");
                    driver.get("https://www.trendyol.com/jaxet/unisex-siyah-minimal-penguen-baskili-oversize-sweatshirt-p-376607006");
                    Thread.sleep(5000);
                    WebElement btn9avqwce = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwce.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!5");
                }
                try{
                    System.out.println("6");
                    driver.get("https://www.trendyol.com/moda-degirmeni/siyah-cilt-kadin-bot-md1001-116-0002-p-49132354?boutiqueId=616156&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwcee = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[7]/div/div/div[1]/button"));
                    btn9avqwcee.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!6");
                }
                try{
                    System.out.println("7");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-bot-md1011-116-0001-p-52697241?boutiqueId=617512&merchantId=142292&filterOverPriceListings=false&sav=true");
                    Thread.sleep(5000);
                    WebElement btn9avqwcer = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwcer.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!7");
                }

                try{
                    System.out.println("8");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-cizme-md1010-117-0002-p-54614502?boutiqueId=617335&merchantId=142292&filterOverPriceListings=false&sav=true");
                    Thread.sleep(5000);
                    WebElement btn9avqwceu = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceu.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!8");
                }
                try{
                    System.out.println("9");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tasli-topuklu-ayakkabi-p-230270459?boutiqueId=616286&merchantId=142292&filterOverPriceListings=false&sav=true");
                    Thread.sleep(5000);
                    WebElement btn9avqwceb = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwceb.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!9");
                }

                try{
                    System.out.println("10");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-siyah-cilt-bot-md1001-116-0001-p-47646430?boutiqueId=615772&merchantId=142292&filterOverPriceListings=false&sav=true");
                    Thread.sleep(5000);
                    WebElement btn9avqwce6 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwce6.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!10");
                }
                try{
                    System.out.println("11");
                    driver.get("https://www.trendyol.com/moda-degirmeni/siyah-cilt-kadin-bot-md1025-116-0001-p-49132209");
                    Thread.sleep(5000);
                    WebElement btn9avqwce9 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwce9.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!11");
                }
                try{
                    System.out.println("15");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-siyah-bot-md1013-116-0001-p-148383920?boutiqueId=613729&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwcem = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwcem.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("16");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-bot-md1025-116-0006-p-150191032?boutiqueId=611481&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwcez = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwcez.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("17");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-bot-md1013-116-0001-p-143674166?boutiqueId=611481&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwceqw = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwceqw.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("18");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tokali-gunluk-ayakkabi-md1103-111-0001-p-345886494");
                    Thread.sleep(5000);
                    WebElement btn9avqwceqr = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceqr.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }


                try{
                    System.out.println("21");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tasli-bot-md1092-116-0001-p-150845444");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq1 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq1.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("22");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-bot-md1101-116-0002-p-184263000");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq2 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq2.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("23");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tuylu-bot-md1103-116-0001-p-176476224?boutiqueId=61&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq3 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq3.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("24");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-dallas-cizme-md1012-117-0002-p-150176564");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq4 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq4.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("26");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-cizme-md1016-117-0001-p-47634465");
                    Thread.sleep(5000);
                    WebElement btn9avqwcew1 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btn9avqwcew1.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("27");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-kisa-bot-md1095-116-0002-p-349193679");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq43 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq43.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("28");
                    driver.get("https://www.trendyol.com/pd/moda-degirmeni/kadin-tokali-bot-md1080-116-0003-p-347914875?boutiqueId=61&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwceq7 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwceq7.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("29");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-kisa-bot-md1091-116-0005-p-347813342");
                    Thread.sleep(5000);
                    WebElement btn9avqwcev1 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwcev1.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("30");
                    driver.get("https://www.trendyol.com/pd/moda-degirmeni/kadin-tokali-bot-md1080-116-0003-p-354159254?boutiqueId=613675&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btn9avqwcec3 = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9avqwcec3.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("31");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-zincirli-bot-md1080-116-0002-p-347913625");
                    Thread.sleep(5000);
                    WebElement btnq = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btnq.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("32");
                    driver.get("https://www.trendyol.com/pd/moda-degirmeni/kadin-gunluk-tasli-lastikli-ayakkabi-md1131-111-0005-p-350236405?boutiqueId=61&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btnw = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btnw.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("33");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-fiyonklu-gunluk-ayakkabi-md1103-111-0002-p-345886322");
                    Thread.sleep(5000);
                    WebElement btne = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btne.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("34");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-bel-cantasi-md1140-304-0001-p-354447455");
                    Thread.sleep(5000);
                    WebElement btnr = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[6]/div/div/div[1]/button"));
                    btnr.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("35");
                    driver.get("https://www.trendyol.com/pd/moda-degirmeni/kadin-lastikli-bot-md1142-116-0003-p-353682374?boutiqueId=613675&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btny = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btny.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("36");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-kare-burun-bot-md1086-116-0004-p-349035738");
                    Thread.sleep(5000);
                    WebElement btnn = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btnn.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("37");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tuylu-tasli-kisa-bot-md1138-116-0002-p-347938182");
                    Thread.sleep(5000);
                    WebElement btnc = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btnc.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("38");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-tasli-topuklu-ayakkabi-md1092-119-0007-p-345897630");
                    Thread.sleep(5000);
                    WebElement btnqw = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btnqw.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("39");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-troklu-topuklu-ayakkabi-md1092-119-0006-p-345893594?boutiqueId=61&merchantId=142292");
                    Thread.sleep(5000);
                    WebElement btner = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btner.click();
                    Thread.sleep(3000);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }

                try{
                    System.out.println("07");
                    driver.get("https://www.trendyol.com/moda-degirmeni/kadin-capraz-tasli-abiye-canta-md1123-310-0002-p-301737525");
                    Thread.sleep(5000);
                    WebElement btn9av = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9av.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }

                try{
                    System.out.println("emre1");
                    driver.get("https://www.trendyol.com/jaxet/unisex-gri-new-york-199x-baskili-oversize-sweatshirt-p-376604609?boutiqueId=615606&merchantId=656143&utm_source=share");
                    Thread.sleep(5000);
                    WebElement btn9av = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9av.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("emre2");
                    driver.get("https://www.trendyol.com/pd/jaxet/unisex-gri-california-west-baskili-oversize-sweatshirt-p-376598667?boutiqueId=615606&merchantId=656143&utm_source=share");
                    Thread.sleep(5000);
                    WebElement btn9av = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9av.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("emre3");
                    driver.get("https://www.trendyol.com/pd/jaxet/unisex-gri-michigan-middle-baskili-oversize-sweatshirt-p-376600782?boutiqueId=615606&merchantId=656143&utm_source=share");
                    Thread.sleep(5000);
                    WebElement btn9av = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9av.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }
                try{
                    System.out.println("emre4");
                    driver.get("https://www.trendyol.com/jaxet/unisex-siyah-minimal-penguen-baskili-oversize-sweatshirt-p-376607006?boutiqueId=615606&merchantId=656143&utm_source=share");
                    Thread.sleep(5000);
                    WebElement btn9av = driver.findElement(By.xpath("//div/div[2]/div[1]/div[2]/div[2]/div[5]/div/div/div[1]/button"));
                    btn9av.click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("HATA!");
                }


                System.out.println("Kaydedildi");
/*
                    driver.get("https://www.trendyol.com/Hesabim/KullaniciBilgileri");
                    String satir = br.readLine();
                    WebElement btn1c = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[1]/div[1]/input")));
                    btn1c.sendKeys(satir);
                    String satir1 = CR.readLine();
                    WebElement btn1ca = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[1]/div[2]/input")));
                    btn1ca.sendKeys(satir1);
                    Random r=new Random(); //random sınıfı
                    int gun = r.nextInt(28);
                    WebElement btn6g = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[1]/div[1]/div")));
                    btn6g.click();
                    Thread.sleep(2000);
                    WebElement btn6g1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[1]/div[1]/div/div/div["+gun+"]/div")));
                    btn6g1.click();
                    Thread.sleep(1000);
                    Random t=new Random(); //random sınıfı
                    int ay = t.nextInt(11);
                    WebElement btn6a1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[2]/div[1]/div")));
                    btn6a1.click();
                    Thread.sleep(2000);
                    WebElement btn6a = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[2]/div[1]/div/div/div["+ay+"]")));
                    btn6a.click();
                    Thread.sleep(1000);
                    Random y=new Random(); //random sınıfı
                    int yil = y.nextInt(35);
                    yil = yil+9;
                    WebElement btn6y1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[3]/div[1]/div")));
                    btn6y1.click();
                    Thread.sleep(1000);
                    WebElement btny1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/div[3]/div[3]/div[1]/div/div/div["+yil+"]")));
                    btny1.click();
                    Thread.sleep(1000);
                    WebElement btny12 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"member-gw-user-information\"]/div[3]/div[1]/form/button")));
                    btny12.click();
                    Thread.sleep(5000); */
                //hesapları kaydet
                // favorilere ekleme özelliği getir
                BufferedWriter bufferedWriter = null;
                File file = new File("tka1.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                //  fileWriter nesnesine true parametre geçersek eklenen content'i dosyanın sonuna ekler
                FileWriter fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                String content = copyFromClipboard + "\n";
                bufferedWriter.write(content);
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("file write Success");
                BufferedWriter bufferedWriter1 = null;
                File file1 = new File("tks1.txt");
                if (!file1.exists()) {
                    file1.createNewFile();
                }
                //  fileWriter nesnesine true parametre geçersek eklenen content'i dosyanın sonuna ekler
                FileWriter fileWriter1 = new FileWriter(file1, true);
                bufferedWriter1 = new BufferedWriter(fileWriter1);
                String content1 = password + rand_int1 +"\n";
                bufferedWriter1.write(content1);
                bufferedWriter1.flush();
                bufferedWriter1.close();
                System.out.println("file write Success");
                System.out.println(i);
                System.out.println("Tamamlandı"+i);
                i++;
                System.out.println(i);
                driver.quit();
            } catch (Exception e) {

                driver.quit();
            }

        }
    }
}
