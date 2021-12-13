package dto;

import java.math.BigDecimal;


public class ProductCommentCountDto {

    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long productCommentCount;

    public ProductCommentCountDto() {
    }

    public ProductCommentCountDto(Long productId, String productName, BigDecimal productPrice, Long productCommentCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCommentCount = productCommentCount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Long getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Long productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    @Override
    public String toString() {
        return "ProductCommentCountDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCommentCount=" + productCommentCount +
                '}';
    }
}
