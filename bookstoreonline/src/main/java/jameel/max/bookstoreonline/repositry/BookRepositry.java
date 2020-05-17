package jameel.max.bookstoreonline.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jameel.max.bookstoreonline.entity.Book;


public interface BookRepositry extends JpaRepository<Book, Long> {

}
