package com.example.studyspring.service;

import com.example.studyspring.mapper.MaterialMapper;
import com.example.studyspring.dto.MaterialUpdateDto;
import com.example.studyspring.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    public Material getMaterialById(Integer id) {
        return materialMapper.findMaterialById(id);
    }

    public List<Material> getAllMaterial() {
        return materialMapper.findAllMaterialById();
    }

    public int insertMaterial(MaterialUpdateDto material) {
        return materialMapper.insertMaterial(material);
    }


    public int deleteMaterial(Integer id) {
        return materialMapper.deleteMaterial(id);
    }

    public int updateMaterial(MaterialUpdateDto material){
        return materialMapper.updateMaterial(material);
    }
}
