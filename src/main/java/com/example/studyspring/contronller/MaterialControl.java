package com.example.studyspring.contronller;

import com.example.studyspring.dto.materialUpdateDto;
import com.example.studyspring.model.Material;
import com.example.studyspring.model.Result;
import com.example.studyspring.service.MaterialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/material")
public class MaterialControl {

    @Autowired
    MaterialService materialService;

    // 查询所有
    @RequestMapping(path="/query", method=RequestMethod.GET)
    public Result<List<Material>> queryMaterial () {
        List<Material> materialList = materialService.getAllMaterial();
        return new Result<>(200, "查询成功", materialList);
    }

    // 新增单条数据
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Result addMaterial(@Valid @RequestBody materialUpdateDto material) {
        try {
            materialService.insertMaterial(material);
            return new Result<>(200, "新增成功");
        } catch(Error err) {
            return  new Result<>(500, "新增失败");
        }
    }

    // 删除单条数据
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public Result deleteMaterial(@PathVariable("id") String id) {
        try {
            materialService.deleteMaterial(id);
            return new Result<>(200, "删除成功");
        } catch(Error err) {
            return  new Result<>(500, "删除失败");
        }
    }

    // 删除单条数据
    @RequestMapping(path = "/update/{id}", method = RequestMethod.POST)
    public Result updateMaterial(@Valid @RequestBody materialUpdateDto material) {
        try {
            materialService.updateMaterial(material);
            return new Result<>(200, "更新成功");
        } catch(Error err) {
            return  new Result<>(500, "更新失败");
        }
    }
}
