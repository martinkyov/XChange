package org.knowm.xchange.binance.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class BinanceConvert {
    String quoteId;
    long orderId;
    String orderStatus;
    String fromAsset;
    BigDecimal fromAmount;
    String toAsset;
    BigDecimal toAmount;
    BigDecimal ratio;
    BigDecimal inverseRatio;
    long createTime;

    public BinanceConvert(
            @JsonProperty("quoteId") String quoteId,
            @JsonProperty("orderId") long orderId,
            @JsonProperty("orderStatus") String orderStatus,
            @JsonProperty("fromAsset") String fromAsset,
            @JsonProperty("fromAmount") BigDecimal fromAmount,
            @JsonProperty("toAsset") String toAsset,
            @JsonProperty("toAmount") BigDecimal toAmount,
            @JsonProperty("ratio") BigDecimal ratio,
            @JsonProperty("inverseRatio") BigDecimal inverseRatio,
            @JsonProperty("createTime") long createTime) {

        this.quoteId = quoteId;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.fromAsset = fromAsset;
        this.fromAmount = fromAmount;
        this.toAsset = toAsset;
        this.toAmount = toAmount;
        this.ratio = ratio;
        this.inverseRatio = inverseRatio;
        this.createTime = createTime;

    }

    public String getQuoteId() {
        return quoteId;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getFromAsset() {
        return fromAsset;
    }

    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    public String getToAsset() {
        return toAsset;
    }

    public BigDecimal getToAmount() {
        return toAmount;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public BigDecimal getInverseRatio() {
        return inverseRatio;
    }

    public long getCreateTime() {
        return createTime;
    }
}
