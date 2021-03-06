package com.topideal.supplychain.ocp.beibei.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanzhaozhang
 * @date 2020/3/21
 * @description 贝贝详情返回实体类
 **/
public class BeibeiOrderDetailDto implements Serializable {
    private String oid;
    private String type;
    private String warehousing_type;
    private String user;
    private String nick;
    private String province;
    private String city;
    private String county;
    private String address;
    private String event_id;
    private String item_num;
    private String status;
    private String total_fee;
    private String shipping_fee;
    private String payment;
    private String invoice_type;
    private String invoice_name;
    private String discount;
    private String member_card;
    private String seller_remark;
    private String remark;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_address;
    private String company;
    private String out_sid;
    private String channel_name;
    private String channel_info;
    private String create_time;
    private String pay_time;
    private String ship_time;
    private String end_time;
    private String modified_time;
    private String tax_fee;
    private String tariff_fee;
    private String addedvalue_fee;
    private String consump_fee;
    private String user_name;
    private String user_member_card;
    private MemberCardImgs member_card_imgs;
    private List<BeibeiOrderItemDto> item;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWarehousing_type() {
        return warehousing_type;
    }

    public void setWarehousing_type(String warehousing_type) {
        this.warehousing_type = warehousing_type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getItem_num() {
        return item_num;
    }

    public void setItem_num(String item_num) {
        this.item_num = item_num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(String shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(String invoice_type) {
        this.invoice_type = invoice_type;
    }

    public String getInvoice_name() {
        return invoice_name;
    }

    public void setInvoice_name(String invoice_name) {
        this.invoice_name = invoice_name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMember_card() {
        return member_card;
    }

    public void setMember_card(String member_card) {
        this.member_card = member_card;
    }

    public String getSeller_remark() {
        return seller_remark;
    }

    public void setSeller_remark(String seller_remark) {
        this.seller_remark = seller_remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOut_sid() {
        return out_sid;
    }

    public void setOut_sid(String out_sid) {
        this.out_sid = out_sid;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getChannel_info() {
        return channel_info;
    }

    public void setChannel_info(String channel_info) {
        this.channel_info = channel_info;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getShip_time() {
        return ship_time;
    }

    public void setShip_time(String ship_time) {
        this.ship_time = ship_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }

    public String getTax_fee() {
        return tax_fee;
    }

    public void setTax_fee(String tax_fee) {
        this.tax_fee = tax_fee;
    }

    public String getTariff_fee() {
        return tariff_fee;
    }

    public void setTariff_fee(String tariff_fee) {
        this.tariff_fee = tariff_fee;
    }

    public String getAddedvalue_fee() {
        return addedvalue_fee;
    }

    public void setAddedvalue_fee(String addedvalue_fee) {
        this.addedvalue_fee = addedvalue_fee;
    }

    public String getConsump_fee() {
        return consump_fee;
    }

    public void setConsump_fee(String consump_fee) {
        this.consump_fee = consump_fee;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_member_card() {
        return user_member_card;
    }

    public void setUser_member_card(String user_member_card) {
        this.user_member_card = user_member_card;
    }

    public MemberCardImgs getMember_card_imgs() {
        return member_card_imgs;
    }

    public void setMember_card_imgs(
            MemberCardImgs member_card_imgs) {
        this.member_card_imgs = member_card_imgs;
    }

    public List<BeibeiOrderItemDto> getItem() {
        return item;
    }

    public void setItem(List<BeibeiOrderItemDto> item) {
        this.item = item;
    }

    public static class MemberCardImgs {

        private String front_img;
        private String back_img;

        public String getFront_img() {
            return front_img;
        }

        public void setFront_img(String front_img) {
            this.front_img = front_img;
        }

        public String getBack_img() {
            return back_img;
        }

        public void setBack_img(String back_img) {
            this.back_img = back_img;
        }
    }
}
