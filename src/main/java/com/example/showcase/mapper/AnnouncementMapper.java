package com.example.showcase.mapper;

import com.example.showcase.model.Announcement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnnouncementMapper {
    @Select("SELECT * FROM Announcements")
    List<Announcement> findAll();
}
