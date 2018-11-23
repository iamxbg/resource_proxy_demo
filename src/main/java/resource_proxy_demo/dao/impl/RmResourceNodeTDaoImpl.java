package resource_proxy_demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import resource_proxy_demo.dao.CRUDDao;
import resource_proxy_demo.dao.RmResourceNodeTMapper;
import resource_proxy_demo.model.RmResourceNodeT;
import resource_proxy_demo.model.RmResourceNodeTExample;

@Repository
public class RmResourceNodeTDaoImpl implements CRUDDao<RmResourceNodeT>{
	
	@Autowired
	private RmResourceNodeTMapper nodeMapper;
	

	public List<RmResourceNodeT> getChildren(int nodeId){	
		RmResourceNodeTExample exm=new RmResourceNodeTExample();
			exm.createCriteria().andParentIdEqualTo(nodeId);		
		return	nodeMapper.selectByExample(exm);
	}


	@Override
	public RmResourceNodeT selectById(int id) {
		// TODO Auto-generated method stub
		
		RmResourceNodeTExample exm=new RmResourceNodeTExample();
			exm.createCriteria().andIdEqualTo(id);
			exm.setDistinct(true);
		
		List<RmResourceNodeT> nodes= nodeMapper.selectByExample(exm);
		if(nodes!=null && nodes.size()>0) return nodes.get(0);
		return null;
	}


	@Override
	public void delById(int id) {
		// TODO Auto-generated method stub
		RmResourceNodeTExample exm=new RmResourceNodeTExample();
			exm.createCriteria().andIdEqualTo(id);
			exm.setDistinct(true);
			nodeMapper.deleteByExample(exm);
	}


	@Override
	public void update(RmResourceNodeT t) {
		// TODO Auto-generated method stub
		RmResourceNodeTExample exm=new RmResourceNodeTExample();
			exm.createCriteria().andIdEqualTo(t.getId());
			exm.setDistinct(true);
		nodeMapper.updateByExample(t, exm);
	}


	@Override
	public void add(RmResourceNodeT t) {
		// TODO Auto-generated method stub
		nodeMapper.insert(t);
	}
	
	
}
