package cn.bugstack.chatbot.api.domain.zsxq.model.aggregates;

import cn.bugstack.chatbot.api.domain.zsxq.model.res.RespData;
import lombok.Data;

/**
 * @author : wyq
 */
@Data
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;


}
