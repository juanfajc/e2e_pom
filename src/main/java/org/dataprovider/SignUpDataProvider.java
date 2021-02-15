package org.dataprovider;

import org.opencart.utilities.StringFunctions;
import org.testng.annotations.DataProvider;

public class SignUpDataProvider {
    int n = 15;

    @DataProvider(name = "valid data")
    public Object[][] validData() {
         return new Object[][]{
                {"carlos", "vargas", StringFunctions.randomEmail(n), "123456", "password123", "password123"}
         };
    }

    @DataProvider(name = "missing fields")
    public Object[][] missingField() {
        return new Object[][]{
                {null, "vargas", StringFunctions.randomEmail(n), "123456", "password123", "password123"},
                {"carlos", null, StringFunctions.randomEmail(n), "123456", "password123", "password123"},
                {"carlos", "vargas", null, "123456", "password123", "password123"},
                {"carlos", "vargas", StringFunctions.randomEmail(n), null, "password123", "password123"},
                {"carlos", "vargas", StringFunctions.randomEmail(n), "123456", null, "password123"},
                {"carlos", "vargas", StringFunctions.randomEmail(n), "123456", "password123", null}
        };
    }

    @DataProvider(name = "email missing at")
    public Object[][] emailMissingAt() {
        return new Object[][]{
                {"carlos", "vargas", "test_123.com", "123456", "password123", "password123"},
                {"jorge", "cueva", "test_456.com", "654321", "password123", "password123"},
                {"alberto", "caceres", "test_678.com", "111111", "password123", "password123"}
        };
    }

    @DataProvider(name = "email missing dot com")
    public Object[][] emailMissingDotCom() {
        return new Object[][]{
                {"carlos", "vargas", "test_123@test", "123456", "password123", "password123"},
                {"jorge", "cueva", "test_456@test", "654321", "password123", "password123"},
                {"alberto", "caceres", "test_678@test", "111111", "password123", "password123"}
        };
    }

    @DataProvider(name = "different passwords")
    public Object[][] differentPasswords() {
        return new Object[][]{
                {"carlos", "vargas", StringFunctions.randomEmail(n), "123456", "password123", "password"},
                {"jorge", "cueva", StringFunctions.randomEmail(n), "654321", "password666", "password"},
                {"alberto", "caceres", StringFunctions.randomEmail(n), "111111", "password444", "password"}
        };
    }
}
