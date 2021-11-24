package com.blp.indiancensusanalyzer;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Indian State Census Analyzer Problem
 */
public class StateCensusAnalyzer {

    public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyzerException{
        try {
            Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29"))
            CsvToBeanBuilder.withType(IndianCensusCSV.class);
        } catch (IOException e) {
           throw new CensusAnalyzerException(e.getMessage());
        }
    }
}
