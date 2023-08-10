package es.tutorial.domain.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author star.lee
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String code;
    private String msg;
    private Object data;
}
