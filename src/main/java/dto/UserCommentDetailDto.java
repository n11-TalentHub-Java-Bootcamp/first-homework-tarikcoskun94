package dto;

import java.util.Date;


public class UserCommentDetailDto {

    private Long userId;
    private String userName;
    private String productName;
    private String productCommentText;
    private Date productCommentCreationDate;

    public UserCommentDetailDto(Long userId, String userName, String productName, String productCommentText, Date productCommentCreationDate) {
        this.userId = userId;
        this.userName = userName;
        this.productName = productName;
        this.productCommentText = productCommentText;
        this.productCommentCreationDate = productCommentCreationDate;
    }

    @Override
    public String toString() {
        return "UserCommentDetailDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", productCommentText='" + productCommentText + '\'' +
                ", productCommentCreationDate='" + productCommentCreationDate + '\'' +
                '}';
    }
}
