package boot.dao;

import boot.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentDao {

  void insert(Student student);

  @Select("SELECT * FROM student WHERE id=#{id}")
  Student getById(Long id);

  @Delete("DELETE FROM student WHERE id=#{id}")
   void deleteById(Long id);

  @Update("UPDATE student SET grades=#{grades} WHERE id=#{id};")
  void updateGrades(Long id,Double grades);
}
