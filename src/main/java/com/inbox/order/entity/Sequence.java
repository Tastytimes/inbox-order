package com.inbox.order.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "sequence")
@Data
public class Sequence {
    @Id
    private Integer id;
    private int sequence;
}
