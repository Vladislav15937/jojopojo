package web.servise;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserServise {

    @Transactional
    List<User> getAllPeople();

    @Transactional
    User personById(Long id);

    @Transactional
    User save(User user);

    @Transactional
    User update(User user);

    @Transactional
    void delete(Long id);
}
