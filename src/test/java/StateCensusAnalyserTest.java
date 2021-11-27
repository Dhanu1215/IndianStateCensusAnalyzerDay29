import com.blp.indiancensusanalyzer.StateCensusAnalyzer;
import com.blp.indiancensusanalyzer.StateCensusException;
import org.junit.Assert;
import org.junit.Test;


public class StateCensusAnalyserTest {

    String filePath = "C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29\\src\\main\\resources\\IndianStateCensusData.csv";
    @Test
    public void givenStateCensusRecordShouldReturnNumberOfRecords() {
        StateCensusAnalyzer obj = new StateCensusAnalyzer();
        try {
            int countRecords = obj.readCensusFile(filePath);
            Assert.assertEquals(29, countRecords);
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenIncorrectFileFormatShouldReturnCustomException() {
        StateCensusAnalyzer obj = new StateCensusAnalyzer();
        try {
            int countRecords = StateCensusAnalyzer.readCensusFile("C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29\\src\\main\\resources\\IndianStateCensusData.csv");
            Assert.assertEquals("ExceptionType.INVALID_FORMAT:Invalid File Format", countRecords);
        } catch (StateCensusException e) {
        }
    }

    @Test
    public void givenIncorrectFileTypeShouldReturnCustomException() {
        StateCensusAnalyzer obj = new StateCensusAnalyzer();
        try {
            int countRecords = obj.readCensusFile("C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29\\src\\main\\resources\\IndianStateCensusData.csv");
            Assert.assertEquals("ExceptionType.INVALID_FORMAT:Invalid File Format", countRecords);
        } catch (StateCensusException e) {
        }
    }

    @Test
    public void givenCorrectFileTypeButIncorrectDelimterShouldReturnCustomException() {
        StateCensusAnalyzer obj = new StateCensusAnalyzer();
        try {
            int countRecords = obj.readCensusFile("C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29\\src\\main\\resources\\IndianStateCensusData.csv");
            Assert.assertEquals("ExceptionType.INVALID_FORMAT:Invalid File Format", countRecords);
        } catch (StateCensusException e) {
        }
    }

    @Test
    public void givenCorrectFileTypeButIncorrectHeaderShouldReturnCustomException() {
        StateCensusAnalyzer obj = new StateCensusAnalyzer();
        try {
            String[] header = {"State", "Population", "AreaInSqKm", "DensityPerSqKm"};
            boolean checkHeader = obj.readHeader("C:\\Users\\praja\\IdeaProjects\\IndianStateCensusAnalyzerDay29\\src\\main\\resources\\IndianStateCensusData.csv", header);
            Assert.assertTrue(checkHeader);

        } catch (StateCensusException e) {
        }
    }

}
