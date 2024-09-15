class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(3000, -1000);
        System.out.println(acct1.getBalance());
        boolean success = acct1.withdraw(1500);
        System.out.println("success=" + success + ", balance=" + acct1.getBalance());
    }
}

