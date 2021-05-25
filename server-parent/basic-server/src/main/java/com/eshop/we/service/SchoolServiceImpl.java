package sharebooks.serviceImpl;

import sharebooks.entity.School;
import sharebooks.mapper.SchoolMapper;
import sharebooks.service.SchoolService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学校 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {

}
