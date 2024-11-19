package vn.project.jobhunter.domain.res;

import lombok.Data;
import vn.project.jobhunter.domain.model.Meta;

@Data
public class ResultPaginationDTO {
    private Meta meta;
    private Object result;
}
