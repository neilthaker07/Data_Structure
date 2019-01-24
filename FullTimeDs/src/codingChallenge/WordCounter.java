package codingChallenge;

import java.util.Comparator;

public class WordCounter {

	// Count all words consisting of only alphabetic chars, ignoring case, using parallel processing
	WordCounts wc = new WordCounter(path, (c) -> Character.isAlphabetic(c), (s) -> s.toLowerCase(), true).count();
	
	private WordCounts countPar() {
	    final WordCounts wc = new WordCounts(parLevel);
	    new ProducerConsumerExecutor<Path, String>(
	        (block) -> collectPaths(block),
	        (file, block) -> readFileToBlock(file, block),
	        (text) -> wc.add(countWords(text, pred, op)), parLevel).execute();
	    return wc;
	}
	
	
	public TopWordCounts findTop(int number, Comparator<Integer> comparator) {
	    return analyse(new FindTopAnalysis(number, comparator));
	}

	private <T> T analyse(Analysis<T> a) {
	    if (par) {
	        return new ForkJoinComputer<T>(wc.getSize(), THRESHOLD, a::compute, a::merge, parLevel).compute();
	    } else {
	        return a.compute(0, wc.getSize());
	    }
	}
	
	// Find the top 10 most used words in wc
	TopWordCounts twc = new WordCountAnalyzer(wc, true).findTop(10, (x, y) -> (y - x));
}


interface Computer<T> {
    T compute(int lo, int hi);
}
     
interface Merger<T> {
    T merge(T result1, T result2);
}

 interface Producer<T> {
    void produce(Block<T> block);
}
    
public interface Consumer<T> {
    void consume(T t);
}
    
public interface Mediator<T1, T2> {
    void mediate(T1 t, Block<T2> block);
}


interface Analysis<T> {
    T compute(int lo, int hi);
    T merge(T r1, T r2);
}


class WordCounts
{
	
}