/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

/**
 *
 * @author LENOVO
 */
import org.springframework.beans.factory.annotation.Autowired;
//import sequence.Sequence;
import org.springframework.stereotype.Component;


@Component
public class SequenceService {
    
    @Autowired
    private SequenceDao sequenceDao;
    
    public void setSequenceDao(SequenceDao sequenceDao){
        this.sequenceDao=sequenceDao;
    }
    
    public String generate(String sequenceId){
        Sequence sequence=sequenceDao.getSequence(sequenceId);
        int value=sequenceDao.getNextValue(sequenceId);
        return sequence.getPrefix() + value + sequence.getSuffix();
    }
}
