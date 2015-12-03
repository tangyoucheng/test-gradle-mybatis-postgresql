package sample.mapper;

import java.util.List;
import sample.model.ItemInfo;
import sample.model.ItemInfoExample;
import sample.model.ItemInfoKey;

public interface ItemInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    int deleteByPrimaryKey(ItemInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    int insert(ItemInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    int insertSelective(ItemInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    List<ItemInfo> selectByExample(ItemInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    ItemInfo selectByPrimaryKey(ItemInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    int updateByPrimaryKeySelective(ItemInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item_info
     *
     * @mbggenerated Thu Dec 03 16:16:47 JST 2015
     */
    int updateByPrimaryKey(ItemInfo record);
}