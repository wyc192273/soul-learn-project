package learn.service;

import java.util.List;

import learn.bean.User;


/**
 * @author yuchen.wu
 * @date 2021-01-18
 */

public interface UserService {

    String getUser(Integer id);

    Object saveUser(User user);

    Object saveUserByIdAndName(Integer id, String name);

    Object findByIds(List<Integer> ids);

    Object replaceUser(int id, String name, User user);

}
