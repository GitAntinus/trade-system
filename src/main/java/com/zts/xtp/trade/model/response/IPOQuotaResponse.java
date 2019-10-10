// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.response;

import com.zts.xtp.common.enums.MarketType;

public class IPOQuotaResponse {
    /**
     * 交易市场
     */
    private MarketType marketType;
    /**
     * 可申购额度
     */
    private int quantity;
    /**
     * 上海科创板额度
     */
    private int tech_quantity;
    /**
     * 保留
     */
    private int unused;
    /**
     * 此消息响应函数对应的请求ID
     */
    private int requestId;
    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    private boolean lastResp;

    public void setMarketType(int type) {
        marketType = MarketType.values()[type];
    }


    @SuppressWarnings("all")
    public static class IPOQuotaResponseBuilder {
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private int quantity;
        @SuppressWarnings("all")
        private int tech_quantity;
        @SuppressWarnings("all")
        private int unused;
        @SuppressWarnings("all")
        private int requestId;
        @SuppressWarnings("all")
        private boolean lastResp;

        @SuppressWarnings("all")
        IPOQuotaResponseBuilder() {
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder quantity(final int quantity) {
            this.quantity = quantity;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder tech_quantity(final int tech_quantity) {
            this.tech_quantity = tech_quantity;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder unused(final int unused) {
            this.unused = unused;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder requestId(final int requestId) {
            this.requestId = requestId;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponseBuilder lastResp(final boolean lastResp) {
            this.lastResp = lastResp;
            return this;
        }

        @SuppressWarnings("all")
        public IPOQuotaResponse build() {
            return new IPOQuotaResponse(marketType, quantity, tech_quantity, unused, requestId, lastResp);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "IPOQuotaResponse.IPOQuotaResponseBuilder(marketType=" + this.marketType + ", quantity=" + this.quantity + ", tech_quantity=" + this.tech_quantity + ", unused=" + this.unused + ", requestId=" + this.requestId + ", lastResp=" + this.lastResp + ")";
        }
    }

    @SuppressWarnings("all")
    public static IPOQuotaResponseBuilder builder() {
        return new IPOQuotaResponseBuilder();
    }

    /**
     * 交易市场
     */
    @SuppressWarnings("all")
    public MarketType getMarketType() {
        return this.marketType;
    }

    /**
     * 可申购额度
     */
    @SuppressWarnings("all")
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * 上海科创板额度
     */
    @SuppressWarnings("all")
    public int getTech_quantity() {
        return this.tech_quantity;
    }

    /**
     * 保留
     */
    @SuppressWarnings("all")
    public int getUnused() {
        return this.unused;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public int getRequestId() {
        return this.requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * 可申购额度
     */
    @SuppressWarnings("all")
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    /**
     * 上海科创板额度
     */
    @SuppressWarnings("all")
    public void setTech_quantity(final int tech_quantity) {
        this.tech_quantity = tech_quantity;
    }

    /**
     * 保留
     */
    @SuppressWarnings("all")
    public void setUnused(final int unused) {
        this.unused = unused;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public void setRequestId(final int requestId) {
        this.requestId = requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof IPOQuotaResponse)) return false;
        final IPOQuotaResponse other = (IPOQuotaResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$marketType = this.getMarketType();
        final Object other$marketType = other.getMarketType();
        if (this$marketType == null ? other$marketType != null : !this$marketType.equals(other$marketType)) return false;
        if (this.getQuantity() != other.getQuantity()) return false;
        if (this.getTech_quantity() != other.getTech_quantity()) return false;
        if (this.getUnused() != other.getUnused()) return false;
        if (this.getRequestId() != other.getRequestId()) return false;
        if (this.isLastResp() != other.isLastResp()) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof IPOQuotaResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $marketType = this.getMarketType();
        result = result * PRIME + ($marketType == null ? 43 : $marketType.hashCode());
        result = result * PRIME + this.getQuantity();
        result = result * PRIME + this.getTech_quantity();
        result = result * PRIME + this.getUnused();
        result = result * PRIME + this.getRequestId();
        result = result * PRIME + (this.isLastResp() ? 79 : 97);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "IPOQuotaResponse(marketType=" + this.getMarketType() + ", quantity=" + this.getQuantity() + ", tech_quantity=" + this.getTech_quantity() + ", unused=" + this.getUnused() + ", requestId=" + this.getRequestId() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public IPOQuotaResponse() {
    }

    @SuppressWarnings("all")
    public IPOQuotaResponse(final MarketType marketType, final int quantity, final int tech_quantity, final int unused, final int requestId, final boolean lastResp) {
        this.marketType = marketType;
        this.quantity = quantity;
        this.tech_quantity = tech_quantity;
        this.unused = unused;
        this.requestId = requestId;
        this.lastResp = lastResp;
    }
}