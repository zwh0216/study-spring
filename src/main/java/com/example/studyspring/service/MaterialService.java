package com.example.studyspring.service;

import com.example.studyspring.dao.MaterialDao;
import com.example.studyspring.dto.materialUpdateDto;
import com.example.studyspring.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialDao materialDao;

    public Material getMaterialById(String id) {
        return materialDao.findMaterialById(id);
    }

    public List<Material> getAllMaterial() {
        return materialDao.findAllMaterialById();
    }

    public int insertMaterial(materialUpdateDto material) {
        return materialDao.insertMaterial(material);
    }


    public int deleteMaterial(String id) {
        return materialDao.deleteMaterial(id);
    }

    public int updateMaterial(materialUpdateDto material){
        return materialDao.updateMaterial(material);
    }
}
