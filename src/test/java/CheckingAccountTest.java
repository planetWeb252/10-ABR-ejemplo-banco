import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    private CheckingAccount checkingAccount;

    @BeforeEach
    void setUpChechingAccount() throws IllegalArgumentException {
        checkingAccount = new CheckingAccount("ES00052", 100.00,
                -50.00);
    }

    @Test
    @DisplayName("Propierties contructor")
    void propiertiesConstructor() {
        assertNotNull(checkingAccount.getAccountNumber(), "No puede ser null");
    }


    @Test
    @DisplayName("Over limit is Negative")
    void overLimitIsNegative() throws IllegalArgumentException {
        assertTrue(checkingAccount.getOverdraftLimit() < 0, "Over Limit is " +
                "negative");
    }

    @Test
    @DisplayName("Over Limit is Positive")
    void overLimitIsPositive() throws IllegalArgumentException {
        assertFalse(checkingAccount.getOverdraftLimit() > 0, "over limit is " +
                "positive");
    }

    @Test
    @DisplayName("Test withDraw when amount is negative")
    void withdrawNegativeTest() throws IllegalArgumentException,
            InsufficientFundsException {
        assertThrows(IllegalArgumentException.class,
                () -> checkingAccount.withdraw(-100));

    }








}