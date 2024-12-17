package Message;
import Content.Content;
import User.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message extends Content {
    private int conversationId;

    public Message(int id, String content, int conversationId, int userid) {
        super(id, content,userid);
        this.conversationId = conversationId;
    }

    public int getConversationId() {
        return conversationId;
    }

    public void setConversationId(int conversationId) {
        this.conversationId = conversationId;
    // Method to format and display the date and time
    public String getFormattedTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(timestamp);
    }

    public String toString() {
        return
                "\n Message From:'" + get.username() + '\'' +
                        "\n Message:'" + content + '\'' +
                        "\n Date/time:" + getFormattedTimestamp() + "\nMessageId:" + messageId +' ' ;
    }
}
