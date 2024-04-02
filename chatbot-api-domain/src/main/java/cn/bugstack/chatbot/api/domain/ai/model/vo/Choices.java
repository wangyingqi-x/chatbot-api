package cn.bugstack.chatbot.api.domain.ai.model.vo;

import lombok.Data;

/**
 * @author : wyq
 */
@Data
public class Choices {

    private String text;

    private int index;

    private String logprobs;

    private String finish_reason;


}
