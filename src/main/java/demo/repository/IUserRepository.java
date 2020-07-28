package demo.repository;

import demo.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.validation.constraints.NotEmpty;

public interface IUserRepository extends CrudRepository<User, Long> {
    User getUserByEmail(@NotEmpty String email);
}
