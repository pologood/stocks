package com.michael.stock.stock.bo;

import com.michael.core.hibernate.criteria.BO;
import com.michael.core.hibernate.criteria.Condition;
import com.michael.core.hibernate.criteria.MatchModel;

import java.util.Date;

/**
 * @author Michael
 */
public class StockDayBo implements BO {
    // 股票代码
    @Condition
    private String code;

    // 股票名称
    @Condition
    private String name;

    @Condition
    private Date businessDate;
    @Condition(matchMode = MatchModel.GE, target = "businessDate")
    private Date businessDateGe;
    @Condition(matchMode = MatchModel.LT, target = "businessDate")
    private Date businessDateLt;
    // 代码
    @Condition
    private String key;
    @Condition
    private String key3;

    @Condition(matchMode = MatchModel.GT, target = "seq")
    private Integer seqGt;

    public Integer getSeqGt() {
        return seqGt;
    }

    public void setSeqGt(Integer seqGt) {
        this.seqGt = seqGt;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public Date getBusinessDateGe() {
        return businessDateGe;
    }

    public void setBusinessDateGe(Date businessDateGe) {
        this.businessDateGe = businessDateGe;
    }

    public Date getBusinessDateLt() {
        return businessDateLt;
    }

    public void setBusinessDateLt(Date businessDateLt) {
        this.businessDateLt = businessDateLt;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
