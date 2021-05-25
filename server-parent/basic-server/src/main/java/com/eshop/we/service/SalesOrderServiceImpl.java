package sharebooks.serviceImpl;

import sharebooks.entity.SalesOrder;
import sharebooks.mapper.SalesOrderMapper;
import sharebooks.service.SalesOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出售订单 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class SalesOrderServiceImpl extends ServiceImpl<SalesOrderMapper, SalesOrder> implements SalesOrderService {

}
