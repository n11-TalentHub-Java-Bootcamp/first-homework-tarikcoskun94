package entityservice;

import dao.ProductCommentDao;
import dto.ProductCommentCountDto;
import dto.ProductCommentDetailDto;
import dto.UserCommentDetailDto;
import entity.ProductComment;
import java.util.ArrayList;
import java.util.List;


public class ProductCommentEntityService {

    ProductCommentDao productCommentDao;

    public ProductCommentEntityService() {
        this.productCommentDao = new ProductCommentDao();
    }

    public List<ProductCommentDetailDto> findAllCommentByProductId(Long productId) {

        List<ProductCommentDetailDto> productCommentDetailDtoList = new ArrayList<>();
        List<ProductComment> productCommentList = productCommentDao.findAllCommentByProductId(productId);

        for (ProductComment productComment : productCommentList) {
            ProductCommentDetailDto productCommentDetailDto = new ProductCommentDetailDto();

            productCommentDetailDto.setProductName(productComment.getProduct().getName());
            productCommentDetailDto.setCategoryName(productComment.getProduct().getCategory().getName());
            productCommentDetailDto.setProductPrice(productComment.getProduct().getPrice());
            productCommentDetailDto.setUserName(productComment.getUser().getName());
            productCommentDetailDto.setUserSurname(productComment.getUser().getSurname());
            productCommentDetailDto.setUserEmail(productComment.getUser().getEmail());
            productCommentDetailDto.setUserTelephoneNumber(productComment.getUser().getTelephoneNumber());
            productCommentDetailDto.setProductCommentText(productComment.getText());
            productCommentDetailDto.setProductCommentCreationDate(productComment.getCreationDate());

            productCommentDetailDtoList.add(productCommentDetailDto);
        }

        return productCommentDetailDtoList;
    }

    public List<ProductCommentCountDto> findAllProductWithCommentCount() {

        return productCommentDao.findAllProductWithCommentCount();
    }

    public List<UserCommentDetailDto> findAllCommentByUserId(Long userId){

        return productCommentDao.findAllCommentByUserId(userId);
    }
}
