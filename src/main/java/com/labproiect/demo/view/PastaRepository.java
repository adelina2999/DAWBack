package com.labproiect.demo.view;

import com.labproiect.demo.view.entity.PastaView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastaRepository extends JpaRepository<PastaView, Long> {

}
