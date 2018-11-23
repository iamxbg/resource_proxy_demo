package resource_proxy_demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import resource_proxy_demo.dao.CRUDDao;
import resource_proxy_demo.dao.RmResourceGroupTMapper;
import resource_proxy_demo.model.RmResourceGroupT;
import resource_proxy_demo.model.RmResourceGroupTExample;

@Repository
public class RmResourceGroupTDaoImpl implements CRUDDao<RmResourceGroupT>{

	@Autowired
	private RmResourceGroupTMapper groupMapper;
	
	@Override
	public RmResourceGroupT selectById(int id) {
		// TODO Auto-generated method stub
		RmResourceGroupTExample exm=new RmResourceGroupTExample();
			exm.setDistinct(true);
			exm.createCriteria().andIdEqualTo(id);
			
		List<RmResourceGroupT> groupList=groupMapper.selectByExample(exm);
		if(groupList!=null && groupList.size()>0) 
				return groupList.get(0);
		else return null;
	}

	@Override
	public void delById(int id) {
		// TODO Auto-generated method stub
		RmResourceGroupTExample exm=new RmResourceGroupTExample();
			exm.setDistinct(true);
			exm.createCriteria().andIdEqualTo(id);
		groupMapper.deleteByExample(exm);
	}

	@Override
	public void update(RmResourceGroupT t) {
		// TODO Auto-generated method stub
		RmResourceGroupTExample exm=new RmResourceGroupTExample();
			exm.setDistinct(true);
			exm.createCriteria().andIdEqualTo(t.getId());
		groupMapper.updateByExample(t, exm);
	}

	@Override
	public void add(RmResourceGroupT t) {
		// TODO Auto-generated method stub
		groupMapper.insert(t);
	}

}
