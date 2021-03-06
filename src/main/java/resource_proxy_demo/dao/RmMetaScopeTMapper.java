package resource_proxy_demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import resource_proxy_demo.model.RmMetaScopeT;
import resource_proxy_demo.model.RmMetaScopeTExample;

public interface RmMetaScopeTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    long countByExample(RmMetaScopeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int deleteByExample(RmMetaScopeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insert(RmMetaScopeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insertSelective(RmMetaScopeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    List<RmMetaScopeT> selectByExample(RmMetaScopeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") RmMetaScopeT record, @Param("example") RmMetaScopeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_meta_scope_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExample(@Param("record") RmMetaScopeT record, @Param("example") RmMetaScopeTExample example);
}