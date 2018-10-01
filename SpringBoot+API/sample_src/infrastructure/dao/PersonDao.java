package vn.fujinet.sample.infrastructure.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import vn.fujinet.sample.infrastructure.entity.PersonEntity;

@ConfigAutowireable
@Dao
public interface PersonDao {
	@Select
	List<PersonEntity> selectAll();
}
