package com.anacarolina.workshopmongo.domain;

import com.anacarolina.workshopmongo.dto.AuthorDTO;
import com.anacarolina.workshopmongo.dto.CommentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document(collection = "posts")
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date data;
    private String title;
    private String body;
    private AuthorDTO author;

    public Post() {
    }

    private List<CommentDTO> comments = new ArrayList<>();

    public Post(String id, Date data, String title, String body, AuthorDTO author) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.body = body;
        this.author = author;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
