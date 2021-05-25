package sharebooks.serviceImpl;

import sharebooks.entity.LeaseOrder;
import sharebooks.mapper.LeaseOrderMapper;
import sharebooks.service.LeaseOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出租订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class LeaseOrderServiceImpl extends ServiceImpl<LeaseOrderMapper, LeaseOrder> implements LeaseOrderService {

}
