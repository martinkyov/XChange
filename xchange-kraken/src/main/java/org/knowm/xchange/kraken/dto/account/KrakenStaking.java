package org.knowm.xchange.kraken.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.kraken.dto.account.results.KrakenTransactionStatus;

import java.math.BigDecimal;

public class KrakenStaking {


    private final String method;
    private final String aclass;
    private final String refId;
    private final KrakenStakingType type;
    private final String asset;
    private final BigDecimal amount;
    private final BigDecimal fee;
    private final double time;
    private final double bondStart;
    private final double bondEnd;
    private final KrakenTransactionStatus status;

    /**
     * Constructor
     *
     * @param method
     * @param aclass
     * @param asset
     * @param amount
     * @param fee
     * @param unixTime
     * @param status
     * @param type
     * @param bondStart
     * @param bondEnd
     */
    public KrakenStaking(
            @JsonProperty("method") String method,
            @JsonProperty("aclass") String aclass,
            @JsonProperty("asset") String asset,
            @JsonProperty("refid") String refId,
            @JsonProperty("amount") String amount,
            @JsonProperty("fee") String fee,
            @JsonProperty("time") double unixTime,
            @JsonProperty("status") String status,
            @JsonProperty("type") String type,
            @JsonProperty("bond_start") double bondStart,
            @JsonProperty("bond_end") double bondEnd
    ) {
        this.method = method;
        this.aclass = aclass;
        this.asset = asset;
        this.refId = refId;
        this.amount = new BigDecimal(amount);
        this.fee = new BigDecimal(fee);
        this.time = unixTime;
        this.status = KrakenTransactionStatus.valueOf(status);
        this.type = KrakenStakingType.valueOf(type);
        this.bondStart = bondStart;
        this.bondEnd = bondEnd;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public String getMethod() {
        return method;
    }

    public String getAclass() {
        return aclass;
    }

    public String getRefId() {
        return refId;
    }

    public KrakenStakingType getType() {
        return type;
    }

    public String getAsset() {
        return asset;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public double getTime() {
        return time;
    }

    public double getBondStart() {
        return bondStart;
    }

    public double getBondEnd() {
        return bondEnd;
    }

    public KrakenTransactionStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "KrakenStaking[" +
                "method='" + method + '\'' +
                ", aclass='" + aclass + '\'' +
                ", refId='" + refId + '\'' +
                ", type=" + type +
                ", asset='" + asset + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", time=" + time +
                ", bondStart=" + bondStart +
                ", bondEnd=" + bondEnd +
                ", status=" + status +
                ']';
    }
}
