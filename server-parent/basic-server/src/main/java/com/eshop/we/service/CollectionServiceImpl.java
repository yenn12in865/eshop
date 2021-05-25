package sharebooks.serviceImpl;

import sharebooks.entity.Collection;
import sharebooks.mapper.CollectionMapper;
import sharebooks.service.CollectionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户书籍收藏表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements CollectionService {

}
