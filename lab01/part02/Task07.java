public class Task07 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setName("Michael");
        acc1.setAddress("Los Santos");
        acc1.setAccountID("1001");
        acc1.setBalance(3000.33);
        BankAccount acc2 = new BankAccount();
        acc2.setName("Sarah");
        acc2.setAddress("Las Vegas");
        acc2.setAccountID("1002");
        acc2.setBalance(4000.44);
        BankAccount acc3 = new BankAccount();
        acc3.setName("Geralt");
        acc3.setAddress("Rivia");
        acc3.setAccountID("1003");
        acc3.setBalance(5000.55);
        acc1.addInterest();
        acc3.addInterest();
        System.out.println(acc1);
        System.out.println(acc3);
        BankAccount acc4 = new BankAccount("Ciri", "Skellige", "1004", 6000.66);
        System.out.println(acc4);
    }
}

class BankAccount {
    private String name;
    private String address;
    private String accountID;
    private double balance;
    public BankAccount() {

    }
    public BankAccount(String name, String address, String accountID, double balance) {
        this.name = name;
        this.address = address;
        this.accountID = accountID;
        this.balance = balance;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;        
    }
    public String getAccountID() {
        return this.accountID;
    }
    public void setAccountID(String i) {
        this.accountID = i;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String a) {
        this.address = a;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double c) {
        this.balance = c;
    }
    public void addInterest(){
        this.balance += this.balance * 0.7;
    }
    @Override
    public String toString() {
        String s = "Name: " + this.name + "\n";
        s += "Address: " + this.address + "\n";
        s += "Account ID: " + this.accountID + "\n";
        s += "Balance: " + this.balance;
        return s;
    }
}