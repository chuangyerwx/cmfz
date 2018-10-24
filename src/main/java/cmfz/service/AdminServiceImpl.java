package cmfz.service;

import cmfz.dao.AdminDao;
import cmfz.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/10/23.
 */

@Service
@Transactional  //
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao ad;

    @Override
    public Admin login(Admin a) {

        return ad.selectOne(a);
    }
}
