package sample.model;

public class ItemInfo extends ItemInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item_info.name
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item_info.price
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item_info.postage
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    private Integer postage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item_info.stock
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    private Integer stock;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item_info.name
     *
     * @return the value of public.item_info.name
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item_info.name
     *
     * @param name the value for public.item_info.name
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item_info.price
     *
     * @return the value of public.item_info.price
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item_info.price
     *
     * @param price the value for public.item_info.price
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item_info.postage
     *
     * @return the value of public.item_info.postage
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item_info.postage
     *
     * @param postage the value for public.item_info.postage
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item_info.stock
     *
     * @return the value of public.item_info.stock
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item_info.stock
     *
     * @param stock the value for public.item_info.stock
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}