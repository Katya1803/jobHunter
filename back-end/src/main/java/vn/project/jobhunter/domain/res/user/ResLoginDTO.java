package vn.project.jobhunter.domain.res.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import vn.project.jobhunter.domain.model.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResLoginDTO {
    @JsonProperty("access_token")
    private String accessToken;

    private UserLogin user;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class UserLogin {
        private long id;
        private String email;
        private String name;
        private Role role;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserGetAccount {
        private UserLogin user;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserInsideToken {
        private long id;
        private String email;
        private String name;
    }

}
