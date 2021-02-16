package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Register;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class RegisterTest {
    WebDriver driver = Utils.getDriver();

    public RegisterTest() throws IOException {
    }

    @Test
    public void registerSuccess() throws InterruptedException, IOException {
            Utils.openWebsite(Utils.getUrl());
            Utils.maximizeWindow();
            Register register = new Register(driver);
            Thread.sleep(100);
            register.setBtnSkipSignIn();
            Thread.sleep(100);
            register.setFirstName();
            Thread.sleep(100);
            register.setLastName();
            Thread.sleep(100);
            register.setAddress();
            Thread.sleep(100);
            register.setEmailAddress();
            Thread.sleep(100);
            register.setPhone("6123456789");
            Thread.sleep(100);
            register.setGender();
            Thread.sleep(100);
            register.setHobbies();
            Thread.sleep(1000);
            register.setLanguage();
            Thread.sleep(100);
            register.setChooseLanguage();
            Thread.sleep(100);
            register.setGender();
            Thread.sleep(100);
            register.setSkills("c");
            Thread.sleep(100);
            register.setCountry("Argentina");
            Thread.sleep(100);
            register.setSelectCountry();
            Thread.sleep(100);
            register.setFieldCountry("Australia");
            Thread.sleep(100);
            register.setFieldYear("1993");
            Thread.sleep(100);
            register.setFieldMonth("January");
            Thread.sleep(100);
            register.setFieldDay("27");
            Thread.sleep(100);
            register.setPassword("Halo123456--");
            Thread.sleep(100);
            register.setSecondPassword("Halo123456--");
            Thread.sleep(100);
            register.setBtnSubmit();
            Thread.sleep(100);
    }
}
