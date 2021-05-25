package sharebooks.serviceImpl;

import sharebooks.entity.Sales;
import sharebooks.mapper.SalesMapper;
import sharebooks.service.SalesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出售信息 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class SalesServiceImpl extends ServiceImpl<SalesMapper, Sales> implements SalesService {

}
