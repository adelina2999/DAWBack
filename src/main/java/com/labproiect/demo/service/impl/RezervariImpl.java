package com.labproiect.demo.service.impl;

import com.labproiect.demo.service.RezervariBusiness;
import com.labproiect.demo.view.RezervariRepository;
import com.labproiect.demo.view.entity.RezervariView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervariImpl implements RezervariBusiness {

    public final RezervariRepository rezervariRepository;

    @Override
    public RezervariView postRezervari(RezervariView rezervariView) {

        return rezervariRepository.save(rezervariView);
    }
}
