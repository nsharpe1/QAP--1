public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getBalance()
    {
        return this.balance;
    }

    
}