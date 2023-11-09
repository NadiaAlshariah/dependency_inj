package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComplexAlgorithm {
    private  SortAlgorithm sortAlgorithm;
    @Autowired
    public ComplexAlgorithm(@Qualifier("quickSortAlgorithm") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
}
