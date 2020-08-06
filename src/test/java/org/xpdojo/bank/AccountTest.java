package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AccountTest {

    private final Account account = new Account();;

    @Test
    @Ignore
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat(true). isEqualTo(false);
    }

    @Test
    public void newAccountShouldHaveZeroBalance(){
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance(){
        int preAmount = account.balance();
        account.deposit(2);
        assertThat( account.balance()).isEqualTo( preAmount + 2);
    }


}
