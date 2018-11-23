package resource_proxy_demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import resource_proxy_demo.model.RmResourceMonitorT;
import resource_proxy_demo.model.RmResourceMonitorTExample;

public interface RmResourceMonitorTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    long countByExample(RmResourceMonitorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int deleteByExample(RmResourceMonitorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insert(RmResourceMonitorT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int insertSelective(RmResourceMonitorT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    List<RmResourceMonitorT> selectByExample(RmResourceMonitorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") RmResourceMonitorT record, @Param("example") RmResourceMonitorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rm_resource_monitor_t
     *
     * @mbg.generated Fri Nov 23 11:43:34 CST 2018
     */
    int updateByExample(@Param("record") RmResourceMonitorT record, @Param("example") RmResourceMonitorTExample example);
}