package resource_proxy_demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resource_proxy_demo.dao.RmResourceInstanceTMapper;
import resource_proxy_demo.dao.impl.RmResourceGroupTDaoImpl;
import resource_proxy_demo.dao.impl.RmResourceNodeTDaoImpl;
import resource_proxy_demo.entity.Node;
import resource_proxy_demo.entity.ResourceInstanceGroup;
import resource_proxy_demo.model.RmResourceGroupT;
import resource_proxy_demo.model.RmResourceNodeT;
import resource_proxy_demo.service.ResourceInstanceGroupApi;
import resource_proxy_demo.util.NodeUtil;
import resource_proxy_demo.util.ResourceGroupUtil;

/**
 * 资源组服务Service类
 * @author m
 *
 */
@Service
public class ResourceInstanceGroupService implements ResourceInstanceGroupApi{

	@Autowired
	private RmResourceNodeTDaoImpl nodeDao;
	@Autowired
	private RmResourceGroupTDaoImpl groupDao;
	
	
	@Override
	public ResourceInstanceGroup loadResourceGroup(int groupId) {
		
		RmResourceGroupT group=groupDao.selectById(groupId);

		ResourceInstanceGroup grp=ResourceGroupUtil.parseFrom(group);

		if(grp!=null) {
			loadChildren(grp.getRoot());
		}
		
		//需要添加判断Root不为null
		return grp;
	}

	
	/**
	 * 
	 * jackson解析会出现字段值错位!!!
	 * 
	 * 加载node的子集
	 * @param node
	 */
	public void loadChildren(Node node) {
		
		if(node!=null) {
			System.out.println("node-id:"+node.getId());
			//List<Node> nodes=node.getChildren();
			List<RmResourceNodeT> rmNodes=nodeDao.getChildren(node.getId());
			
			if(rmNodes!=null && rmNodes.size()>0) {
				node.setChildren(new ArrayList<>());
				for(RmResourceNodeT n:rmNodes) {
					Node nn=NodeUtil.parseRmResourceNodeT(n);
					//load from DB
					System.out.println("nn-id:"+nn.getId());
					node.putChild(nn);
					loadChildren(nn);
					
				}
			}
			
		}return ;
		
	}


	@Override
	public void appendChildToNode(Node child, Node parent) {
		// TODO Auto-generated method stub
		if(parent.getChildren()==null) parent.setChildren(new ArrayList<>());
		if(parent.getChildren().size()>0) {
			for(Node n:(List<Node>)parent.getChildren()) {
				if(n.getId()==child.getId()) return;
			}
		}
		
		parent.getChildren().add(child);
	}

	/**
	 * 删除子树
	 */
	@Override
	public void removeSubTree(Node node) {
		// TODO Auto-generated method stub

		if(node!=null) {
			//load children from DB
			List<RmResourceNodeT> nodes=nodeDao.getChildren(node.getId());

			if(nodes!=null && nodes.size()>0) {
				for(RmResourceNodeT n:nodes) {
					Node nn=NodeUtil.parseRmResourceNodeT(n);
					//del from view
					node.removeChild(nn);
					removeSubTree(nn);
				}
			}
			//del from DB
			nodeDao.delById(node.getId());
		}
	}


	@Override
	public void updateNode(Node node) {
		// TODO Auto-generated method stub
		RmResourceNodeT rmNode=NodeUtil.toModel(node);
		nodeDao.update(rmNode);
	}


	@Override
	public void getNodeDetailInfo(Node node) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add(ResourceInstanceGroup t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void del(ResourceInstanceGroup t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(ResourceInstanceGroup t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<ResourceInstanceGroup> find(ResourceInstanceGroup t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResourceInstanceGroup findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
