package ru.sawasemykin.dataStructureI;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice, sellPrice, maxProfit;
        buyPrice = prices[0];
        maxProfit = sellPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
                sellPrice = 0;
            }
            else if (prices[i] >= sellPrice) {
                // чтобы сделка состоялось д.б. зафиксирована цена продажи
                sellPrice = prices[i];
                maxProfit = Integer.max(maxProfit, sellPrice - buyPrice);
            }
        }
        return maxProfit;
    }
}
