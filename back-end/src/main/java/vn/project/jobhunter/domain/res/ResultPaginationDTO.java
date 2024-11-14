package vn.project.jobhunter.domain.res;

import lombok.Data;

@Data
public class ResultPaginationDTO {
    private Meta meta;
    private Object result;
}
