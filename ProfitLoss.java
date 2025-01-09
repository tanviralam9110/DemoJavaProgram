package jspider.ifalse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
       // double cost=4525;
      //  double selling=4525;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost amount");
        double cost = sc.nextDouble();
        System.out.println("Enter the selling amount");
        double selling = sc.nextDouble();
        double percentPro,profit, loss,percentLoss;
        if (selling>cost){
            profit=selling-cost;
            System.out.println("The total profit:"+profit);
            percentPro=profit*100/cost;
            System.out.println("The total percentProfit"+percentPro);

        } else if (cost>selling) {
            loss= cost-selling;
            System.out.println("The total loss:"+loss);
            percentLoss=loss*100/cost;
            System.out.println("The total loss of percent "+percentLoss);
        }
        else {
            System.out.println("No profit or No loss");
        }
    }
}
