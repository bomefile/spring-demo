package com.example.spring.vo;

import lombok.Data;

import java.util.List;

/**
 * 参赛条件
 *
 * @author wangliangliang
 */
@Data
public class PkMatchJoinConditionVO {

    /**
     * 比赛前七天最低日均收益（选填）数字,
     */
    private Integer minIncomeFishPond;

    /**
     * 比赛前七天最少有效直播时长（选填）数字,
     */
    private Long minPlayTime;

    /**
     * 主播最低等级
     */
    private Integer anchorMinLevel;

    /**
     * 比赛场次id
     */
    private Long pkSessionId;

    private List list1;

}
