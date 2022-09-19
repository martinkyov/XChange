package org.knowm.xchange.binance.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BinanceTradesFlow {
    String converts;
    String startTime;
    String endTime;
    String limit;
    String moreData;

    public BinanceTradesFlow(
            @JsonProperty("list") String converts,
            @JsonProperty("startTime") String startTime,
            @JsonProperty("endTime") String endTime,
            @JsonProperty("limit") String limit,
            @JsonProperty("moreData") String moreData
    ) {
        this.converts = converts;
        this.startTime = startTime;
        this.endTime = endTime;
        this.limit = limit;
        this.moreData = moreData;
    }

    public String getConverts() {
        return converts;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLimit() {
        return limit;
    }

    public String isMoreData() {
        return moreData;
    }
}
