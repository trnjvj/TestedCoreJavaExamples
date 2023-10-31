class UnsynchBankTest
{  public static void main(String[] args)
   {  Bank b = new Bank();
      int i;
      for (i = 1; i <= Bank.NACCOUNTS; i++)
         new TransactionSource(b, i).start();
   }
}
class Bank
{  public Bank()
   {  accounts = new long[NACCOUNTS];
      int i;
      for (i = 0; i < NACCOUNTS; i++)
         accounts[i] = INITIAL_BALANCE;
      ntransacts = 0;
      test();
   }
   public void transfer(int from, int to, int amount)
   {  while (accounts[from] < amount)
      {  try {  Thread.sleep(5); } catch(InterruptedException e) {}
      }

      accounts[from] -= amount;
      accounts[to] += amount;
      ntransacts++;
      if (ntransacts % 5000 == 0) test();
   }
   public void test()
   {  int i;
      long sum = 0;

      for (i = 0; i < NACCOUNTS; i++) sum += accounts[i];
      System.out.println("Transactions:" + ntransacts + " Sum: " + sum);
   }
   public static final int INITIAL_BALANCE = 10000;
   public static final int NACCOUNTS = 10;
   private long[] accounts;
   private int ntransacts;
}
class TransactionSource extends Thread
{  public TransactionSource(Bank b, int i)
   {  from = i - 1;
      bank = b;
   } 
   public void run()
   {  while (true)
      {  int to = (int)((Bank.NACCOUNTS - 1) * Math.random());
         if (to >= from) to++;
         int amount = 1 + (int)(Bank.INITIAL_BALANCE * Math.random()) / 2;
         bank.transfer(from, to, amount);
         try { sleep(1); } catch(InterruptedException e) {}
      }
   }
   private Bank bank;
   private int from;
}

