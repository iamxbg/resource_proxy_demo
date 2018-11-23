package resource_proxy_demo.service;

/**
 * 资源监控的API
 * @author m
 *
 */
public interface ResourceInstanceMonitorApi {
	
	/**
	 * 从监控列表中删除，不再对资源进行代理采集
	 */
	public void delFromMonitored();
	
	/**
	 * 添加到监控列表
	 */
	public void addToMonitor();
	
	
}
