
/**
 * 在这里给出对类 Part1 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import edu.duke.*;
import java.io.File;

public class Part1 {
    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1)
        {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1){
            return "";
        }
        result = dna.substring(startIndex, stopIndex+3);
        return result;
    }
    
    public void testFindGeneSimple(){
        //String dna = "AATGCGTAATATGGT";
        String dna = "";
        System.out.println("DNA started is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}

