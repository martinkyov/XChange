package org.knowm.xchange.binance.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BinanceTradesFlow {
    List<BinanceConvert> converts;
    long startTime;
    long endTime;
    int limit;
    boolean moreData;

    public BinanceTradesFlow(
            @JsonProperty("list") List<BinanceConvert> converts,
            @JsonProperty("startTime") long startTime,
            @JsonProperty("endTime") long endTime,
            @JsonProperty("limit") int limit,
            @JsonProperty("moreData") boolean moreData
    ) {
        this.converts = converts;
        this.startTime = startTime;
        this.endTime = endTime;
        this.limit = limit;
        this.moreData = moreData;
    }

    public List<BinanceConvert> getConverts() {
        return converts;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public int getLimit() {
        return limit;
    }

    public boolean isMoreData() {
        return moreData;
    }
}
