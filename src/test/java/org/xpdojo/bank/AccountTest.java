package org.xpdojo.bank;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test isn't implemented", true, is(false));
    }

    @Test
    public void newAccountShouldHaveZeroBalance(){
        Account account = new Account();
        assertThat("Balance not 0", account.balance() == 0, is(true));
    }
}
