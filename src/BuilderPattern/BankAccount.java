package BuilderPattern;

public class BankAccount {
    private long AccountNumber;
    private  String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static class Builder {
        private long AccountNumber;
        private  String owner;
        private String branch;
        private double balance;
        private double interestRate;


        public Builder(long accountNumber) {
            this.AccountNumber = accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.AccountNumber = this.AccountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }
    }

    private BankAccount() {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNumber=" + AccountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
