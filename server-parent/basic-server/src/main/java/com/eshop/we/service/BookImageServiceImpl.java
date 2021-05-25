package sharebooks.serviceImpl;

import sharebooks.entity.BookImage;
import sharebooks.mapper.BookImageMapper;
import sharebooks.service.BookImageService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书籍照片 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class BookImageServiceImpl extends ServiceImpl<BookImageMapper, BookImage> implements BookImageService {

}
