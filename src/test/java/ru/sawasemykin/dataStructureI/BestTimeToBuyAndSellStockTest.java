package ru.sawasemykin.dataStructureI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @MethodSource("pricesAndExpectedProfit")
    void maxProfit(int[] prices, int expectedProfit) {
        int actualProfit = solution.maxProfit(prices);
        Assertions.assertEquals(expectedProfit, actualProfit);
    }

    static Stream<Arguments> pricesAndExpectedProfit() {
        return Stream.of(
                Arguments.arguments(new int[] {7 , 1, 5, 3, 6, 4}, 5),
                Arguments.arguments(new int[] {7, 6, 4, 3, 1}, 0),
                Arguments.arguments(new int[] {2, 4, 1}, 2),
                Arguments.arguments(new int[] {2, 1, 2, 1, 0, 1, 2}, 2),
                Arguments.arguments(new int[] {3, 3, 5, 0, 0, 3, 1, 4}, 4)
        );
    }
}
