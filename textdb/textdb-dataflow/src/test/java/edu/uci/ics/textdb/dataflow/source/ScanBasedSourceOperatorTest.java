/**
 * 
 */
package edu.uci.ics.textdb.dataflow.source;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.textdb.api.common.ITuple;
import edu.uci.ics.textdb.api.storage.IDataReader;
import edu.uci.ics.textdb.api.storage.IDataStore;
import edu.uci.ics.textdb.api.storage.IDataWriter;
import edu.uci.ics.textdb.common.constants.LuceneConstants;
import edu.uci.ics.textdb.common.constants.TestConstants;
import edu.uci.ics.textdb.common.exception.DataFlowException;
import edu.uci.ics.textdb.dataflow.utils.TestUtils;
import edu.uci.ics.textdb.storage.LuceneDataStore;
import edu.uci.ics.textdb.storage.reader.LuceneDataReader;
import edu.uci.ics.textdb.storage.writer.LuceneDataWriter;

/**
 * @author sandeepreddy602
 *
 */
public class ScanBasedSourceOperatorTest {
    
    private IDataWriter dataWriter;
    private ScanBasedSourceOperator scanBasedSourceOperator;
    private IDataReader dataReader;
    private IDataStore dataStore;
    private Analyzer analyzer;
    private Query query;
    
    @Before
    public void setUp() throws Exception{
        dataStore = new LuceneDataStore(LuceneConstants.INDEX_DIR, TestConstants.SCHEMA_PEOPLE);
        analyzer = new  StandardAnalyzer();
        dataWriter = new LuceneDataWriter(dataStore, analyzer );
        QueryParser queryParser = new QueryParser(
                TestConstants.ATTRIBUTES_PEOPLE[0].getFieldName(), analyzer);
        query = queryParser.parse(LuceneConstants.SCAN_QUERY);
        dataReader = new LuceneDataReader(dataStore, query);
        
        dataWriter.clearData();
        dataWriter.writeData(TestConstants.getSamplePeopleTuples());
        scanBasedSourceOperator = new ScanBasedSourceOperator(dataReader);
    }
    
    @After
    public void cleanUp() throws Exception{
        dataWriter.clearData();
    }
    
    @Test
    public void testFlow() throws DataFlowException, ParseException{
        List<ITuple> actualTuples = TestConstants.getSamplePeopleTuples();
        scanBasedSourceOperator.open();
        ITuple nextTuple = null;
        int numTuples = 0;
        List<ITuple> returnedTuples = new ArrayList<ITuple>();
        while((nextTuple  = scanBasedSourceOperator.getNextTuple()) != null){
        	returnedTuples.add(nextTuple);
            numTuples ++;
        }
        Assert.assertEquals(actualTuples.size(), numTuples);
        boolean contains = TestUtils.containsAllResults(actualTuples, returnedTuples);
		Assert.assertTrue(contains);
        scanBasedSourceOperator.close();
    }
    
}
