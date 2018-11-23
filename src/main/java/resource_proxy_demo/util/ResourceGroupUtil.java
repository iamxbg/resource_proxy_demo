package resource_proxy_demo.util;

import resource_proxy_demo.entity.ResourceGroupType;
import resource_proxy_demo.entity.ResourceInstanceGroup;
import resource_proxy_demo.model.RmResourceGroupT;


//TODO：后续改进mybatis，将多个类合并为一个实体类;或者使用hibernate，方便管理！
/**
 * ResourceGroup的javaBean和model的转换工具类
 * @author m
 *
 */
public class ResourceGroupUtil {

	public static RmResourceGroupT toModel(ResourceInstanceGroup group) {
		RmResourceGroupT rg=new RmResourceGroupT();
			rg.setGroupTypeId(group.getType().getIndex());
			rg.setId(group.getId());
			rg.setName(group.getName());
		return rg;
	}
	
	public static ResourceInstanceGroup parseFrom(RmResourceGroupT group) {
		ResourceInstanceGroup rg=new ResourceInstanceGroup();
			rg.setId(group.getId());
			rg.setName(group.getName());
			rg.setType(ResourceGroupType.getByIndex(group.getId()));
		return rg;
	}
	
}
