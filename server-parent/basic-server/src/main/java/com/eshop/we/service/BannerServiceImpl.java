package sharebooks.serviceImpl;

import sharebooks.entity.Banner;
import sharebooks.mapper.BannerMapper;
import sharebooks.service.BannerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * banner表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

}
