package org.knowm.xchange.gateio;

import org.knowm.xchange.gateio.dto.GateioBaseResponse;
import org.knowm.xchange.gateio.dto.account.GateioDepositAddress;
import org.knowm.xchange.gateio.dto.account.GateioDepositsWithdrawals;
import org.knowm.xchange.gateio.dto.account.GateioFunds;
import org.knowm.xchange.gateio.dto.marketdata.GateioFeeInfo;
import org.knowm.xchange.gateio.dto.trade.GateioOpenOrders;
import org.knowm.xchange.gateio.dto.trade.GateioOrderStatus;
import org.knowm.xchange.gateio.dto.trade.GateioPlaceOrderReturn;
import org.knowm.xchange.gateio.dto.trade.GateioTradeHistoryReturn;
import si.mazi.rescu.ParamsDigest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

@Path("/api/v4")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)
public interface GateioAuthenticated_V4 {


  @GET
  @Path("/spot/my_trades")
  GateioTradeHistoryReturn getMyTrades(
      @HeaderParam("KEY") String apiKey,
      @HeaderParam("SIGN") ParamsDigest signer,
      @HeaderParam("Timestamp") long timestamp,
      @FormParam("currency") String currency)
      throws IOException;
}
