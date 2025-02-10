public class ActiveState implements AccountState {
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited: " + account);
    }

    public void withdraw(Account account, double amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew: " + account);
    }

    public void activate(Account account) {
        System.out.println("Account is already active.");
    }

    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended.");
    }

    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed.");
    }
}