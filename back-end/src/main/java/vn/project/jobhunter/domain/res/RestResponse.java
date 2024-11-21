package vn.project.jobhunter.domain.res;

import lombok.Data;

@Data
public class RestResponse<T> {
    private int statusCode;
    private String error;
    // message có thể là string, hoặc arrayList
    private Object message;
    private T data;

}
