package org.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "test user")
    public Object[][] validData() {
        return new Object[][]{
                {"test_user@test.com", "1234"}
        };
    }
}
