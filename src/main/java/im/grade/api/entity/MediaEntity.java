package im.grade.api.entity;


import im.grade.api.type.MediaType;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "tbl_media")
public class MediaEntity extends _BaseEntity {

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID boardId;

    @Enumerated(EnumType.STRING)
    @Column
    private MediaType mediaType;

    @Column(length = 2000, nullable = false)
    private String url;

}