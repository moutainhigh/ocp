package com.topideal.supplychain.ocp.ew.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class EwFxRecipient implements Serializable {

    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 收货人证件类型
     */
    private Integer receiveType;
    /**
     * 收件人证件号
     */
    private String receiveNo;
    /**
     * 收货人手机号码
     */
    private String mobilePhone;
    /**
     * 收货人座机
     */
    private String phone;
    /**
     * 收货人国家
     */
    private String country;
    /**
     * 指运港代码
     */
    private String pod;
    /**
     * 收货人省份
     */
    private String province;
    /**
     * 收货人市
     */
    private String city;
    /**
     * 收货人区/县
     */
    private String district;
    /**
     * 收货人地址
     */
    private String address;
    /**
     * 收货人邮编
     */
    private String postCode;
    /**
     * 订单优惠金额
     */
    private BigDecimal totalFavourable;
    /**
     * 送礼人
     */
    private String sender;
    /**
     * 收礼人
     */
    private String receiver;
    /**
     * 祝贺语
     */
    private String congratulations;
    /**
     * 配送时间
     */
    private String transportDay;
    /**
     * 收货人省市代码
     */
    private String recipientProvincesCode;

    private EwFxRecipient(Builder builder) {
        name = builder.name;
        receiveType = builder.receiveType;
        receiveNo = builder.receiveNo;
        mobilePhone = builder.mobilePhone;
        phone = builder.phone;
        country = builder.country;
        pod = builder.pod;
        province = builder.province;
        city = builder.city;
        district = builder.district;
        address = builder.address;
        postCode = builder.postCode;
        totalFavourable = builder.totalFavourable;
        sender = builder.sender;
        receiver = builder.receiver;
        congratulations = builder.congratulations;
        transportDay = builder.transportDay;
        recipientProvincesCode = builder.recipientProvincesCode;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public Integer getReceiveType() {
        return receiveType;
    }

    public String getReceiveNo() {
        return receiveNo;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getPod() {
        return pod;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public BigDecimal getTotalFavourable() {
        return totalFavourable;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getCongratulations() {
        return congratulations;
    }

    public String getTransportDay() {
        return transportDay;
    }

    public String getRecipientProvincesCode() {
        return recipientProvincesCode;
    }


    public static final class Builder {

        private String name;
        private Integer receiveType;
        private String receiveNo;
        private String mobilePhone;
        private String phone;
        private String country;
        private String pod;
        private String province;
        private String city;
        private String district;
        private String address;
        private String postCode;
        private BigDecimal totalFavourable;
        private String sender;
        private String receiver;
        private String congratulations;
        private String transportDay;
        private String recipientProvincesCode;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder receiveType(Integer receiveType) {
            this.receiveType = receiveType;
            return this;
        }

        public Builder receiveNo(String receiveNo) {
            this.receiveNo = receiveNo;
            return this;
        }

        public Builder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder pod(String pod) {
            this.pod = pod;
            return this;
        }

        public Builder province(String province) {
            this.province = province;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public Builder totalFavourable(BigDecimal totalFavourable) {
            this.totalFavourable = totalFavourable;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder congratulations(String congratulations) {
            this.congratulations = congratulations;
            return this;
        }

        public Builder transportDay(String transportDay) {
            this.transportDay = transportDay;
            return this;
        }

        public Builder recipientProvincesCode(String recipientProvincesCode) {
            this.recipientProvincesCode = recipientProvincesCode;
            return this;
        }

        public EwFxRecipient build() {
            return new EwFxRecipient(this);
        }
    }
}