package BuilderPattern;

public class TestPattern {

    public static void main(String[] args) {

    BankAccount account = new BankAccount.Builder(1234L)
            .withOwner("XYZ")
            .atBranch("XXX")
            .openingBalance(100)
            .atRate(2.5)
            .build();
    BankAccount anotherAccount = new BankAccount.Builder(4567L)
            .withOwner("User")
            .atBranch("User")
            .openingBalance(100)
            .atRate(2.5)
            .build();

        System.out.println(account);
        System.out.println(anotherAccount);

    }


}
