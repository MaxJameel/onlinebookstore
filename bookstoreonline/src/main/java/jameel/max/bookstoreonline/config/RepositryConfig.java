package jameel.max.bookstoreonline.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import jameel.max.bookstoreonline.entity.Book;
import jameel.max.bookstoreonline.entity.BookCatagory;

@Configuration
public class RepositryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.exposeIdsFor(Book.class);
		config.exposeIdsFor(BookCatagory.class);
	}
}
