package com.zj.community.dto;

import com.zj.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {

    private Integer id;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private String description;
    private User user;
}
