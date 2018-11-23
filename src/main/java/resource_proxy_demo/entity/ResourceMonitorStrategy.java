package resource_proxy_demo.entity;

/**
 * 资源监控策略
 * 	
 * 	 	该类的设计目的是设置资源监控的策略
 * 		策略并不单独绑定到某个资源类型,资源组,或单个资源
 * 		但是,可以将它绑定到特定类型上
 * 
 * 		TODO:资源设置完成之后,应该进行自动测试,
 * 			如果测试通过,返回正确信息
 * 			如果测试失败,返回错误信息,并简要分析!
 * 
 * 		TODO:如果定义了两个策略，可能存在同一个策略冲突的情况，
 * 			那么如何避免策略冲突情况?
 * 						
 * 			不同请求策略比如对应不同的采集频率，那么请求的时间频率就是不同的！
 * 			*** 告警策略又是另外一回事了！
 * @author m
 *
 */

public class ResourceMonitorStrategy {
	
	public enum StrategyScope{
		
			TO_TYPE("资源类型",1),TO_GROUP("资源组",2),TO_DOMAIN("域",3),TO_INSTANCE("实例",4);
			
			private String name;
			private int index;
		
			private  StrategyScope(String name,int index) {
				this.name=name;
				this.index=index;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getIndex() {
				return index;
			}

			public void setIndex(int index) {
				this.index = index;
			}
			
			
	}

	private StrategyScope scope;
	
	//TODO:对于不同Scope的Strategy如何传递不同的值?
	
	//对应四种不同的监控策略
	private int[] instanceIds;
	private String domainIp;
	private int groupId;
	private int resourceTypeId;
	
	
	
	
	public StrategyScope getScope() {
		return scope;
	}
	public void setScope(StrategyScope scope) {
		this.scope = scope;
	}
	public int[] getInstanceIds() {
		return instanceIds;
	}
	public void setInstanceIds(int[] instanceIds) {
		this.instanceIds = instanceIds;
	}
	public String getDomainIp() {
		return domainIp;
	}
	public void setDomainIp(String domainIp) {
		this.domainIp = domainIp;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getResourceTypeId() {
		return resourceTypeId;
	}
	public void setResourceTypeId(int resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}
	
	
	
}
