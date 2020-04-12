package in.vasudev.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.vasudev.onlinebookstore.entity.BookCategory;
@RepositoryRestResource(collectionResourceRel="bookCategorie",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
