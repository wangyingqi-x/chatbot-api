package cn.bugstack.chatbot.api.domain.ai.model.aggregates;

import cn.bugstack.chatbot.api.domain.ai.model.vo.Choices;
import lombok.Data;

import java.util.List;

/**
 * @author : wyq
 */
@Data
public class AIAnswer {

    private String id;

    private String object;

    private int created;

    private String model;

    private List<Choices> choices;



}
