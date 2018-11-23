package resource_proxy_demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import resource_proxy_demo.model.RmResourceNodeT;
import resource_proxy_demo.model.RmResourceNodeTExample;

public interface RmResourceNodeTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    long countByExample(RmResourceNodeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int deleteByExample(RmResourceNodeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insert(RmResourceNodeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insertSelective(RmResourceNodeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    List<RmResourceNodeT> selectByExample(RmResourceNodeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") RmResourceNodeT record, @Param("example") RmResourceNodeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_node_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExample(@Param("record") RmResourceNodeT record, @Param("example") RmResourceNodeTExample example);
}