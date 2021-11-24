package com.labproiect.demo.view;

import com.labproiect.demo.view.entity.RezervariView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RezervariRepository extends JpaRepository<RezervariView, Long> {

}
