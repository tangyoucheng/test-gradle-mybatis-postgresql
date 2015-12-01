package sample.mapper;

import java.util.List;
import sample.model.UserInfo;
import sample.model.UserInfoExample;
import sample.model.UserInfoKey;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    int deleteByPrimaryKey(UserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    UserInfo selectByPrimaryKey(UserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_info
     *
     * @mbggenerated Tue Dec 01 21:08:33 JST 2015
     */
    int updateByPrimaryKey(UserInfo record);
    
    /**
     *  テーブルデータを全件取得する
     */
    List<UserInfo> getAll();
    
    /**
     *  データを１件挿入する
     */
    int insertOne(UserInfo record);
    
    /**
     *  ログインIDからユーザー情報を取得する
     */
    UserInfo selectByLoginId(String loginId);
}