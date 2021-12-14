package dao;

import base.BaseDao;
import dto.ProductCommentCountDto;
import dto.UserCommentDetailDto;
import entity.ProductComment;
import org.hibernate.query.Query;
import java.util.List;


public class ProductCommentDao extends BaseDao {

    public List<ProductComment> findAllCommentByProductId(Long productId){

        String sql = "select productComment from ProductComment productComment where productComment.product.id = :productId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentCountDto> findAllProductWithCommentCount() {

        String sql = " select " +
                " new dto.ProductCommentCountDto( product.id, product.name, product.price, case when count(productComment.product.id)>0 then count(productComment.product.id) end) " +
                " from Product product" +
                " left outer join ProductComment productComment on product.id = productComment.product.id " +
                " group by product.id";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public List<UserCommentDetailDto> findAllCommentByUserId(Long userId){

        String sql = " select " +
                " new dto.UserCommentDetailDto( user.id, user.name, productComment.product.name, productComment.text, productComment.creationDate ) " +
                " from ProductComment productComment " +
                " left join User user on productComment.user.id = user.id " +
                " where user.id = :userId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);

        return query.list();
    }
}
