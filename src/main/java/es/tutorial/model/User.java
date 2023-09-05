package es.tutorial.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.WriteTypeHint;

/**
 * @author star.lee
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName ="user", writeTypeHint = WriteTypeHint.FALSE)
public class User {

    @Schema(hidden = true)
    @Id
    private String id;

    @Field(store = true, type = FieldType.Text)
    private String name;

    @Field(store = true, type = FieldType.Text)
    private String introduction;

    @Field(store = true, type = FieldType.Long)
    private long createTime;

}
