package behavioral.observer;

import java.util.Date;

public class Message {
    private String detail;
    private Date createdDate;
    private String topic;

    public Message(String detail, Date createdDate, String topic) {
        this.detail = detail;
        this.createdDate = createdDate;
        this.topic = topic;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
