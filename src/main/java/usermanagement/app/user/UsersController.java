package usermanagement.app.user;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/get-out/users")
@Slf4j
public class UsersController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<User> getAllUsers() {
    log.info("UM: Get all users");
    List<User> users = new ArrayList<>();
    users.add(User.builder().id(1L).email("mike@pearson.com").build());
    users.add(User.builder().id(2L).email("rachel@pearson.com").build());
    users.add(User.builder().id(3L).email("harvey@pearson.com").build());
    users.add(User.builder().id(4L).email("jessica@pearson.com").build());
    users.add(User.builder().id(5L).email("donna@pearson.com").build());
    users.add(User.builder().id(6L).email("louis@pearson.com").build());

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return users;
  }
}
