package demo.service.user;

import demo.model.User;
import demo.service.IService;

public interface IUserService extends IService<User> {
    User getUserByEmail(String email);
}
