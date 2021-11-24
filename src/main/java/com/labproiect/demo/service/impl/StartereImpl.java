package com.labproiect.demo.service.impl;

import com.labproiect.demo.service.StartereBusiness;
import com.labproiect.demo.view.StartereRepository;
import com.labproiect.demo.view.entity.StartereView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StartereImpl implements StartereBusiness {

    public final StartereRepository startereRepository;

    @Override
    public List<StartereView> getStartere() {
        return startereRepository.findAll();
    }
}
