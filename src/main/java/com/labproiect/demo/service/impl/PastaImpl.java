package com.labproiect.demo.service.impl;

import com.labproiect.demo.service.PastaBusiness;
import com.labproiect.demo.view.PastaRepository;
import com.labproiect.demo.view.entity.PastaView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PastaImpl implements PastaBusiness {

    public final PastaRepository pastaRepository;

    @Override
    public List<PastaView> getPasta() {
        return pastaRepository.findAll();
    }
}
