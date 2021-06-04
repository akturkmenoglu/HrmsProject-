package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.dataAccess.IJobPositionsDao;

@Service
public class JobPositionsManager implements IJobPositionsService{
	
	private IJobPositionsDao iJobPositionsDao;
	
	
	@Autowired
	public JobPositionsManager(IJobPositionsDao iJobPositionsDao) {
		super();
		this.iJobPositionsDao = iJobPositionsDao;
	}

	@Override
	public List<JobPositions> getAll() {
		return IJobPositionsDao.findAll();
	}
}