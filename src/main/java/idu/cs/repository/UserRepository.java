package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.entity.UserEntity;

@Repository
public interface UserRepository 
	extends JpaRepository<UserEntity, Long> {
	//findById, save, delete같은거는 선언없이도 구현가능
	
	//아래 메소드들은 선언해야 JPA 규칙에 의해 구현됨
	//find - select문, by - where, OrderBy - order by, ASC와 DESC를 함께 사용
	List<UserEntity> findByName(String name);
	
	//id 내림차순 소팅↓
	//List<UserEntity> findByNameOrderByIdDESC(String name);
	List<UserEntity> findByCompany(String company);
	
	UserEntity findByUserId(String userId);
	//ByUserId== where userid='' 과 비슷
}
