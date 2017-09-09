
package net.livecoin;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OrderBook {

    @JsonProperty("timestamp")
    private Long mTimestamp;
    private List asks;
    private List bids;

}
