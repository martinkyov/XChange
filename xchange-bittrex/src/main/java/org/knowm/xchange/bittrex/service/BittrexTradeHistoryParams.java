package org.knowm.xchange.bittrex.service;

import lombok.Data;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.service.trade.params.TradeHistoryParamCurrencyPair;
import org.knowm.xchange.service.trade.params.TradeHistoryParams;
import org.knowm.xchange.service.trade.params.TradeHistoryParamsIdSpan;

@Data
public class BittrexTradeHistoryParams
    implements TradeHistoryParams, TradeHistoryParamCurrencyPair, TradeHistoryParamsIdSpan {
  private String startId;
  private String endId;
  private CurrencyPair currencyPair;
}
