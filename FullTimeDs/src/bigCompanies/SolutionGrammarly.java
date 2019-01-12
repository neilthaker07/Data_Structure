package bigCompanies;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionGrammarly {

    static abstract class LimitedBufferBase<T> {
        private final int maxSize;

        public LimitedBufferBase(int maxSize) {

            if (maxSize <= 0) {
                throw new IllegalArgumentException("Maximum buffer size cannot be 0");
            }

            this.maxSize = maxSize;
        }

        public int getMaxSize() {
            return maxSize;
        }

        /**
         * Appends the element to the back of the buffer, if limit is reached removes the first one
         *
         * @param entry new element
         */
        public abstract void append(T entry);

        /**
         * Removes the first element from the buffer
         *
         * @return first element
         */
        public abstract T pop() throws IndexOutOfBoundsException;

        /**
         * Returns the 'index' element from the beginning of the buffer
         *
         * @param index offset from the beginning
         * @return element found
         * @throws IndexOutOfBoundsException if out of range
         */
        public abstract T get(int index) throws IndexOutOfBoundsException;

        /**
         * Returns the first element from the buffer
         *
         * @return first element
         * @throws IndexOutOfBoundsException if empty
         */
        public abstract T getFirst() throws IndexOutOfBoundsException;

        /**
         * Returns the last element from the buffer
         *
         * @return last element
         * @throws IndexOutOfBoundsException if empty
         */
        public abstract T getLast() throws IndexOutOfBoundsException;

        /**
         * Get the size of the buffer
         *
         * @return number of elements
         */
        public abstract int size();
    }

    public static class LimitedBuffer<T> extends LimitedBufferBase<T> {
            //int maxSize = 0;
            
            public LimitedBuffer(int maxSize) {
                super(maxSize);
                // ctor stub
            }
            int pos = 0;
            java.util.LinkedHashMap<Integer, T> map = new java.util.LinkedHashMap<Integer, T>();
            public int size()
            {
                return map.size();
            }

            public void append(T entry)
            {
                if(map.size()==getMaxSize())
                {
                    java.util.Map.Entry<Integer, T> mapEntry = map.entrySet().iterator().next();
                    map.remove(mapEntry.getKey());
                }
                map.put(pos, entry);
                pos++;
            }

            public T pop() throws IndexOutOfBoundsException
            {
                if(map.size()==0)
                {
                    throw new IndexOutOfBoundsException();
                }
                java.util.Map.Entry<Integer, T> mapEntry = map.entrySet().iterator().next();
                map.remove(mapEntry.getKey());
                return mapEntry.getValue();
            }

            public T get(int index) throws IndexOutOfBoundsException
            {
                if(index>=map.size())
                {
                    throw new IndexOutOfBoundsException();
                }
                return map.get(index);
            }

            public T getFirst() throws IndexOutOfBoundsException
            {
                if(map.size()==0)
                {
                    throw new IndexOutOfBoundsException();
                }
                return map.get(0);
            }

            public T getLast() throws IndexOutOfBoundsException 
            {
                if (map.size()==0) 
                {
                    throw new IndexOutOfBoundsException();
                }
                int temp=pos-1;
                return map.get(temp);
            }



}

    public static void main(String args[]) throws Exception {
        final Scanner in = new Scanner(System.in);
        final int maxSize = in.nextInt();
        final int dataLength = in.nextInt();

        final LimitedBufferBase<String> testBuffer = new LimitedBuffer<>(maxSize);

        for (int i = 0; i < dataLength; i++) {
            testBuffer.append(in.next());
        }

        System.out.println(testBuffer.size());

        while (testBuffer.size() > 0) {
            System.out.println(testBuffer.pop());
        }

    }
}