package entity;

import javax.persistence.*;


@Entity
@Table(name = "CATEGORIES")
public class Category {

    @SequenceGenerator(name = "generator", sequenceName = "category_id_seq")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "breakdown")
    private Long breakdown;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_super_category")
    private Category superCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Long breakdown) {
        this.breakdown = breakdown;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breakdown=" + breakdown +
                ", superCategory=" + superCategory +
                '}';
    }
}
