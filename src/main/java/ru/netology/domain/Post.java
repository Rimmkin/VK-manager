package ru.netology.domain;

public class Post {
    private int id;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private int numberOfWatched;
    private String date;
    private String nameOfPublic;
    private PostSource postSource;
    public boolean pinned;
    private boolean favorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getNumberOfWatched() {
        return numberOfWatched;
    }

    public void setNumberOfWatched(int numberOfWatched) {
        this.numberOfWatched = numberOfWatched;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameOfPublic() {
        return nameOfPublic;
    }

    public void setNameOfPublic(String nameOfPublic) {
        this.nameOfPublic = nameOfPublic;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }


    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}