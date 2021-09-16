package mdl.interbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mdl.interbank.entity.LogMDL;
import mdl.interbank.repository.LogMdDLRepository;

@Service
public class LogMDLServiceImpl implements LogMDLService {

	@Autowired
	private LogMdDLRepository repo;

	@Override
	public LogMDL save(LogMDL logmdl) {
		return repo.save(logmdl);
	}

}
