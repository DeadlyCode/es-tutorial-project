package es.tutorial.repository;

import es.tutorial.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author star.lee
 */
@Repository
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {

    User findByName(String name, PageRequest pageRequest);

    @Override
    List<User> findAll();
}
