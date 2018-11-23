package resource_proxy_demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import resource_proxy_demo.dao.CRUDDao;
import resource_proxy_demo.dao.RmResourceInstanceTMapper;
import resource_proxy_demo.model.RmResourceInstanceT;
import resource_proxy_demo.model.RmResourceInstanceTExample;

@Repository
public class RmResourceInstanceTDaoImpl implements CRUDDao<RmResourceInstanceT>{

	@Autowired
	private RmResourceInstanceTMapper riMapper;
	
	@Override
	public RmResourceInstanceT selectById(int id) {
		// TODO Auto-generated method stub
		
		RmResourceInstanceTExample exm=new RmResourceInstanceTExample();
			exm.createCriteria().andIdEqualTo(id);
			exm.setDistinct(true);
		List<RmResourceInstanceT> riList=riMapper.selectByExample(exm);
		if(riList!=null && riList.size()>0) return riList.get(0);
		return null;
	}

	@Override
	public void delById(int id) {
		// TODO Auto-generated method stub
		RmResourceInstanceTExample exm=new RmResourceInstanceTExample();
			exm.createCriteria().andIdEqualTo(id);
			exm.setDistinct(true);
		riMapper.deleteByExample(exm);
	}

	@Override
	public void update(RmResourceInstanceT t) {
		// TODO Auto-generated method stub
		RmResourceInstanceTExample exm=new RmResourceInstanceTExample();
			exm.createCriteria().andIdEqualTo(t.getId());
			exm.setDistinct(true);
		riMapper.updateByExample(t, exm);
	}

	@Override
	public void add(RmResourceInstanceT t) {
		// TODO Auto-generated method stub
		riMapper.insert(t);
	}

}
