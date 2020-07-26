package com.interview.test.examples;

public class LineAttribs implements Comparable<LineAttribs> {
    private Integer length;
    private String content;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int compareTo(LineAttribs o) {
        return this.length - o.length;
    }
}
