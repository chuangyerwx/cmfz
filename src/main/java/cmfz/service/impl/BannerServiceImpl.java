package cmfz.service.impl;

import cmfz.dao.BannerDao;
import cmfz.entity.Banner;
import cmfz.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
@Service
@Transactional  //
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bd;

    @Override
    public List<Banner> selectByPage(int rows,int page) {

        return bd.selectByPage(rows,page);
    }

    @Override
    public int selectCount() {

        return bd.selectCount();
    }

    @Override
    public void insert(Banner b) {
        bd.insert(b);
    }

    @Override
    public void delete(int id) {
        bd.delete(id);
    }

    @Override
    public void update(int id,int status) {
        bd.update(id,status);
    }


}
