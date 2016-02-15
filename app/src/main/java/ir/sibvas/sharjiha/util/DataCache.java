package ir.sibvas.sharjiha.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCache {


    private Map<Integer, Integer> categoryTotalSize;
    private Map<Integer, Integer> categorySpinnerSelectedIndexMap;

    private int basketCount;

    private int comparisonProductListCount;

    public int getComparisonProductListCount() { return comparisonProductListCount; }

    public DataCache() {
        categoryTotalSize = new HashMap<>();
        categorySpinnerSelectedIndexMap = new HashMap<>();
    }

    public void setBasketCount(int basketCount) {
        this.basketCount = basketCount;
    }


    public int getBasketCount() {
        return basketCount;
    }

    public int getCategoryTotalSize(int categoryId){
        return categoryTotalSize.containsKey(categoryId) ? categoryTotalSize.get(categoryId) : -1;
    }

    public int getCategorySpinnerSelectedIndex(int categoryId){
        return categorySpinnerSelectedIndexMap.containsKey(categoryId) ? categorySpinnerSelectedIndexMap.get(categoryId) : -1;
    }

}
