package com.last.code.dto;

import com.last.code.model.FeedEntity;
import com.last.code.model.ReplyEntity;
import com.last.code.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReplyDTO {

    private Long replyPno;
    private FeedEntity replyFeedFno;
    private UserEntity replyUserFno;
    private LocalDate replyDate;
    private String replyContent;


    public ReplyDTO(ReplyEntity ntt) {
        this.replyPno = ntt.getReplyPno();
        this.replyFeedFno = ntt.getReplyFeedFno();
        this.replyUserFno = ntt.getReplyUserFno();
        this.replyDate = ntt.getReplyDate();
        this.replyContent = ntt.getReplyContent();
    }

    public ReplyEntity toEntity(ReplyDTO dto) {
        return ReplyEntity.builder()
                .replyPno(dto.getReplyPno())
                .replyFeedFno(dto.getReplyFeedFno())
                .replyUserFno(dto.getReplyUserFno())
                .replyDate(dto.getReplyDate())
                .replyContent(dto.getReplyContent())
                .build();
    }
}
