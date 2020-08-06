package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    private final Account account = new Account();;

    @Test
    @Ignore
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test isn't implemented", true, is(false));
    }

    @Test
    public void newAccountShouldHaveZeroBalance(){
        assertThat("Balance not 0", account.balance() == 0, is(true));
    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance(){
        int preAmount = account.balance();
        account.deposit(2);
        assertThat( "Balance not altered", account.balance() == preAmount + 2, is(true));
    }


}
