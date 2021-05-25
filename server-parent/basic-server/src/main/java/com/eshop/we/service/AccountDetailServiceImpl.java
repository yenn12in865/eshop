package sharebooks.serviceImpl;

import sharebooks.entity.AccountDetail;
import sharebooks.mapper.AccountDetailMapper;
import sharebooks.service.AccountDetailService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class AccountDetailServiceImpl extends ServiceImpl<AccountDetailMapper, AccountDetail> implements AccountDetailService {

}
