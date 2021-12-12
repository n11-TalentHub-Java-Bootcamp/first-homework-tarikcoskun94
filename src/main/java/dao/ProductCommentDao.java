package dao;

import base.BaseDao;
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
}
