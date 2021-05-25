package sharebooks.serviceImpl;

import sharebooks.entity.Lease;
import sharebooks.mapper.LeaseMapper;
import sharebooks.service.LeaseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出租信息 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class LeaseServiceImpl extends ServiceImpl<LeaseMapper, Lease> implements LeaseService {

}
