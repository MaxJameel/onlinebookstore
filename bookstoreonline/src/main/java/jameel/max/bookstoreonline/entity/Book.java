package jameel.max.bookstoreonline.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "tbl_book")

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String sku;
	private String name;
	private String description;
	private BigDecimal unit_price;
	private String image_url;
	private boolean active;

	@Column(name = "units_in_stock")
	private int unit_stock;
	private Date date_created;
	private Date last_updated;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCatagory category;

}
