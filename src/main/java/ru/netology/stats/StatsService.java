package ru.netology.stats;

public class StatsService {
    public long sumAllSales(long[] sales) {
        long allSales = 0;

        for (long sale : sales) {
            allSales += sale;


        }
        return allSales;
    }

    public long calcAverageSale(long[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int getMonthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                monthMax = i;

            }
        }
        return monthMax + 1;

    }

    public int getMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;

            }
        }
        return monthMin + 1;

    }

    public int countMonthsSalesBellowAverage(long[] sales) {
        int counter = 0;
        long average = calcAverageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;

            }
        }
        return counter;

    }

    public int countMonthsSalesAboveAverage(long[] sales) {
        int counter = 0;
        long average = calcAverageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;

            }
        }
        return counter;
    }

}