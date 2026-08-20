package com.example.studyspring.dao;

import com.example.studyspring.dto.MaterialUpdateDto;
import com.example.studyspring.model.Material;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MaterialDao {
    @Select("SELECT * FROM raw_material WHERE id = #{id}")
    Material findMaterialById(String id);

    @Select("SELECT * FROM raw_material")
    List<Material> findAllMaterialById();

    @Insert("INSERT INTO raw_material (id, name, `key`) VALUES(#{id}, #{name}, #{key})")
    int insertMaterial(MaterialUpdateDto material);

    @Delete("DELETE FROM raw_material WHERE id = #{id}")
    int deleteMaterial(String id);

    @Update("UPDATE raw_material SET name = #{name} WHERE id = #{id} ")
    int updateMaterial(MaterialUpdateDto material);

}
