package sharebooks.serviceImpl;

import sharebooks.entity.Book;
import sharebooks.mapper.BookMapper;
import sharebooks.service.BookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书籍表 服务实现类
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
