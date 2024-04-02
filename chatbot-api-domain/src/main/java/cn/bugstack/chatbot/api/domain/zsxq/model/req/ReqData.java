package cn.bugstack.chatbot.api.domain.zsxq.model.req;

import lombok.Data;

/**
 * @author : wyq
 */
@Data
public class ReqData {

    private String text;
    //private String[] image_ids = new String[]{};
    private boolean silenced;

    public ReqData(String text, boolean silenced) {
        this.text = text;
        this.silenced = silenced;
    }

}
