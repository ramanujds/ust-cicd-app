package com.ust.app.api;

import com.ust.app.dto.CompanyInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {

    @GetMapping
    public CompanyInfo getCompanyInfo() {
        return new CompanyInfo("UST Global", "Trivandrum", "Digital Transformation");
    }

}
