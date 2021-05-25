package sharebooks.serviceImpl;

import sharebooks.entity.Area;
import sharebooks.mapper.AreaMapper;
import sharebooks.service.AreaService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 省市县区表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements AreaService {

}
