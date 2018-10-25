package cmfz.service.impl;

import cmfz.dao.MenuDao;
import cmfz.entity.Menu;
import cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
@Service
@Transactional  //
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao md;

    @Override
    public List<Menu> selectAll() {

        return md.selectAll();
    }
}
