package vn.project.jobhunter.domain.res;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import vn.project.jobhunter.domain.model.Meta;

@Data
public class ResultPaginationDTO {
    private Meta meta;
    private Object result;

    @Getter
    @Setter
    public static class Meta {
        private int page;
        private int pageSize;
        private int pages;
        private long total;
    }
}
