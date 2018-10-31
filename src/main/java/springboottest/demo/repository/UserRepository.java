package springboottest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import springboottest.demo.vo.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    //由于spring Data JPA已经帮助用户做了实现，因此，用户不需要做任何实现，
    // 甚至都无需再userRepository中定义任何方法

//    User saveOrUpdateUser(User user);// 新增或修改用户
//
//    void deleteUser(Long id);// 删除用户
//
//    User getUserById(Long id);// 根据用户id获取用户
//
//    List<User> userList();// 获取所有用户列表
}
