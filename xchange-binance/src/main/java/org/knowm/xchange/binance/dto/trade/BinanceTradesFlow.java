package org.knowm.xchange.binance.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BinanceTradesFlow {
    List<BinanceConvert> converts;

    public BinanceTradesFlow(
            @JsonProperty("list") List<BinanceConvert> converts
    ) {
        this.converts = converts;
    }

    public List<BinanceConvert> getConverts() {
        return converts;
    }
}
