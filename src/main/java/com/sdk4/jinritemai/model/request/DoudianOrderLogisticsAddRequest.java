package com.sdk4.jinritemai.model.request;

import com.sdk4.jinritemai.DoudianRequest;
import com.sdk4.jinritemai.model.response.DoudianOrderLogisticsAddResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoudianOrderLogisticsAddRequest implements DoudianRequest<DoudianOrderLogisticsAddResponse> {
    private final String method = "order.logisticsAdd";

    /**
     * 父订单ID，由orderList接口返回
     */
    private String orderId;

    /**
     * 物流公司ID，由接口/order/logisticsCompanyList返回的物流公司列表中对应的ID
     */
    private Long logisticsId;

    /**
     * 物流公司名称
     */
    private String company;

    /**
     * 运单号
     */
    private String logisticsCode;

    @Override
    public Class<DoudianOrderLogisticsAddResponse> getResponseClass() {
        return DoudianOrderLogisticsAddResponse.class;
    }
}
