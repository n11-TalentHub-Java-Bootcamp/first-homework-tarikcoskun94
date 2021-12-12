package dto;

import java.math.BigDecimal;
import java.util.Date;


public class ProductCommentDetailDto {

    private String productName;
    private String categoryName;
    private BigDecimal productPrice;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userTelephoneNumber;
    private String productCommentText;
    private Date productCommentCreationDate;

    public ProductCommentDetailDto() {
    }

    public ProductCommentDetailDto(String productName, String categoryName, BigDecimal productPrice,
                                   String userName, String userSurname, String userEmail, String userTelephoneNumber,
                                   String productCommentText, Date productCommentCreationDate)
    {
        this.productName = productName;
        this.categoryName = categoryName;
        this.productPrice = productPrice;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userTelephoneNumber = userTelephoneNumber;
        this.productCommentText = productCommentText;
        this.productCommentCreationDate = productCommentCreationDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(String userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }

    public String getProductCommentText() {
        return productCommentText;
    }

    public void setProductCommentText(String productCommentText) {
        this.productCommentText = productCommentText;
    }

    public Date getProductCommentCreationDate() {
        return productCommentCreationDate;
    }

    public void setProductCommentCreationDate(Date productCommentCreationDate) {
        this.productCommentCreationDate = productCommentCreationDate;
    }

    @Override
    public String toString() {
        return "ProductCommentDetailDto{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", productPrice=" + productPrice +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTelephoneNumber='" + userTelephoneNumber + '\'' +
                ", productCommentText='" + productCommentText + '\'' +
                ", productCommentCreationDate='" + productCommentCreationDate + '\'' +
                '}';
    }
}
