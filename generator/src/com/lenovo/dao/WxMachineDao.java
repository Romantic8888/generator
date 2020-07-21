package com.lenovo.dao;

import com.lenovo.pojo.po.WxMachine;
import com.lenovo.pojo.po.WxMachineQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxMachineDao {
    int countByExample(WxMachineQuery example);

    int deleteByExample(WxMachineQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(WxMachine record);

    int insertSelective(WxMachine record);

    List<WxMachine> selectByExample(WxMachineQuery example);

    WxMachine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxMachine record, @Param("example") WxMachineQuery example);

    int updateByExample(@Param("record") WxMachine record, @Param("example") WxMachineQuery example);

    int updateByPrimaryKeySelective(WxMachine record);

    int updateByPrimaryKey(WxMachine record);
}