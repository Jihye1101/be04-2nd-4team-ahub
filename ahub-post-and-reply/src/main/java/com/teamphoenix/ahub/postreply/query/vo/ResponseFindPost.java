package com.teamphoenix.ahub.postreply.query.vo;


import com.teamphoenix.ahub.postreply.query.dto.PostDTO;

public class ResponseFindPost {

    private String code;
    private String message;
    private String url;
    private PostDTO result;

    public ResponseFindPost() {
    }

    public ResponseFindPost(String code, String message, String url, PostDTO result) {
        this.code = code;
        this.message = message;
        this.url = url;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PostDTO getResult() {
        return result;
    }

    public void setResult(PostDTO result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseFindPost{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", result=" + result +
                '}';
    }
}
