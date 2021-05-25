package sharebooks.serviceImpl;

import sharebooks.entity.ExchangeOrder;
import sharebooks.mapper.ExchangeOrderMapper;
import sharebooks.service.ExchangeOrderService;
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
public class ExchangeOrderServiceImpl extends ServiceImpl<ExchangeOrderMapper, ExchangeOrder> implements ExchangeOrderService {

}
