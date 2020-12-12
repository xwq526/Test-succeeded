package com.xwq.model;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-09
 * Time: 09:34:45
 */
public class Message {
    public int id;
    public String who;
    public String when;
    public String what;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", who='" + who + '\'' +
                ", when='" + when + '\'' +
                ", what='" + what + '\'' +
                '}';
    }
}
