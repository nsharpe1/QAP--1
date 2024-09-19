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

    public int credit(int amount) 
    {
        this.balance += amount;
        return (balance);
    }

    public int debit(int amount)
    {
        if (amount <= balance) 
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return (balance);
    }

    public int transferTo(Account another, int amount)
    {
        if (amount <= balance) 
        {
            another.balance += amount;
            this.balance -= amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return (balance);
    }

    public String toString()
    {
        return("Account[id=" + this.id + " ,name=" + this.name + " ,balance=" + this.balance + "]");
    }
}