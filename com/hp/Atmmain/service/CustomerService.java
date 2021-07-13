package com.hp.Atmmain.service;


import com.hp.Atmmain.Customer.Customer;
import com.hp.Atmmain.Customer.CustomerData;
import com.hp.Atmmain.Uitl.TextUitl;

import java.util.List;
import java.util.Scanner;

// 此类是  完成 客户的 所有业务 (增删改查)
public class CustomerService {
    private List<Customer> customerList;
    private Customer currentCustomer;
    Scanner  scan = new Scanner(System.in);



    // 1. 查, 登录 判断账号密码是否正确
    public void  checkPwd(String cardid, String  cardPwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList  = customerData.getCustomerList();
        // 1. 拿到  carid中的账户名 和 cardPwd  对  list中的数据做对比
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){

                currentCustomer =  customer;
                // 账户正确
                System.out.println("欢迎"+customer.getCname()+"顾客登录!请注意您的安全"   );
                TextUitl.oneLeveOption();  // 界面

                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);
                // 如何 保证 按了 1 3 5... 让他再此回到 此界面呢 ?
            }
        }
    }

    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");

                // 查询余额外
                doSelectMoney();
                // 当按下1 之后,  回退到  1及选项
                goOneHome();
                break;
            case "2":
                System.out.println("取款");

                goGetMoneyHome();
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                doTruanMoney();
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                doCun();
               // cun();
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                doQuitCard();
                break;
        }
    }
    private void doQuitCard(){
        System.out.println("您是否继续操作yes/no[Y/N]");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("y")) {
            System.out.println("退卡成功！");//结束掉

        }
        if (s.equalsIgnoreCase("n")) {
            goOneHome();
        }
    
}



    private  void doCun(){
        //1.提示页面
        System.out.println("请输入存入的金额");
        Scanner s = new Scanner(System.in);
        String moneyIn = s.nextLine();
        Double moneyInInt = Double.valueOf(moneyIn);
        if ((moneyInInt %100) == 0 ) {

            double newMoney = currentCustomer.getMoney()+moneyInInt;
            currentCustomer.setMoney(newMoney);
            System.out.println(" 存入成功！ 您账户的余额是：" + newMoney);
        }else {
            System.out.println("存入的金额不能小于100，存入金额失败");
        }

    }
       private   void   doTruanMoney() {

           System.out.println("请输入对方账户号码：");
           Scanner scanner = new Scanner(System.in);
           String otherAccount = scanner.nextLine();
           System.out.println("请输入您需要转账的金额：");
           String otherMoney = scanner.nextLine();
           //自己 减钱
           Double otherMoneyInt = Double.parseDouble(otherMoney);
           //
           double currentCustomerMoney = currentCustomer.getMoney()-otherMoneyInt;
//别人 加钱 ，
           //因为 所有人都在 customerList 都在这个集合中 ， 那么慢遍历这个集合
           Customer other = null;
           for (Customer customer : customerList) {


               if (customer.getAccount().equals(otherAccount)) {
                    other = customer;
               }
           }
            double  otherOneMoney =  other.getMoney() +otherMoneyInt;
        currentCustomer.setMoney(currentCustomerMoney);
        other.setMoney(otherOneMoney);
           System.out.println("转账成功！");
       }
    //private void getmoney() {
      //  Scanner scanner = new Scanner(System.in);
      //  String  numIn = scanner.nextLine();
      //  if (numIn.equals("1")) {
         //   double money = currentCustomer.getMoney();
        //    money=money-100;
          //  System.out.println("取款成功!   您的余额是："+money);;


       // }
   // }

    // 查询余额
    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println(" 余额是 " +money);
    }
   // private void qu(){
      //  System.out.println("请输入取款金额:");

       // double money = scan.nextDouble();
      // if (money <= currentCustomer.getMoney()){
        //    money = currentCustomer.getMoney()-money;
         //   currentCustomer.setMoney(money);
         //   System.out.println("取款成功");
      //  }else {
         //   System.out.println("余额不足，取款失败");

      //  }
  //  }

    private void goGetMoneyHome(){
        TextUitl.getMoneyUI();
        // 1. 让客户输入

        Scanner scanner = new Scanner(System.in);
        String  numIn = scanner.nextLine();
        if (numIn.equals("1")){
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = currentCustomer.getMoney();
            money=money-100;
            currentCustomer.setMoney(money);
            System.out.println("您的余额是: " + money);
            // 取完款项之后,  更新 原有的 存款

        }
        if (numIn.equals("2")){
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = currentCustomer.getMoney();
            money=money-200;
            currentCustomer.setMoney(money);
            System.out.println("您的余额是: " + money);
            // 取完款项之后,  更新 原有的 存款

        }
        if (numIn.equals("3")){
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = currentCustomer.getMoney();
            money=money-500;
            currentCustomer.setMoney(money);
            System.out.println("您的余额是: " + money);
            // 取完款项之后,  更新 原有的 存款

        }
        if (numIn.equals("4")){
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = currentCustomer.getMoney();
            money=money-1000;
            currentCustomer.setMoney(money);
            System.out.println("您的余额是: " + money);
            // 取完款项之后,  更新 原有的 存款

        }
        if (numIn.equals("5")){
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = currentCustomer.getMoney();
            money=money-5000;
            currentCustomer.setMoney(money);
            System.out.println("您的余额是: " + money);
            // 取完款项之后,  更新 原有的 存款

        }
        if (numIn.equals("6")) {
            // 那么 取款100 那么就应该 让 顾客的 钱 -100
            double money = scanner.nextDouble();
            if (money <= currentCustomer.getMoney()) {


                if ((money % 100) == 0) {
                    money = currentCustomer.getMoney() - money;
                    currentCustomer.setMoney(money);
                    System.out.println("取款成功！ 您的余额是: " + currentCustomer.getMoney());


                } else {
                    System.out.println("取款失败 ， 请输入100或100的倍数");
                }
            }else{
                System.out.println("余额不足。");
                }
            }
        }

   // private void cun(){
   //     System.out.println("请输入存钱额度:");
    //    if (money >0){
     //       System.out.println("存款金额不能为0");
     //   }
      //  money = money+currentCustomer.getMoney();
      //  currentCustomer.setMoney(money);
      //  System.out.println("存款成功，当前余额:"+currentCustomer.getMoney());
   // }



    private  void goOneHome( ){
        TextUitl.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);  // 递归算法
    }


}
