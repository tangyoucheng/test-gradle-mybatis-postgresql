package sample.mapper;

import java.util.List;
import sample.model.BuyingHistory;
import sample.model.BuyingHistoryExample;
import sample.model.BuyingHistoryKey;

public interface BuyingHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    int deleteByPrimaryKey(BuyingHistoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    int insert(BuyingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    int insertSelective(BuyingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    List<BuyingHistory> selectByExample(BuyingHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    BuyingHistory selectByPrimaryKey(BuyingHistoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    int updateByPrimaryKeySelective(BuyingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.buying_history
     *
     * @mbggenerated Wed Dec 02 16:57:06 JST 2015
     */
    int updateByPrimaryKey(BuyingHistory record);
}