package apps.me;

import dto.UserCommentDetailDto;
import entityservice.ProductCommentEntityService;
import java.util.List;


public class FindByUserIdApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<UserCommentDetailDto> userCommentDetailDtoList = productCommentEntityService.findAllCommentByUserId(7L);

        if (userCommentDetailDtoList.isEmpty()) {
            System.out.println("Any comment was not found for this user.");
        }

        for (UserCommentDetailDto userCommentDetailDto : userCommentDetailDtoList) {
            System.out.println(userCommentDetailDto);
        }
    }
}
