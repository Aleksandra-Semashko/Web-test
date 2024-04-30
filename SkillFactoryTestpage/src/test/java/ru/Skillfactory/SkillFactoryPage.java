package ru.Skillfactory;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class SkillFactoryPage extends Settings {
    @Test
    public void DropdownListCourses() {

        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1296, 696));
        {
            WebElement element = driver.findElement(By.cssSelector(".t978__tm-link:nth-child(1)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".t978__menu-item:nth-child(4) .t978__typo_623893182 > .t978__link-inner"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".t978__menu-item:nth-child(8) .t978__link-inner"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".t978__menu-item:nth-child(9) .t978__link-inner")).click();
        vars.put("win7348", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win7348").toString());
        driver.close();
    }
    @Test
    public void ReturnMainPage () {
        driver.get("https://skillfactory.ru/courses/testirovanie");
        driver.manage().window().setSize(new Dimension(1552, 849));
        driver.findElement(By.cssSelector(".loaded")).click();
        {
            WebElement element = driver.findElement(By.cssSelector("li:nth-child(4) > .main__nav-item"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
    }
    @Test
    public void AllCoursesButton () {
            driver.get("https://skillfactory.ru/");
            driver.manage().window().setSize(new Dimension(1096, 672));
            js.executeScript("window.scrollTo(0,500)");
            vars.put("window_handles", driver.getWindowHandles());
            driver.findElement(By.cssSelector(".directions__list-link_green > span")).click();
            vars.put("win7209", waitForWindow(2000));
            driver.switchTo().window(vars.get("win7209").toString());
        }
    @Test
    public void ChatWithSupport(){
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        driver.switchTo().frame(11);
        driver.findElement(By.cssSelector(".svelte-1qe9gqs")).click();
        driver.findElement(By.cssSelector(".button__text")).click();
        driver.findElement(By.id("opened-textfield")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".right-slot .cqi-chat"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
    @Test
    public void ItProfSelect (){
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,399.3333435058594)");
        {
            WebElement element = driver.findElement(By.cssSelector(".card__link:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".card__link:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".card__link:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".card__link:nth-child(3)")).click();
        vars.put("win6913", waitForWindow(2000));
        driver.switchTo().window(vars.get("win6913").toString());
    }
    @Test
    public void AllProfButton() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1051, 815));
        js.executeScript("window.scrollTo(0,216.8000030517578)");
        js.executeScript("window.scrollTo(0,1400)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".all-link:nth-child(4) > span")).click();
        vars.put("win3776", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win3776").toString());
    }
    @Test
    public void OnlineUniEdubutton() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1051, 815));
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("Выбрать программу")).click();
        vars.put("win6862", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win6862").toString());
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
    }
    @Test
    public void ItParticipateButton() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1051, 815));
        js.executeScript("window.scrollTo(0,600)");
        js.executeScript("window.scrollTo(0,1315.199951171875)");
        js.executeScript("window.scrollTo(0,2653.60009765625)");
        {
            WebElement element = driver.findElement(By.linkText("Участвовать"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("Участвовать")).click();
        vars.put("win2736", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win2736").toString());
        driver.switchTo().window(vars.get("root").toString());
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.switchTo().window(vars.get("win2736").toString());
    }
    @Test
    public void RostelecomProjectTesterLink() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,1100)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("на курсе «Тестировщик-автоматизатор»")).click();
        vars.put("win9343", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win3964").toString());
    }
    @Test
    public void ReviewCarousel() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1280, 680));
        driver.findElement(By.id("employer-reviews-next-btn")).click();
        driver.findElement(By.id("employer-reviews-next-btn")).click();
        driver.findElement(By.id("employer-reviews-next-btn")).click();
        driver.findElement(By.id("employer-reviews-next-btn")).click();
        driver.findElement(By.id("employer-reviews-prev-btn")).click();
        driver.findElement(By.id("employer-reviews-prev-btn")).click();
        driver.findElement(By.id("employer-reviews-prev-btn")).click();
        driver.findElement(By.id("employer-reviews-prev-btn")).click();
    }
    @Test
    public void FreeMaterialCarousel() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1280, 680));
        js.executeScript("window.scrollTo(0,74.66666412353516)");
        js.executeScript("window.scrollTo(0,4191.33349609375)");
        driver.findElement(By.id("free-materials-prev-btn")).click();
        driver.findElement(By.id("free-materials-prev-btn")).click();
        driver.findElement(By.id("free-materials-next-btn")).click();
        driver.findElement(By.id("free-materials-next-btn")).click();
    }
    @Test
    public void ParticipateFreeMaterialButton() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,394)");
        js.executeScript("window.scrollTo(0,1400)");
        js.executeScript("window.scrollTo(0,3400)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".swiper-slide-active > #grey .free-materials__card-button")).click();
        vars.put("win193", waitForWindow(2000));
        driver.switchTo().window(vars.get("win193").toString());
    }
    @Test
    public void ViewallMaterials() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,2600)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".free-materials .all-link > span")).click();
        vars.put("win2222", waitForWindow(2000));
        driver.switchTo().window(vars.get("win2222").toString());
    }
    @Test
    public void OfferClick() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,600)");
        js.executeScript("window.scrollTo(0,2214.666748046875)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("оферте")).click();
        vars.put("win8914", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8914").toString());
    }
    @Test
    public void StudentStoryCarousel() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,996)");
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
        driver.findElement(By.id("reviews-next-btn")).click();
    }
    @Test
    public void ReadStudentStory() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,1500)");
        js.executeScript("window.scrollTo(0,4186)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".swiper-slide-active span")).click();
        vars.put("win1986", waitForWindow(2000));
        driver.switchTo().window(vars.get("win1986").toString());
    }
    @Test
    public void TeacherCarousel() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,600)");
        js.executeScript("window.scrollTo(0,3800)");
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-prev-btn")).click();
        driver.findElement(By.id("mentors-next-btn")).click();
        driver.findElement(By.id("mentors-next-btn")).click();
        {
            WebElement element = driver.findElement(By.id("mentors-next-btn"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("mentors-next-btn")).click();
    }
    @Test
    public void MediaRedirect() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,2600)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".media .all-link > span")).click();
        vars.put("win8889", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8889").toString());
    }
    @Test
    public void ReadAboutUs() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,700)");
        js.executeScript("window.scrollTo(0,3714.666748046875)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".smi__card:nth-child(1) span")).click();
        vars.put("win8377", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8377").toString());
    }
    @Test
    public void FillInFormPositive() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,696)");
        js.executeScript("window.scrollTo(0,1800)");
        js.executeScript("window.scrollTo(0,4100)");
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Aleksandra Semashko");
        driver.findElement(By.name("email")).sendKeys("shurasemashko94@gmail.com");
        driver.findElement(By.id("input_1676828667932")).click();
        driver.findElement(By.id("input_1676828667932")).sendKeys("(911) 367-93-52");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(8) > .t-submit")).click();
        driver.findElement(By.cssSelector(".t-form-success-popup__close-icon")).click();
    }
    @Test
    public void EmailWithoutAtFormNegative() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,649.3333129882812)");
        js.executeScript("window.scrollTo(0,2100)");
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Aleksandra Semashko");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("shurasemashko94gmail.com");
        driver.findElement(By.id("input_1676828667932")).click();
        driver.findElement(By.id("input_1676828667932")).sendKeys("(911) 367-93-52");
        driver.findElement(By.name("name")).click();
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(8) > .t-submit")).click();
    }
    @Test
    public void SpecialCharacterFormNegative() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,688)");
        js.executeScript("window.scrollTo(0,1870.6666259765625)");
        js.executeScript("window.scrollTo(0,4706)");
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("~!@#$%^&*()_+{}|:”>?<Ё!”№;%:?*()_+/Ъ,/.,;’[]\\|");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("mail@ya.ru");
        driver.findElement(By.id("input_1676828667932")).click();
        driver.findElement(By.id("input_1676828667932")).sendKeys("(911) 367-93-52");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(8) > .t-submit")).click();
    }
    @Test
    public void ShortNumberFormNegative() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Александра");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("mail@ya.ru");
        driver.findElement(By.id("input_1676828667932")).click();
        driver.findElement(By.id("input_1676828667932")).sendKeys("(999) 999-99");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(8) > .t-submit")).click();
    }
    @Test
    public void PersonalDataRedirect() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,345.3333435058594)");
        js.executeScript("window.scrollTo(0,1700)");
        js.executeScript("window.scrollTo(0,4100)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.linkText("Положением о персональных данных")).click();
        vars.put("win1859", waitForWindow(2000));
        driver.switchTo().window(vars.get("win1859").toString());
    }
    @Test
    public void SubscribePositive() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,700)");
        js.executeScript("window.scrollTo(0,3201.333251953125)");
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("shurasemashko94@gmail.com");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(5) > .t-submit")).click();
        driver.findElement(By.cssSelector(".t-form-success-popup__close-icon")).click();
    }
    @Test
    public void EmptySubscribeNegative() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1296, 696));
        {
            WebElement element = driver.findElement(By.linkText("БЕСПЛАТНО"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("   ");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(5) > .t-submit")).click();
    }
    @Test
    public void XssAttackSubscribeNegative() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,1200)");
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).click();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("<script>alert(\"I hacked this!\")</script>");
        js.executeScript("window.scrollTo(0,11200)");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(5) > .t-submit")).click();
    }
    @Test
    public void ClickableIconTelegram() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        js.executeScript("window.scrollTo(0,1663.3333740234375)");
        js.executeScript("window.scrollTo(0,10863.3330078125)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__7360397271676892135027 .tn-atom__img")).click();
        vars.put("win8877", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8877").toString());
        driver.findElement(By.cssSelector(".tgme_action_button_new")).click();
    }
}

