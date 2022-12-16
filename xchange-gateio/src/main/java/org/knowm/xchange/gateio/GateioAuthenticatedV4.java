package org.knowm.xchange.gateio;

import org.knowm.xchange.gateio.dto.trade.GateioTradeHistoryReturn;
import si.mazi.rescu.ParamsDigest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/api/v4")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)
public interface GateioAuthenticatedV4 extends Gateio {

  @POST
  @Path("/spot/my_trades")
  GateioTradeHistoryReturn getMyTrades(
      @HeaderParam("KEY") String apiKey,
      @HeaderParam("SIGN") ParamsDigest signer,
      @HeaderParam("Timestamp") String timestamp,
      @FormParam("currencyPair") String currencyPair)
      throws IOException;

}
