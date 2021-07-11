package com.hp.Atmmain;





import com.hp.Atmmain.Customer.Customer;
import com.hp.Atmmain.Customer.CustomerData;
import com.hp.Atmmain.Uitl.TextUitl;
import com.hp.Atmmain.service.CustomerService;


import java.util.List;
import java.util.Scanner;



public class Atm {
    private static String  cardid;
    private  static String cardPwd;
    private static CustomerService customerService;

    public static void main(String[] args) {
       CustomerData customerData = CustomerData.getInstance();
        List<Customer> customerList = customerData.getCustomerList();

        TextUitl.welcome();
        int i = 0;
        while (i<6){
            doWritePassword();
            doCheckPassword(cardid, cardPwd);
            i++;
        }


    }





    private static void doCheckPassword(String cardid, String cardPwd) {
        if (cardid.length()==8) { // 客户
            // 校验密码
            customerService.checkPwd(cardid,cardPwd);
        }
    }


    private static void doWritePassword() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }

}
