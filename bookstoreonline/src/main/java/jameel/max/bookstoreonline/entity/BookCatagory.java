package jameel.max.bookstoreonline.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "tbl_category")
public class BookCatagory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String CategoryName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Book> books;

}
