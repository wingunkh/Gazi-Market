package capstone.capstone.domain;

import java.io.Serializable;

//기본키가 복합키인 클래의 @IDClass 어노테이션 사용을 위한 클래스
public class Posts_Picture implements Serializable {
    private Integer post_no;

    private String picture_location;
}
