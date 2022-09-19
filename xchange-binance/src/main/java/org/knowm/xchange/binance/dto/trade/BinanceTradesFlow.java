package org.knowm.xchange.binance.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BinanceTradesFlow {
    @JsonProperty("list") String converts;
    @JsonProperty("startTime") String startTime;
    @JsonProperty("endTime") String endTime;
    @JsonProperty("limit") String limit;
    @JsonProperty("moreData") String moreData;
}
