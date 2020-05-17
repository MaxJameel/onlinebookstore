package jameel.max.bookstoreonline.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jameel.max.bookstoreonline.entity.BookCatagory;

@RepositoryRestResource(collectionResourceRel="bookCategory" , path="book-category")
public interface BookCategoryRepositry extends JpaRepository<BookCatagory, Long> {

}
