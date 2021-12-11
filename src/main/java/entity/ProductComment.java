package entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "PRODUCT_COMMENTS")
public class ProductComment {

    @SequenceGenerator(name = "generator", sequenceName = "product_comment_id_seq")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 500, name = "text", nullable = false)
    private String text;

    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product",
            foreignKey = @ForeignKey(name = "fk_comment_product_id")
    )
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user",
            foreignKey = @ForeignKey(name = "fk_comment_user_id")
    )
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", creationDate=" + creationDate +
                ", product=" + product +
                ", user=" + user +
                '}';
    }
}
