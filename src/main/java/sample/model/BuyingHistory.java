package sample.model;

import java.util.Date;

public class BuyingHistory extends BuyingHistoryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.user_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.item_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private Integer itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.buying_count
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private Integer buyingCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.buying_date
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private Date buyingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.payment_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private String paymentMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.buying_history.delivery_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    private String deliveryMethod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.user_id
     *
     * @return the value of public.buying_history.user_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.user_id
     *
     * @param userId the value for public.buying_history.user_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.item_id
     *
     * @return the value of public.buying_history.item_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.item_id
     *
     * @param itemId the value for public.buying_history.item_id
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.buying_count
     *
     * @return the value of public.buying_history.buying_count
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public Integer getBuyingCount() {
        return buyingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.buying_count
     *
     * @param buyingCount the value for public.buying_history.buying_count
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setBuyingCount(Integer buyingCount) {
        this.buyingCount = buyingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.buying_date
     *
     * @return the value of public.buying_history.buying_date
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public Date getBuyingDate() {
        return buyingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.buying_date
     *
     * @param buyingDate the value for public.buying_history.buying_date
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setBuyingDate(Date buyingDate) {
        this.buyingDate = buyingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.payment_method
     *
     * @return the value of public.buying_history.payment_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.payment_method
     *
     * @param paymentMethod the value for public.buying_history.payment_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.buying_history.delivery_method
     *
     * @return the value of public.buying_history.delivery_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.buying_history.delivery_method
     *
     * @param deliveryMethod the value for public.buying_history.delivery_method
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod == null ? null : deliveryMethod.trim();
    }
}