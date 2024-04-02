package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @author : wyq
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}
