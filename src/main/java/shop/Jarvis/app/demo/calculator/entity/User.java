package shop.Jarvis.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    private String name;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "회원명세{" +
                "아이디='" + userId + '\'' +
                ", 이름='" + name + '\'' +
                ", 비밀번호='" + password + '\'' +
                ", 이메일='" + email + '\'' +
                '}';
    }
}
