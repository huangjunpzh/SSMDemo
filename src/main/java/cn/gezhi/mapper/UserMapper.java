package cn.gezhi.mapper;

import cn.gezhi.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectById(Integer id);
}