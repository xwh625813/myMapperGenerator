package com.example.demo.mapper;

import com.example.demo.model.License;
import com.example.demo.model.LicenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LicenseMapper {
    long countByExample(LicenseExample example);

    int deleteByExample(LicenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(License record);

    int insertSelective(License record);

    List<License> selectByExample(LicenseExample example);

    License selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") License record, @Param("example") LicenseExample example);

    int updateByExample(@Param("record") License record, @Param("example") LicenseExample example);

    int updateByPrimaryKeySelective(License record);

    int updateByPrimaryKey(License record);
}