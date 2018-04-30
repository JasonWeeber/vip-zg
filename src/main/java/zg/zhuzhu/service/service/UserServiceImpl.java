package zg.zhuzhu.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zg.zhuzhu.dao.mapper.ZgUserMapper;
import zg.zhuzhu.dao.model.ZgUser;
import zg.zhuzhu.dao.model.ZgUserExample;
import zg.zhuzhu.service.service.api.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private ZgUserMapper zgUserMapper;

	@Override
	public List<ZgUser> queryAll() {
		ZgUserExample example = new ZgUserExample();
		return zgUserMapper.selectByExample(example);
	}

}
