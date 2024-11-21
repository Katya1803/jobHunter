package vn.project.jobhunter.domain.res.user;

import lombok.Data;
import vn.project.jobhunter.util.enumerates.GenderEnum;
import java.time.Instant;

@Data
public class ResCreateUserDTO {
    private long id;
    private String name;
    private String email;
    private GenderEnum gender;
    private String address;
    private int age;
    private Instant createdAt;
    private CompanyUser company;

    @Data
    public static class CompanyUser {
        private long id;
        private String name;
    }
}
