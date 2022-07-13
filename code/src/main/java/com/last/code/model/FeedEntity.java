package com.last.code.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="TBL_FEED")
@EntityListeners(AuditingEntityListener.class)
public class FeedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FEED_PNO", nullable = false)
    private Long feedPno;
    @Column(name = "FEED_CONTENT", length = 1000, nullable = false)
    private String feedContent;
    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "FEED_USER_FNO")
    private UserEntity feedUserFno;
    @CreatedDate
    @Column(name="FEED_DATE", nullable = false)
    private LocalDate feedDate;
    @Column(name = "FEED_FILE", length = 300)
    private String feedFile;
    @Column(name = "FEED_ALT", length = 200)
    private String feedAlt;
//    @OneToOne(cascade = )
//    @JoinColumn(name = "FEED_LIKE_FNO")
//    private LikeEntity feedLikeFno;


}

