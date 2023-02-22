import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class lab4 {

    public static final Scanner sc = new Scanner(System.in);

    static String Acc_Num;
    static String Acc_Holder;
    static int Acc_Bal;

    static String[][] transactions = new String[100][5];
    static int iii = 0;

static void InitializeTheCustomer(){
    System.out.println("\n1. Initialize the customer\n");

    System.out.print("\nEnter customer name:");
    Acc_Holder = sc.nextLine();

    System.out.print("\nEnter Account Number:");
    Acc_Num = sc.nextLine();

    System.out.print("\nEnter Balance:");
    Acc_Bal = Integer.parseInt(sc.nextLine());

    System.out.println("\nCustomer added Successfully\n");

}

static void depositMoney(){
    System.out.println("\n2. Deposit Money\n");

    System.out.print("Enter Amount: ");
    int deposite = Integer.parseInt(sc.nextLine());
    int old_bal = Acc_Bal;
    Acc_Bal = Acc_Bal + deposite;

    DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd    HH:mm:ss");
    LocalDateTime cr_dt = LocalDateTime.now();


    iii++;
    transactions[iii][0] = "Deposite";
    transactions[iii][1] = ""+deposite;
    transactions[iii][2] = ""+Acc_Bal;
    transactions[iii][3] = ""+dt.format(cr_dt);
    transactions[iii][4] = ""+old_bal;

    System.out.println("Your New Balance: "+Acc_Bal);
}

static void WithdrawMoney(){
    System.out.println("\n3. Withdraw Money\n````````````````````````````````");
    int old_bal = Acc_Bal;
    System.out.print("Enter Amount: ");
    int Withdraw = Integer.parseInt(sc.nextLine());

    if(Acc_Bal <= 0 || Acc_Bal < Withdraw){
        System.out.println("ERROR: Insufficient balance.");
    }else{
        Acc_Bal = Acc_Bal - Withdraw;
    }

    DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd    HH:mm:ss");
    LocalDateTime cr_dt = LocalDateTime.now();

    iii++;
    transactions[iii][0] = "Withdraw";
    transactions[iii][1] = ""+Withdraw;
    transactions[iii][2] = ""+Acc_Bal;
    transactions[iii][3] = ""+dt.format(cr_dt);
    transactions[iii][4] = ""+old_bal;

    System.out.println("Your New Balance: "+Acc_Bal);
}

static void showTransactoins(){
    System.out.println("\n3. Withdraw Money\n````````````````");

    System.out.println("transaction Ammount   Old Balance New Balance DATE        TIME");
    for(String[] s: transactions){
        if(s[0]==null){
            continue;
        }else{
            System.out.printf("%-12s"+"%-10s"+"%-12s"+"%-12s"+"%s\n",s[0],s[1],s[4],s[2],s[3]);
        }
    }
    System.out.println("--------------END-------------");
}

static void accountSummary(){
    System.out.println("Account Holder Name: "+Acc_Holder);
    System.out.println("Account Number:"+Acc_Num);
    System.out.println("Account Balance: "+Acc_Bal);

}

//    ----------------------MAIN---------------------
    public static void main(String[] args) {
        boolean flag = true;

        InitializeTheCustomer();

        while(flag){
            System.out.println("------------MENU----------------");
            System.out.println("1. deposit money");
            System.out.println("2. withdraw money");
            System.out.println("3. print the transactions");
            System.out.println("4. print account summary");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.print("\nChoose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    depositMoney();
                    break;
                case 2:
                    WithdrawMoney();
                    break;
                case 3:
                    showTransactoins();
                    break;
                case 4:
                    accountSummary();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter valied Input.");
                    break;
            }
        }
    }
}
