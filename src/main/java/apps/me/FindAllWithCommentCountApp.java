package apps.me;

import dto.ProductCommentCountDto;
import entityservice.ProductCommentEntityService;
import java.util.List;


public class FindAllWithCommentCountApp {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<ProductCommentCountDto> productCommentCountDtoList = productCommentEntityService.findAllProductWithCommentCount();

        for (ProductCommentCountDto productCommentCountDto : productCommentCountDtoList) {
            System.out.println(productCommentCountDto);
        }
    }
}
