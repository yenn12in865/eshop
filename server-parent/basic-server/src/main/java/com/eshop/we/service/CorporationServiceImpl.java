package sharebooks.serviceImpl;

import sharebooks.entity.Corporation;
import sharebooks.mapper.CorporationMapper;
import sharebooks.service.CorporationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 社团 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class CorporationServiceImpl extends ServiceImpl<CorporationMapper, Corporation> implements CorporationService {

}
