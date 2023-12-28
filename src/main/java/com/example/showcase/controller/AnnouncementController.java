package com.example.showcase.controller;

import com.example.showcase.mapper.AnnouncementMapper;
import com.example.showcase.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {

    @Autowired
    private AnnouncementMapper announcementMapper;

    @GetMapping
    public List<Announcement> getAll() {
        return announcementMapper.findAll();
    }
}