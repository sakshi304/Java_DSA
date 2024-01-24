package ARRAYS;

public class Buy_Sell_stocks{
    public static int stockprofit(int price[]){
        int maxprofit=0;
        int profit=0;
        int buyprice=Integer.MAX_VALUE;         //tracks the lowest buy price
        for (int i=0;i< price.length;i++){
            if(buyprice<price[i]){
                profit=price[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {

            System.out.println("Profit: "+stockprofit(new int[]{7,1,5,3,6,4}));
            System.out.println("Profit: "+stockprofit(new int[]{7,5,2,1,0}));
    }
}
